package fsnip.powerdog.task.modules.spsc2fsnip.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.spsc2fsnip.dao.CenterBusinessLicenseDao;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.CenterLicenseEntity;
import fsnip.powerdog.task.modules.spsc2fsnip.service.CenterBusinessLicenseService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenxiaolin 2018/7/12 16:08
 * @Desc 经营许可基本信息
 */
@Service("centerBusinessLicenseService")
public class CenterBusinessLicenseServiceImpl extends ServiceImpl<CenterBusinessLicenseDao, CenterLicenseEntity> implements CenterBusinessLicenseService {

    @DataSource(name = DataSourceNames.FIRST)
    @Override
    public void saveFSNBaseInfo(CenterLicenseEntity fsnipLicenseEntity) {

        String licenseNo = fsnipLicenseEntity.getLicenseNo();
        int count = this.selectCount(new EntityWrapper<CenterLicenseEntity>().eq("XKZBH", licenseNo));
        if(count==0){
            this.insert(fsnipLicenseEntity);
        }

    }

    @DataSource(name = DataSourceNames.FIRST)
    @Override
    public void insertBatchInfo(List<CenterLicenseEntity> entityList) {

        this.insertBatch(entityList);

    }
}
