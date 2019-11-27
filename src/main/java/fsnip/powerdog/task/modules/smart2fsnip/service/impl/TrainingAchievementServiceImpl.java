package fsnip.powerdog.task.modules.smart2fsnip.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.smart2fsnip.dao.TrainingAchievementDao;
import fsnip.powerdog.task.modules.smart2fsnip.entity.TrainingAchievement;
import fsnip.powerdog.task.modules.smart2fsnip.service.TrainingAchievementService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 培训考试成绩Service实现
 * @Author: kun.tan
 * @DateTime: 2018-07-12 19:05
 */
@Service
public class TrainingAchievementServiceImpl extends BaseServiceImpl<TrainingAchievementDao, TrainingAchievement> implements TrainingAchievementService {

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public List<TrainingAchievement> queryFromSource(EntityWrapper<TrainingAchievement> wrapper) {
        return super.queryFromSource(wrapper);
    }

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    @Transactional(rollbackFor = Exception.class)
    public boolean insert2Target(List<TrainingAchievement> beans) {
        return super.insert2Target(beans);
    }

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public boolean updateStatus(List<TrainingAchievement> trainingAchievements) {
        return super.updateStatus(trainingAchievements);
    }

    @Override
    protected boolean whether2UpdateStatus() {
        return true;
    }
}
