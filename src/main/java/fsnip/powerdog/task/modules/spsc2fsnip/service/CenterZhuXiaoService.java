package fsnip.powerdog.task.modules.spsc2fsnip.service;

import com.baomidou.mybatisplus.service.IService;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.CenterZhuXiaoEntity;

/**
 * @author chenxiaolin 2018/7/12 16:07
 * @Desc 经营许可基本信息Service
 */
public interface CenterZhuXiaoService extends IService<CenterZhuXiaoEntity> {


    void saveInfo(CenterZhuXiaoEntity centerZhuXiaoEntity);
}
