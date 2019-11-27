package fsnip.powerdog.task.modules.spsc2fsnip.service;

import com.baomidou.mybatisplus.service.IService;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.CenterLicenseEntity;

import java.util.List;

/**
 * @author chenxiaolin 2018/7/12 16:07
 * @Desc 经营许可基本信息Service
 */
public interface CenterBusinessLicenseService extends IService<CenterLicenseEntity> {

    void saveFSNBaseInfo(CenterLicenseEntity fsnipLicenseEntity);

    void insertBatchInfo(List<CenterLicenseEntity> entityList);
}
