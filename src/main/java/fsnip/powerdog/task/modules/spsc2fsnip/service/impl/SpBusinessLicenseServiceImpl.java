package fsnip.powerdog.task.modules.spsc2fsnip.service.impl;

import com.baomidou.mybatisplus.enums.SqlLike;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.spsc2fsnip.dao.SpBusinessLicenseDao;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.CenterLicenseEntity;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.CenterZhuXiaoEntity;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.SPLicenseEntity;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.SpZhuXiaoEntity;
import fsnip.powerdog.task.modules.spsc2fsnip.service.CenterZhuXiaoService;
import fsnip.powerdog.task.modules.spsc2fsnip.service.SpBusinessLicenseService;
import fsnip.powerdog.task.modules.spsc2fsnip.service.CenterBusinessLicenseService;
import fsnip.powerdog.task.modules.spsc2fsnip.service.SpZhuXiaoService;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenxiaolin 2018/7/12 16:08
 * @Desc 经营许可基本信息
 */
@Service("spBusinessLicenseService")
public class SpBusinessLicenseServiceImpl extends ServiceImpl<SpBusinessLicenseDao, SPLicenseEntity> implements SpBusinessLicenseService {

    private final Logger logger = LogManager.getLogger();

    @Autowired
    private CenterBusinessLicenseService centerBusinessLicenseService;
    @Autowired
    private SpZhuXiaoService spZhuXiaoService;
    @Autowired
    private CenterZhuXiaoService centerZhuXiaoService;

    @DataSource(name = DataSourceNames.THREE)
    @Override
    public void synchronizationSP2CenterDatabase(String beginTime, String endDate) {

        /**
         * 1、同步经营许可归档有效数据
         */
        Wrapper<SPLicenseEntity> ew = new EntityWrapper<SPLicenseEntity>();

        if(StringUtils.isNotBlank(beginTime)&& StringUtils.isNotBlank(endDate)){
            ew.between("FZRQ", beginTime, endDate);
        }

        //归档有效的数据
        ew.eq("BLZT","guidang");
        ew.eq("XKZZT","2");
        ew.like("FZJGBH", "5201",SqlLike.RIGHT);

        List<SPLicenseEntity> selectList = this.selectList(ew);

        logger.info("归档有效查询总记录数："+selectList.size());

        List<CenterLicenseEntity> entityList = new ArrayList<>();
        if(selectList!=null&& selectList.size()>0){
            for (SPLicenseEntity licenseEntity:selectList){

                CenterLicenseEntity fsnipLicenseEntity = new CenterLicenseEntity(licenseEntity);
                entityList.add(fsnipLicenseEntity);
                centerBusinessLicenseService.saveFSNBaseInfo(fsnipLicenseEntity);
            }
            //centerBusinessLicenseService.insertBatchInfo(entityList);
        }

        /**
         * 1、同步经营许可已注销数据
         */
        List<SpZhuXiaoEntity> list = spZhuXiaoService.getInfoList(beginTime, endDate);

        logger.info("注销归档有效查询总记录数：" + list.size());

        if (list != null && list.size() > 0) {
            for (SpZhuXiaoEntity spZhuXiaoEntity : list) {

                CenterZhuXiaoEntity centerZhuXiaoEntity = new CenterZhuXiaoEntity(spZhuXiaoEntity);
                centerZhuXiaoService.saveInfo(centerZhuXiaoEntity);
            }
        }

    }

}
