package fsnip.powerdog.task.modules.fsnip2smart.service.impl;

import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.fsnip2smart.dao.DcSpDataDao;
import fsnip.powerdog.task.modules.fsnip2smart.entity.DcSpData;
import fsnip.powerdog.task.modules.fsnip2smart.service.DcSpDataService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 抽检数据检查记录Service实现
 * @Author: kun.tan
 * @DateTime: 2018-07-13 11:25
 */
@Service
public class DcSpDataServiceImpl extends BaseServiceImpl<DcSpDataDao, DcSpData> implements DcSpDataService {

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    public List<DcSpData> queryFromSource(Date startTime, Date endTime) {
        return super.queryFromSource(startTime, endTime);
    }

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public boolean insert2Target(List<DcSpData> beans) {
        return super.insert2Target(beans);
    }
}
