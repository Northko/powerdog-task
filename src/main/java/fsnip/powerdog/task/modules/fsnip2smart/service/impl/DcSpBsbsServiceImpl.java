package fsnip.powerdog.task.modules.fsnip2smart.service.impl;

import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.fsnip2smart.dao.DcSpBsbsDao;
import fsnip.powerdog.task.modules.fsnip2smart.entity.DcSpBsbs;
import fsnip.powerdog.task.modules.fsnip2smart.service.DcSpBsbsService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 抽检数据service实现
 * @Author: kun.tan
 * @DateTime: 2018-07-13 11:23
 */
@Service
public class DcSpBsbsServiceImpl extends BaseServiceImpl<DcSpBsbsDao, DcSpBsbs> implements DcSpBsbsService {

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    public List<DcSpBsbs> queryFromSource(Date startTime, Date endTime) {
        return super.queryFromSource(startTime, endTime);
    }

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public boolean insert2Target(List<DcSpBsbs> beans) {
        return super.insert2Target(beans);
    }
}
