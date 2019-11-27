package fsnip.powerdog.task.modules.fsnip2smart.service.impl;

import com.baomidou.mybatisplus.enums.SqlLike;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.fsnip2smart.dao.WorkShopCheckFsnipDao;
import fsnip.powerdog.task.modules.fsnip2smart.entity.WorkShopCheckFsnip;
import fsnip.powerdog.task.modules.fsnip2smart.service.WorkShopCheckSyncByJgFsnipService;
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
@Service("workShopCheckSyncByJgFsnipService")
public class WorkShopCheckSyncByJgFsnipServiceImpl extends BaseServiceImpl<WorkShopCheckFsnipDao, WorkShopCheckFsnip> implements WorkShopCheckSyncByJgFsnipService {

    /**
     * 获取监督数据
     *
     * @param startTime
     * @param endTime
     * @return
     */
    @Override
    @DataSource(name = DataSourceNames.SECOND)
    public List<WorkShopCheckFsnip> queryFromSource(Date startTime, Date endTime) {

        com.baomidou.mybatisplus.mapper.Wrapper<WorkShopCheckFsnip> ew = new EntityWrapper<>();
        ew.between("RECORD_INSERT_TIME", startTime, endTime);
        ew.andNew().like("checkorgcode", "520115", SqlLike.RIGHT);
        ew.or().like("checkorgcode", "520102", SqlLike.RIGHT);
        List<WorkShopCheckFsnip> list = selectList(ew);
        return list;
    }
}
