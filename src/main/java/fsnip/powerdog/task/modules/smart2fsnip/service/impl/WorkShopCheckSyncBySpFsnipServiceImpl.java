package fsnip.powerdog.task.modules.smart2fsnip.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.smart2fsnip.dao.WorkShopCheckSyncBySpDao;
import fsnip.powerdog.task.modules.smart2fsnip.dao.WorkShopCheckSyncBySpFsnipDao;
import fsnip.powerdog.task.modules.smart2fsnip.entity.ScZfxchc;
import fsnip.powerdog.task.modules.smart2fsnip.entity.ScZfxchcFsnip;
import fsnip.powerdog.task.modules.smart2fsnip.service.WorkShopCheckSyncBySpFsnipService;
import fsnip.powerdog.task.modules.smart2fsnip.service.WorkShopCheckSyncBySpService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:小作坊检查信息sercives实现 (监管数据库)
 * @User: QMQ
 * @DateTime: 2018-07-13 11:54
 */
@Service("workShopCheckSyncBySpFsnipService")
public class WorkShopCheckSyncBySpFsnipServiceImpl extends BaseServiceImpl<WorkShopCheckSyncBySpFsnipDao,ScZfxchcFsnip> implements WorkShopCheckSyncBySpFsnipService {



    /**
     * 向经营同步数据
     * @param beans
     * @return
     */
    @Override
    @DataSource(name = DataSourceNames.FOUR) // 生产许可
    public boolean insert2Target(List<ScZfxchcFsnip> beans) {
        return super.insert2Target(beans);
    }
}
