package fsnip.powerdog.task.modules.spsc2fsnip.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.spsc2fsnip.dao.CenterXzfhcDao;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.CenterXzfhcEntity;
import fsnip.powerdog.task.modules.spsc2fsnip.service.CenterXzfhcService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenxiaolin 2018/7/12 16:08
 * @Desc
 */
@Service("centerXzfhcService")
public class CenterXzfhcServiceImpl extends ServiceImpl<CenterXzfhcDao, CenterXzfhcEntity> implements CenterXzfhcService {

    @DataSource(name = DataSourceNames.FIRST)
    @Override
    public List<CenterXzfhcEntity> getXzfhcKist() {

        EntityWrapper wrapper = new EntityWrapper<CenterXzfhcEntity>();
        wrapper.eq("syn_status","0");

        List<CenterXzfhcEntity> list = selectList(wrapper);

        return list;
    }

    @DataSource(name = DataSourceNames.FIRST)
    @Override
    public void updateSynStatus(CenterXzfhcEntity centerXzfhcEntity) {

        this.updateById(centerXzfhcEntity);
    }

}
