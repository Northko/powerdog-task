package fsnip.powerdog.task.modules.fsnip2smart.service.impl;

import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.fsnip2smart.dao.DcBillGoodsInfoDao;
import fsnip.powerdog.task.modules.fsnip2smart.entity.DcBillGoodsInfo;
import fsnip.powerdog.task.modules.fsnip2smart.service.DcBillGoodsInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 快检检测样品Service实现
 * @Author: kun.tan
 * @DateTime: 2018-07-13 10:53
 */
@Service
public class DcBillGoodsInfoServiceImpl extends BaseServiceImpl<DcBillGoodsInfoDao, DcBillGoodsInfo> implements DcBillGoodsInfoService {

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public boolean insert2Target(List<DcBillGoodsInfo> beans) {
        return super.insert2Target(beans);
    }
}
