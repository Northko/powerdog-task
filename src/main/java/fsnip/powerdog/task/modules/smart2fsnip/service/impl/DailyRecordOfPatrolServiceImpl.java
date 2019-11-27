package fsnip.powerdog.task.modules.smart2fsnip.service.impl;

import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.smart2fsnip.dao.DailyRecordOfPatrolDao;
import fsnip.powerdog.task.modules.smart2fsnip.entity.DailyRecordOfPatrol;
import fsnip.powerdog.task.modules.smart2fsnip.service.DailyRecordOfPatrolService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description: 日常巡检记录Service实现
 * @Author: kun.tan
 * @DateTime: 2018-8-2 18:18:30
 */
@Service
public class DailyRecordOfPatrolServiceImpl extends BaseServiceImpl<DailyRecordOfPatrolDao, DailyRecordOfPatrol> implements DailyRecordOfPatrolService {

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    @Transactional(rollbackFor = Exception.class)
    public boolean insert2Target(List<DailyRecordOfPatrol> beans) {
        return super.insert2Target(beans);
    }
}
