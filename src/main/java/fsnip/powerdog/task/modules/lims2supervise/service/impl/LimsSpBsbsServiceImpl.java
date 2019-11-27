package fsnip.powerdog.task.modules.lims2supervise.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.toolkit.CollectionUtils;
import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.lims2supervise.dao.LimsSpBsbsDao;
import fsnip.powerdog.task.modules.lims2supervise.entity.LimsSpBsbs;
import fsnip.powerdog.task.modules.lims2supervise.entity.SuperviseSpBsbs;
import fsnip.powerdog.task.modules.lims2supervise.service.LimsSpBsbsService;
import fsnip.powerdog.task.modules.lims2supervise.service.SuperviseSpBsbsService;
import org.apache.commons.lang.StringUtils;
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
 * @dateTime: 2018-12-19 17:46
 */
@Service
public class LimsSpBsbsServiceImpl extends BaseServiceImpl<LimsSpBsbsDao, LimsSpBsbs> implements LimsSpBsbsService {

    @Autowired
    private SuperviseSpBsbsService superviseSpBsbsService;

    @Override
    @DataSource(name = DataSourceNames.FIVE)
    public List<LimsSpBsbs> queryFromSource(EntityWrapper<LimsSpBsbs> wrapper) {
        return super.queryFromSource(wrapper);
    }

    @Override
    @DataSource(name = DataSourceNames.FIVE)
    public List<LimsSpBsbs> queryFromSourceForLims(EntityWrapper<LimsSpBsbs> wrapper) {
        return super.queryFromSourceForLims(wrapper);
    }

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    public boolean insert2Target(List<LimsSpBsbs> beans) {
        ArrayList<SuperviseSpBsbs> list = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(beans)) {
            beans.stream().forEach(e -> {
                SuperviseSpBsbs spBsbs = new SuperviseSpBsbs();
                BeanUtils.copyProperties(e, spBsbs);
                list.add(spBsbs);
            });
        }
        return superviseSpBsbsService.insert2Target(list);
    }

    @Override
    protected boolean whether2UpdateStatus() {
        return true;
    }

    @Override
    @DataSource(name = DataSourceNames.FIVE)
    public LimsSpBsbs queryBySampleNo(String sampleNo) {
        if (StringUtils.isBlank(sampleNo)) {
            return null;
        }
        return selectOne(new EntityWrapper<LimsSpBsbs>().eq("sp_s_16", sampleNo));
    }
}
