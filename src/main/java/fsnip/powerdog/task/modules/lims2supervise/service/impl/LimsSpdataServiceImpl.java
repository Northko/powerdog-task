package fsnip.powerdog.task.modules.lims2supervise.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.toolkit.CollectionUtils;
import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.lims2supervise.dao.LimsSpdataDao;
import fsnip.powerdog.task.modules.lims2supervise.entity.LimsSpdata;
import fsnip.powerdog.task.modules.lims2supervise.entity.SuperviseSpdata;
import fsnip.powerdog.task.modules.lims2supervise.service.LimsSpdataService;
import fsnip.powerdog.task.modules.lims2supervise.service.SuperviseSpdataService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: kun.tan
 * @dateTime: 2018-12-19 17:44
 */
@Service
public class LimsSpdataServiceImpl extends BaseServiceImpl<LimsSpdataDao, LimsSpdata> implements LimsSpdataService {

    @Autowired
    private SuperviseSpdataService spdataService;

    @Override
    @DataSource(name = DataSourceNames.FIVE)
    public List<LimsSpdata> queryFromSource(EntityWrapper<LimsSpdata> wrapper) {
        return super.queryFromSource(wrapper);
    }
    @Override
    @DataSource(name = DataSourceNames.FIVE)
    public List<LimsSpdata> queryFromSourceForLims(EntityWrapper<LimsSpdata> wrapper) {
        return super.queryFromSourceForLims(wrapper);
    }
    @Override
    @DataSource(name = DataSourceNames.SECOND)
    public boolean insert2Target(List<LimsSpdata> beans) {
        List<SuperviseSpdata> list = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(beans)) {
            beans.stream().forEach(e -> {
                SuperviseSpdata spdata = new SuperviseSpdata();
                BeanUtils.copyProperties(e, spdata);
                list.add(spdata);
            });
        }
        return spdataService.insert2Target(list);
    }

    @Override
    protected boolean whether2UpdateStatus() {
        return true;
    }
}
