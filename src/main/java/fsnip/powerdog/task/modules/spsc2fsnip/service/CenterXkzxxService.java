package fsnip.powerdog.task.modules.spsc2fsnip.service;

import com.baomidou.mybatisplus.service.IService;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.CenterXkzxxEntity;

/**
 * @author chenxiaolin 2018/7/12 16:07
 * @Desc Service
 */
public interface CenterXkzxxService extends IService<CenterXkzxxEntity> {

    void saveInfo(CenterXkzxxEntity centerXkzxxEntity);
}
