package fsnip.powerdog.task.modules.smart2fsnip.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.common.utils.OrgCodeTranslateUtils;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.smart2fsnip.dao.SmartImportantEventDao;
import fsnip.powerdog.task.modules.smart2fsnip.entity.SmartImportantEvent;
import fsnip.powerdog.task.modules.smart2fsnip.service.SmartImportantEventService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description: 重大活动保障表Service实现
 * @Author: kun.tan
 * @DateTime: 2018-8-3 10:02:00
 */
@Service
public class SmartImportantEventServiceImpl extends BaseServiceImpl<SmartImportantEventDao, SmartImportantEvent> implements SmartImportantEventService {

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public List<SmartImportantEvent> queryFromSource(EntityWrapper<SmartImportantEvent> wrapper) {
        return super.queryFromSource(wrapper);
    }

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    @Transactional(rollbackFor = Exception.class)
    public boolean insert2Target(List<SmartImportantEvent> beans) {
        if (CollectionUtil.isNotEmpty(beans)) {
            beans.stream().forEach(e -> e.setUnitCode(OrgCodeTranslateUtils.common2fsnip(e.getUnitCode())));
        }
        return super.insert2Target(beans);
    }

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public boolean updateStatus(List<SmartImportantEvent> smartImportantEvents) {
        return super.updateStatus(smartImportantEvents);
    }

    @Override
    protected boolean whether2UpdateStatus() {
        return true;
    }
}
