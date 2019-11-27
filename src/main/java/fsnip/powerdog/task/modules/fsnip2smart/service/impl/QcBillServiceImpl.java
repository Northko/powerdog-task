package fsnip.powerdog.task.modules.fsnip2smart.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.toolkit.CollectionUtils;
import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.fsnip2smart.dao.QcBillDao;
import fsnip.powerdog.task.modules.fsnip2smart.entity.*;
import fsnip.powerdog.task.modules.fsnip2smart.service.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 快检单Service实现
 * @Author: kun.tan
 * @DateTime: 2018-07-13 10:44
 */
@Service
public class QcBillServiceImpl extends BaseServiceImpl<QcBillDao, QcBill> implements QcBillService {

    @Autowired
    private DcBillService dcBillService;
    @Autowired
    private QcBillQuickCheckInfoService qcBillQuickCheckInfoService;
    @Autowired
    private QcBillCheckedPersonService qcBillCheckedPersonService;
    @Autowired
    private QcBillGoodsInfoService qcBillGoodsInfoService;
    @Autowired
    private QcBillCheckItemService qcBillCheckItemService;
    @Autowired
    private DcBillQuickCheckInfoService dcBillQuickCheckInfoService;
    @Autowired
    private DcBillCheckedPersonService dcBillCheckedPersonService;
    @Autowired
    private DcBillGoodsInfoService dcBillGoodsInfoService;
    @Autowired
    private DcBillCheckItemService dcBillCheckItemService;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    public List<QcBill> queryFromSource(Date startTime, Date endTime) {
        return selectList(new EntityWrapper<QcBill>()
                .between("RECORD_INSERT_TIME", sdf.format(startTime), sdf.format(endTime))
                .like("create_orgcode", "5201%")

        );
    }

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public boolean insert2Target(List<QcBill> beans) {
        if (CollectionUtils.isNotEmpty(beans)) {
            List<DcBill> dcBills = new ArrayList<>();
            List<String> checkedPersonUuids = new ArrayList<>();
            List<String> goodsUuids = new ArrayList<>();
            List<String> checkinfoUuids = new ArrayList<>();
            beans.forEach(bean -> {
                checkedPersonUuids.add(bean.getCheckedpersonUuid());
                goodsUuids.add(bean.getGoodsUuid());
                checkinfoUuids.add(bean.getQuickcheckinfoUuid());
                DcBill dcBill = new DcBill();
                BeanUtils.copyProperties(bean, dcBill);
                dcBills.add(dcBill);
            });
            List<QcBillQuickCheckInfo> qcBillQuickCheckInfos = qcBillQuickCheckInfoService.selectBatchIds(checkinfoUuids);
            List<QcBillCheckedPerson> qcBillCheckedPeople = qcBillCheckedPersonService.selectBatchIds(checkedPersonUuids);
            List<QcBillGoodsInfo> qcBillGoodsInfos = qcBillGoodsInfoService.selectBatchIds(goodsUuids);
            List<QcBillCheckItem> qcBillCheckItems = qcBillCheckItemService.selectList(new EntityWrapper<QcBillCheckItem>().in("quickcheckinfo_uuid", checkinfoUuids.toArray()));
            List<DcBillCheckedPerson> dcBillCheckedPeople = new ArrayList<>();
            List<DcBillCheckItem> dcBillCheckItems = new ArrayList<>();
            List<DcBillGoodsInfo> dcBillGoodsInfos = new ArrayList<>();
            List<DcBillQuickCheckInfo> dcBillQuickCheckInfos = new ArrayList<>();
            qcBillGoodsInfos.forEach(bean -> {
                DcBillGoodsInfo billGoodsInfo = new DcBillGoodsInfo();
                BeanUtils.copyProperties(bean, billGoodsInfo);
                dcBillGoodsInfos.add(billGoodsInfo);
            });
            qcBillCheckedPeople.forEach(bean -> {
                DcBillCheckedPerson billCheckedPerson = new DcBillCheckedPerson();
                BeanUtils.copyProperties(bean, billCheckedPerson);
                dcBillCheckedPeople.add(billCheckedPerson);
            });
            qcBillCheckItems.forEach(bean -> {
                DcBillCheckItem billCheckItem = new DcBillCheckItem();
                BeanUtils.copyProperties(bean, billCheckItem);
                dcBillCheckItems.add(billCheckItem);
            });
            qcBillQuickCheckInfos.forEach(bean -> {
                DcBillQuickCheckInfo billQuickCheckInfo = new DcBillQuickCheckInfo();
                BeanUtils.copyProperties(bean, billQuickCheckInfo);
                dcBillQuickCheckInfos.add(billQuickCheckInfo);
            });
            dcBillCheckedPersonService.insert2Target(dcBillCheckedPeople);
            dcBillCheckItemService.insert2Target(dcBillCheckItems);
            dcBillGoodsInfoService.insert2Target(dcBillGoodsInfos);
            dcBillQuickCheckInfoService.insert2Target(dcBillQuickCheckInfos);
            return dcBillService.insert2Target(dcBills);
        }
        return true;
    }
}
