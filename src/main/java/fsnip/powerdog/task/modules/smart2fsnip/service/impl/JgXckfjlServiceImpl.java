package fsnip.powerdog.task.modules.smart2fsnip.service.impl;

import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.smart2fsnip.dao.JgXckfjlDao;
import fsnip.powerdog.task.modules.smart2fsnip.entity.JgXckfjl;
import fsnip.powerdog.task.modules.smart2fsnip.service.JgXckfjlService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: kun.tan
 * @dateTime: 2018-12-08 11:40
 */
@Service
public class JgXckfjlServiceImpl extends BaseServiceImpl<JgXckfjlDao, JgXckfjl> implements JgXckfjlService {

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    @Transactional(rollbackFor = Exception.class)
    public boolean insert2Target(List<JgXckfjl> beans) {
        return super.insert2Target(beans);
    }
}
