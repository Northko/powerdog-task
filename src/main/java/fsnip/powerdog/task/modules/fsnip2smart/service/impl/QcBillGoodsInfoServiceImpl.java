package fsnip.powerdog.task.modules.fsnip2smart.service.impl;

import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.fsnip2smart.dao.QcBillGoodsInfoDao;
import fsnip.powerdog.task.modules.fsnip2smart.entity.QcBillGoodsInfo;
import fsnip.powerdog.task.modules.fsnip2smart.service.QcBillGoodsInfoService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 快检检测样品Service实现
 * @Author: kun.tan
 * @DateTime: 2018-07-13 10:53
 */
@Service
public class QcBillGoodsInfoServiceImpl extends BaseServiceImpl<QcBillGoodsInfoDao, QcBillGoodsInfo> implements QcBillGoodsInfoService {

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    public List<QcBillGoodsInfo> selectBatchIds(Collection<? extends Serializable> idList) {
        return super.selectBatchIds(idList);
    }
}
