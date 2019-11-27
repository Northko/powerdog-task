package fsnip.powerdog.task.modules.spsc2fsnip.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.spsc2fsnip.dao.CenterZhuXiaoDao;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.CenterZhuXiaoEntity;
import fsnip.powerdog.task.modules.spsc2fsnip.service.CenterZhuXiaoService;
import org.springframework.stereotype.Service;

/**
 * @author chenxiaolin 2018/7/12 16:08
 * @Desc 经营许可基本信息
 */
@Service("centerZhuXiaoService")
public class CenterZhuXiaoServiceImpl extends ServiceImpl<CenterZhuXiaoDao, CenterZhuXiaoEntity> implements CenterZhuXiaoService {


    @DataSource(name = DataSourceNames.FIRST)
    @Override
    public void saveInfo(CenterZhuXiaoEntity centerZhuXiaoEntity) {

        int count = this.selectCount(new EntityWrapper<CenterZhuXiaoEntity>().eq("SPJYXKXXID", centerZhuXiaoEntity.getLicenseId()));
        if(count==0){
            this.insert(centerZhuXiaoEntity);
        }

    }
}
