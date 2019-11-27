package fsnip.powerdog.task.modules.fsnip2smart.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.toolkit.CollectionUtils;
import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.fsnip2smart.dao.SpBsbsDao;
import fsnip.powerdog.task.modules.fsnip2smart.entity.DcSpBsbs;
import fsnip.powerdog.task.modules.fsnip2smart.entity.DcSpData;
import fsnip.powerdog.task.modules.fsnip2smart.entity.SpBsbs;
import fsnip.powerdog.task.modules.fsnip2smart.entity.SpData;
import fsnip.powerdog.task.modules.fsnip2smart.service.DcSpBsbsService;
import fsnip.powerdog.task.modules.fsnip2smart.service.DcSpDataService;
import fsnip.powerdog.task.modules.fsnip2smart.service.SpBsbsService;
import fsnip.powerdog.task.modules.fsnip2smart.service.SpDataService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 抽检数据service实现
 * @Author: kun.tan
 * @DateTime: 2018-07-13 11:23
 */
@Service
public class SpBsbsServiceImpl extends BaseServiceImpl<SpBsbsDao, SpBsbs> implements SpBsbsService {

    @Autowired
    private DcSpBsbsService dcSpBsbsService;
    @Autowired
    private SpDataService spDataService;
    @Autowired
    private DcSpDataService dcSpDataService;

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    public List<SpBsbs> queryFromSource(Date startTime, Date endTime) {
        return selectList(new EntityWrapper<SpBsbs>()
                .between("created_at", startTime, endTime)
                .andNew().like("sp_s_5", "南明区%")
                .or().like("sp_s_5", "观山湖区%"));
    }

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public boolean insert2Target(List<SpBsbs> beans) {
        if (CollectionUtils.isNotEmpty(beans)) {
            List<DcSpBsbs> dcSpBsbs = new ArrayList<>();
            List<String> ids = new ArrayList<>();
            beans.forEach(bean -> {
                ids.add(bean.getId());
                DcSpBsbs spBsbs = new DcSpBsbs();
                BeanUtils.copyProperties(bean, spBsbs);
                dcSpBsbs.add(spBsbs);
            });
            List<SpData> spDataList = spDataService.selectList(new EntityWrapper<SpData>().in("sp_bsb_id", ids.toArray()));
            List<DcSpData> spData = new ArrayList<>();
            spDataList.forEach(bean -> {
                DcSpData dcSpData = new DcSpData();
                BeanUtils.copyProperties(bean, dcSpData);
                spData.add(dcSpData);
            });
            dcSpDataService.insert2Target(spData);
            return dcSpBsbsService.insert2Target(dcSpBsbs);
        }
        return true;
    }
}
