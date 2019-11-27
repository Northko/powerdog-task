package fsnip.powerdog.task.modules.spsc2fsnip.service;

import com.baomidou.mybatisplus.service.IService;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.CenterXzfEntity;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.ScXzfEntity;

/**
 * @author chenxiaolin 2018/7/12 16:07
 * @Desc Service
 */
public interface CenterXzfService extends IService<CenterXzfEntity> {

    void saveInfo(CenterXzfEntity centerXzfEntity);
}
