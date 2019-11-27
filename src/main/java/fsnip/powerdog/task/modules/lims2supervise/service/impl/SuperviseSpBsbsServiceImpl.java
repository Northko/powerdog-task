package fsnip.powerdog.task.modules.lims2supervise.service.impl;

import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.lims2supervise.dao.SuperviseSpBsbsDao;
import fsnip.powerdog.task.modules.lims2supervise.entity.SuperviseSpBsbs;
import fsnip.powerdog.task.modules.lims2supervise.service.SuperviseSpBsbsService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: kun.tan
 * @dateTime: 2018-12-19 17:46
 */
@Service
public class SuperviseSpBsbsServiceImpl extends BaseServiceImpl<SuperviseSpBsbsDao, SuperviseSpBsbs> implements SuperviseSpBsbsService {

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    public boolean insert2Target(List<SuperviseSpBsbs> beans) {
        return super.insert2Target(beans);
    }
}
