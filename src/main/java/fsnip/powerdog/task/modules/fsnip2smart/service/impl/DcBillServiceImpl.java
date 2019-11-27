package fsnip.powerdog.task.modules.fsnip2smart.service.impl;

import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.fsnip2smart.dao.DcBillDao;
import fsnip.powerdog.task.modules.fsnip2smart.entity.DcBill;
import fsnip.powerdog.task.modules.fsnip2smart.service.DcBillService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 快检单Service实现
 * @Author: kun.tan
 * @DateTime: 2018-07-13 10:44
 */
@Service
public class DcBillServiceImpl extends BaseServiceImpl<DcBillDao, DcBill> implements DcBillService {

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public boolean insert2Target(List<DcBill> beans) {
        return super.insert2Target(beans);
    }
}
