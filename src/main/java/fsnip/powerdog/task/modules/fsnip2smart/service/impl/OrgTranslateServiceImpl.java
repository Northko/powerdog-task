package fsnip.powerdog.task.modules.fsnip2smart.service.impl;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.fsnip2smart.dao.OrgTranslationDao;
import fsnip.powerdog.task.modules.fsnip2smart.entity.OrgTranslation;
import fsnip.powerdog.task.modules.fsnip2smart.service.OrgTranslateService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @description: 组织机构编码转换Service
 * @author: kun.tan
 * @dateTime: 2018-11-20 11:28
 */
@Service
public class OrgTranslateServiceImpl extends ServiceImpl<OrgTranslationDao, OrgTranslation> implements OrgTranslateService {

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    public List<OrgTranslation> selectList(Wrapper<OrgTranslation> wrapper) {
        return super.selectList(wrapper);
    }
}
