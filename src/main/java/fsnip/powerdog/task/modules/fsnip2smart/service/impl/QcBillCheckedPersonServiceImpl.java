package fsnip.powerdog.task.modules.fsnip2smart.service.impl;

import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.fsnip2smart.dao.QcBillCheckedPersonDao;
import fsnip.powerdog.task.modules.fsnip2smart.entity.QcBillCheckedPerson;
import fsnip.powerdog.task.modules.fsnip2smart.service.QcBillCheckedPersonService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 快检被检测单位Service实现
 * @Author: kun.tan
 * @DateTime: 2018-07-13 10:42
 */
@Service
public class QcBillCheckedPersonServiceImpl extends BaseServiceImpl<QcBillCheckedPersonDao, QcBillCheckedPerson> implements QcBillCheckedPersonService {

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    public List<QcBillCheckedPerson> selectBatchIds(Collection<? extends Serializable> idList) {
        return super.selectBatchIds(idList);
    }
}
