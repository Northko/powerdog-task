package fsnip.powerdog.task.modules.smart2fsnip.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.toolkit.CollectionUtils;
import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.smart2fsnip.dao.FsnipJgXckfjlDao;
import fsnip.powerdog.task.modules.smart2fsnip.entity.FsnipJgXckfjl;
import fsnip.powerdog.task.modules.smart2fsnip.entity.JgXckfjl;
import fsnip.powerdog.task.modules.smart2fsnip.service.FsnipJgXckfjlService;
import fsnip.powerdog.task.modules.smart2fsnip.service.JgXckfjlService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: kun.tan
 * @dateTime: 2018-12-08 11:40
 */
@Service
public class FsnipJgXckfjlServiceImpl extends BaseServiceImpl<FsnipJgXckfjlDao, FsnipJgXckfjl> implements FsnipJgXckfjlService {

    @Autowired
    private JgXckfjlService jgXckfjlService;

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public List<FsnipJgXckfjl> queryFromSource(EntityWrapper<FsnipJgXckfjl> wrapper) {
        return super.queryFromSource(wrapper);
    }

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    @Transactional(rollbackFor = Exception.class)
    public boolean insert2Target(List<FsnipJgXckfjl> beans) {
        if (CollectionUtils.isNotEmpty(beans)) {
            List<JgXckfjl> jgXckfjls = beans.stream().map(e -> {
                JgXckfjl jgXckfjl = new JgXckfjl();
                BeanUtils.copyProperties(e, jgXckfjl);
                return jgXckfjl;
            }).collect(Collectors.toList());
            jgXckfjlService.insert2Target(jgXckfjls);
        }
        return true;
    }

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public boolean updateStatus(List<FsnipJgXckfjl> xckfjls) {
        return super.updateStatus(xckfjls);
    }

    @Override
    protected boolean whether2UpdateStatus() {
        return true;
    }
}
