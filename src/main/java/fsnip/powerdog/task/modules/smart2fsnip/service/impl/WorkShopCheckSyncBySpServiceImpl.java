package fsnip.powerdog.task.modules.smart2fsnip.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.smart2fsnip.dao.WorkShopCheckSyncBySpDao;
import fsnip.powerdog.task.modules.smart2fsnip.dao.WorkShopCheckSyncBySpFsnipDao;
import fsnip.powerdog.task.modules.smart2fsnip.entity.ScZfxchc;
import fsnip.powerdog.task.modules.smart2fsnip.entity.ScZfxchcFsnip;
import fsnip.powerdog.task.modules.smart2fsnip.service.WorkShopCheckSyncBySpService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:小作坊检查信息sercives实现 (中间库)
 * @User: QMQ
 * @DateTime: 2018-07-13 11:54
 */
@Service("workShopCheckSyncBySpService")
public class WorkShopCheckSyncBySpServiceImpl extends BaseServiceImpl<WorkShopCheckSyncBySpDao,ScZfxchc> implements WorkShopCheckSyncBySpService {
    /**
     * 获取中间库数据
     * @param startTime
     * @param endTime
     * @return
     */
    @Override
    @DataSource(name = DataSourceNames.FIRST) // 中间库
    public List<ScZfxchc> queryFromSource(Date startTime, Date endTime) {
        return this.selectList(
                new EntityWrapper<ScZfxchc>().eq("syn_status",0));
    }

    /**
     * 更新中间库 标记状态
     * @return
     */
    @Override
    @DataSource(name = DataSourceNames.FIRST) // 中间库
    public boolean updateStatus(List<ScZfxchc> beans) {
        return super.updateStatus(beans);
    }

}
