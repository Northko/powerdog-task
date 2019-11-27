package fsnip.powerdog.task.modules.fsnip2smart.service.impl;

import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.fsnip2smart.dao.DcBillCheckItemDao;
import fsnip.powerdog.task.modules.fsnip2smart.entity.DcBillCheckItem;
import fsnip.powerdog.task.modules.fsnip2smart.service.DcBillCheckItemService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 快检检测项目Service实现
 * @Author: kun.tan
 * @DateTime: 2018-07-13 10:50
 */
@Service
public class DcBillCheckItemServiceImpl extends BaseServiceImpl<DcBillCheckItemDao, DcBillCheckItem> implements DcBillCheckItemService {

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public boolean insert2Target(List<DcBillCheckItem> beans) {
        return super.insert2Target(beans);
    }
}
