package fsnip.powerdog.task.modules.spsc2fsnip.service.impl;

import com.baomidou.mybatisplus.enums.SqlLike;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.spsc2fsnip.dao.ScXzfDao;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.ScXzfEntity;
import fsnip.powerdog.task.modules.spsc2fsnip.service.ScXzfService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author chenxiaolin 2018/7/12 16:08
 * @Desc
 */
@Service("scXzfService")
public class ScXzfServiceImpl extends ServiceImpl<ScXzfDao, ScXzfEntity> implements ScXzfService {

    @DataSource(name = DataSourceNames.FOUR)
    @Override
    public List<ScXzfEntity> getInfoList(String beginDate, String endDate) {

        EntityWrapper<ScXzfEntity> ew = new EntityWrapper<ScXzfEntity>();

        if (StringUtils.isNotBlank( beginDate) && StringUtils.isNotBlank(endDate)) {
            ew.between("fzrq", beginDate, endDate);
        }

        ew.eq("state", "1");
        ew.isNotNull("djzh");
        ew.like("ssgjbh", "5201",SqlLike.RIGHT);
        ew.andNew(" djzh <> ''");

        List<ScXzfEntity> selectList = this.selectList(ew);

        return selectList;
    }

    @DataSource(name = DataSourceNames.FOUR)
    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateById(ScXzfEntity entity) {
        return super.updateById(entity);
    }
}
