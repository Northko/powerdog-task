package fsnip.powerdog.task.modules.spsc2fsnip.service;

import com.baomidou.mybatisplus.service.IService;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.ScXkzxxEntity;

/**
 * @author chenxiaolin 2018/7/12 16:07
 * @Desc Service
 */
public interface ScXkzxxService extends IService<ScXkzxxEntity> {

    void synchronizationSC2CenterDatabase(String beginDate, String endDate);

    void synSmallWorkshopCheck2Sc();
}
