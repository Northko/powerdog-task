package fsnip.powerdog.task.modules.fsnip2smart.service.impl;

import com.baomidou.mybatisplus.mapper.Wrapper;
import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.fsnip2smart.dao.QcBillCheckItemDao;
import fsnip.powerdog.task.modules.fsnip2smart.entity.QcBillCheckItem;
import fsnip.powerdog.task.modules.fsnip2smart.service.QcBillCheckItemService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 快检检测项目Service实现
 * @Author: kun.tan
 * @DateTime: 2018-07-13 10:50
 */
@Service
public class QcBillCheckItemServiceImpl extends BaseServiceImpl<QcBillCheckItemDao, QcBillCheckItem> implements QcBillCheckItemService {

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    public List<QcBillCheckItem> selectList(Wrapper<QcBillCheckItem> wrapper) {
        return super.selectList(wrapper);
    }
}
