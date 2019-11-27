package fsnip.powerdog.task.modules.fsnip2smart.service.impl;

import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.fsnip2smart.dao.DcBillCheckedPersonDao;
import fsnip.powerdog.task.modules.fsnip2smart.entity.DcBillCheckedPerson;
import fsnip.powerdog.task.modules.fsnip2smart.service.DcBillCheckedPersonService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 快检被检测单位Service实现
 * @Author: kun.tan
 * @DateTime: 2018-07-13 10:42
 */
@Service
public class DcBillCheckedPersonServiceImpl extends BaseServiceImpl<DcBillCheckedPersonDao, DcBillCheckedPerson> implements DcBillCheckedPersonService {

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public boolean insert2Target(List<DcBillCheckedPerson> beans) {
        return super.insert2Target(beans);
    }
}
