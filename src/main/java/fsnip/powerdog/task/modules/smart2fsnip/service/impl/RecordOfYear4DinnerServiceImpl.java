package fsnip.powerdog.task.modules.smart2fsnip.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.common.utils.OrgCodeTranslateUtils;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.smart2fsnip.dao.RecordOfYear4DinnerDao;
import fsnip.powerdog.task.modules.smart2fsnip.entity.RecordOfYear4Dinner;
import fsnip.powerdog.task.modules.smart2fsnip.service.RecordOfYear4DinnerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 年夜饭备案Service实现
 * @Author: kun.tan
 * @DateTime: 2018-07-12 16:07
 */
@Service
public class RecordOfYear4DinnerServiceImpl extends BaseServiceImpl<RecordOfYear4DinnerDao, RecordOfYear4Dinner> implements RecordOfYear4DinnerService {

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public List<RecordOfYear4Dinner> queryFromSource(EntityWrapper<RecordOfYear4Dinner> wrapper) {
        return super.queryFromSource(wrapper);
    }

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    @Transactional(rollbackFor = Exception.class)
    public boolean insert2Target(List<RecordOfYear4Dinner> beans) {
        if (CollectionUtil.isNotEmpty(beans)) {
            beans.stream().forEach(e -> e.setUnitCode(OrgCodeTranslateUtils.common2fsnip(e.getUnitCode())));
        }
        return super.insert2Target(beans);
    }

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public boolean updateStatus(List<RecordOfYear4Dinner> recordOfYear4Dinners) {
        return super.updateStatus(recordOfYear4Dinners);
    }

    @Override
    protected boolean whether2UpdateStatus() {
        return true;
    }
}
