package fsnip.powerdog.task.modules.fsnip2smart.service.impl;

import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.fsnip2smart.dao.DcBillQuickCheckInfoDao;
import fsnip.powerdog.task.modules.fsnip2smart.entity.DcBillQuickCheckInfo;
import fsnip.powerdog.task.modules.fsnip2smart.service.DcBillQuickCheckInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 快检信息Service实现
 * @Author: kun.tan
 * @DateTime: 2018-07-13 10:56
 */
@Service
public class DcBillQuickCheckInfoServiceImpl extends BaseServiceImpl<DcBillQuickCheckInfoDao, DcBillQuickCheckInfo> implements DcBillQuickCheckInfoService {

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public boolean insert2Target(List<DcBillQuickCheckInfo> beans) {
        return super.insert2Target(beans);
    }
}
