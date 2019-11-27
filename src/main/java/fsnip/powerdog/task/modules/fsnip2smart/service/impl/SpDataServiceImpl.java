package fsnip.powerdog.task.modules.fsnip2smart.service.impl;

import com.baomidou.mybatisplus.mapper.Wrapper;
import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.fsnip2smart.dao.SpDataDao;
import fsnip.powerdog.task.modules.fsnip2smart.entity.SpData;
import fsnip.powerdog.task.modules.fsnip2smart.service.SpDataService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 抽检数据检查记录Service实现
 * @Author: kun.tan
 * @DateTime: 2018-07-13 11:25
 */
@Service
public class SpDataServiceImpl extends BaseServiceImpl<SpDataDao, SpData> implements SpDataService {

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    public List<SpData> queryFromSource(Date startTime, Date endTime) {
        return super.queryFromSource(startTime, endTime);
    }

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    public List<SpData> selectList(Wrapper<SpData> wrapper) {
        return super.selectList(wrapper);
    }
}
