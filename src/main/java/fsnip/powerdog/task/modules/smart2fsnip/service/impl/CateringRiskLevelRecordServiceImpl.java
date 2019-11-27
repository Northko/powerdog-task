package fsnip.powerdog.task.modules.smart2fsnip.service.impl;

import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.smart2fsnip.dao.CateringRiskLevelRecordDao;
import fsnip.powerdog.task.modules.smart2fsnip.entity.CateringRiskLevelRecord;
import fsnip.powerdog.task.modules.smart2fsnip.service.CateringRiskLevelRecordService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 餐饮风险等级记录Service实现
 * @Author: kun.tan
 * @DateTime: 2018-08-02 18:05
 */
@Service
public class CateringRiskLevelRecordServiceImpl extends BaseServiceImpl<CateringRiskLevelRecordDao, CateringRiskLevelRecord> implements CateringRiskLevelRecordService {

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    @Transactional(rollbackFor = Exception.class)
    public boolean insert2Target(List<CateringRiskLevelRecord> beans) {
        return super.insert2Target(beans);
    }
}
