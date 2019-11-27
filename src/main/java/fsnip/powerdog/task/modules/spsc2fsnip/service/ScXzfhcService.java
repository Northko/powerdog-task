package fsnip.powerdog.task.modules.spsc2fsnip.service;

import com.baomidou.mybatisplus.service.IService;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.ScXzfEntity;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.ScXzfhcEntity;

import java.util.List;

/**
 * @author chenxiaolin 2018/7/12 16:07
 * @Desc Service
 */
public interface ScXzfhcService extends IService<ScXzfhcEntity> {

    void saveXzfhc(ScXzfhcEntity scXzfhcEntity);
}
