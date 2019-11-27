package fsnip.powerdog.task.modules.fsnip2smart.service.impl;

import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.fsnip2smart.dao.WorkShopCheckDao;
import fsnip.powerdog.task.modules.fsnip2smart.entity.WorkShopCheck;
import fsnip.powerdog.task.modules.fsnip2smart.service.WorkShopCheckSyncByJgService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:小作坊检查记录从监管同步到中间库
 * @User: QMQ
 * @DateTime: 2018-07-13 10:48
 */
@Service("workShopCheckSyncByJgService")
public class WorkShopCheckSyncByJgServiceImpl extends BaseServiceImpl<WorkShopCheckDao,WorkShopCheck> implements WorkShopCheckSyncByJgService {

    /**
     * 向中间库同步数据
     * @param beans
     * @return
     */
    @Override
    @DataSource(name = DataSourceNames.FIRST) // 中间库
    public boolean insert2Target(List<WorkShopCheck> beans) {
        return super.insert2Target(beans);
    }

}
