package fsnip.powerdog.task.modules.spsc2fsnip.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.spsc2fsnip.dao.CenterXfzDao;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.CenterXzfEntity;
import fsnip.powerdog.task.modules.spsc2fsnip.service.CenterXzfService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * @author chenxiaolin 2018/7/12 16:08
 * @Desc
 */
@Service("centerXzfService")
public class CenterXzfServiceImpl extends ServiceImpl<CenterXfzDao, CenterXzfEntity> implements CenterXzfService {

    private final Logger logger = LogManager.getLogger();

    @DataSource(name = DataSourceNames.FIRST)
    @Override
    public void saveInfo(CenterXzfEntity centerXzfEntity) {

        int count = selectCount(new EntityWrapper<CenterXzfEntity>().eq("djzh", centerXzfEntity.getDjzh()));
        if(count==0){
            this.insert(centerXzfEntity);
        }

    }
}
