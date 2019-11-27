package fsnip.powerdog.task.modules.smart2fsnip.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.smart2fsnip.dao.SmartComInfoDao;
import fsnip.powerdog.task.modules.smart2fsnip.entity.SmartComInfo;
import fsnip.powerdog.task.modules.smart2fsnip.service.SmartComInfoService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Description: 工商信息表Service实现
 * @Author: yangshudong
 * @DateTime: 2018/7/13
 */
@Service("smartComInfoService")
public class SmartComInfoServiceImpl extends BaseServiceImpl<SmartComInfoDao,SmartComInfo> implements SmartComInfoService {

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public List<SmartComInfo> queryFromSource(Date startTime, Date endTime) {
        List<SmartComInfo> list = selectList(new EntityWrapper<SmartComInfo>().eq("syn_status", 0));
        for (SmartComInfo info:list){
            info.setSynStatus(1);
        }
        if (!list.isEmpty()){
            updateAllColumnBatchById(list);
        }
        for (SmartComInfo info:list){
            info.setUuid(UUID.randomUUID().toString().replace("-",""));
        }
        return list;
    }

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    public boolean insert2Target(List<SmartComInfo> beans) {
        return super.insert2Target(beans);
    }
}
