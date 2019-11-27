package fsnip.powerdog.task.modules.spsc2fsnip.service;

import com.baomidou.mybatisplus.service.IService;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.ScXzfEntity;

import java.util.List;

/**
 * @author chenxiaolin 2018/7/12 16:07
 * @Desc Service
 */
public interface ScXzfService extends IService<ScXzfEntity> {

    List<ScXzfEntity> getInfoList(String beginDate, String endDate);
}
