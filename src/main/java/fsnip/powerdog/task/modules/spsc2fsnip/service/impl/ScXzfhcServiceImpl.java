package fsnip.powerdog.task.modules.spsc2fsnip.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.spsc2fsnip.dao.ScXzfhcDao;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.ScXzfhcEntity;
import fsnip.powerdog.task.modules.spsc2fsnip.service.ScXzfhcService;
import org.springframework.stereotype.Service;

/**
 * @author chenxiaolin 2018/7/12 16:08
 * @Desc
 */
@Service("scXzfhcService")
public class ScXzfhcServiceImpl extends ServiceImpl<ScXzfhcDao, ScXzfhcEntity> implements ScXzfhcService {

    @DataSource(name = DataSourceNames.FOUR)
    @Override
    public void saveXzfhc(ScXzfhcEntity scXzfhcEntity) {

        this.insert(scXzfhcEntity);

    }
}
