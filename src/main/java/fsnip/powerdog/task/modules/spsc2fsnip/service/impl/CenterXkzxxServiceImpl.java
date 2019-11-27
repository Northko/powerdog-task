package fsnip.powerdog.task.modules.spsc2fsnip.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.spsc2fsnip.dao.CenterXkzxxDao;
import fsnip.powerdog.task.modules.spsc2fsnip.dao.ScXkzxxDao;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.CenterXkzxxEntity;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.ScXkzxxEntity;
import fsnip.powerdog.task.modules.spsc2fsnip.service.CenterXkzxxService;
import fsnip.powerdog.task.modules.spsc2fsnip.service.ScXkzxxService;
import org.springframework.stereotype.Service;

/**
 * @author chenxiaolin 2018/7/12 16:08
 * @Desc 经营许可基本信息
 */
@Service("centerXkzxxService")
public class CenterXkzxxServiceImpl extends ServiceImpl<CenterXkzxxDao, CenterXkzxxEntity> implements CenterXkzxxService {

    @DataSource(name = DataSourceNames.FIRST)
    @Override
    public void saveInfo(CenterXkzxxEntity centerXkzxxEntity) {

        int count = selectCount(new EntityWrapper<CenterXkzxxEntity>().eq("SCXKZBH", centerXkzxxEntity.getScxkzbh()));
        if(count==0){
            this.insert(centerXkzxxEntity);
        }

    }
}
