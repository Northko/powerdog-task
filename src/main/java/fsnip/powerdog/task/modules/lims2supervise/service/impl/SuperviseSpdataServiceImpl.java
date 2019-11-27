package fsnip.powerdog.task.modules.lims2supervise.service.impl;

import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.lims2supervise.dao.SuperviseSpdataDao;
import fsnip.powerdog.task.modules.lims2supervise.entity.SuperviseSpdata;
import fsnip.powerdog.task.modules.lims2supervise.service.SuperviseSpdataService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: kun.tan
 * @dateTime: 2018-12-19 17:44
 */
@Service
public class SuperviseSpdataServiceImpl extends BaseServiceImpl<SuperviseSpdataDao, SuperviseSpdata> implements SuperviseSpdataService {

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    public boolean insert2Target(List<SuperviseSpdata> beans) {
        return super.insert2Target(beans);
    }
}
