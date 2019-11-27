package fsnip.powerdog.task.modules.spsc2fsnip.service.impl;

import com.baomidou.mybatisplus.enums.SqlLike;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.spsc2fsnip.dao.SpZhuXiaoDao;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.SpZhuXiaoEntity;
import fsnip.powerdog.task.modules.spsc2fsnip.service.SpZhuXiaoService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenxiaolin 2018/7/12 16:08
 * @Desc 经营许可基本信息
 */
@Service("spZhuXiaoService")
public class SpZhuXiaoServiceImpl extends ServiceImpl<SpZhuXiaoDao, SpZhuXiaoEntity> implements SpZhuXiaoService {

    @DataSource(name = DataSourceNames.THREE)
    @Override
    public List<SpZhuXiaoEntity> getInfoList(String beginTime, String endDate) {

        EntityWrapper wrapper = new EntityWrapper<SpZhuXiaoEntity>();

        if (StringUtils.isNotBlank(beginTime) && StringUtils.isNotBlank(endDate)) {
            wrapper.between("GDRQ", beginTime + " 00:00:00", endDate + " 23:59:59");
        }

        //注销归档有效的数据
        wrapper.eq("BLZT", "guidang");
        wrapper.eq("ZXSQZT", "2");
        wrapper.like("NSLJGBM", "5201",SqlLike.RIGHT);

        List<SpZhuXiaoEntity> selectList = this.selectList(wrapper);

        return selectList;
    }
}
