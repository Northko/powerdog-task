package fsnip.powerdog.task.modules.fsnip2smart.service.impl;

import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.fsnip2smart.dao.QcBillQuickCheckInfoDao;
import fsnip.powerdog.task.modules.fsnip2smart.entity.QcBillQuickCheckInfo;
import fsnip.powerdog.task.modules.fsnip2smart.service.QcBillQuickCheckInfoService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 快检信息Service实现
 * @Author: kun.tan
 * @DateTime: 2018-07-13 10:56
 */
@Service
public class QcBillQuickCheckInfoServiceImpl extends BaseServiceImpl<QcBillQuickCheckInfoDao, QcBillQuickCheckInfo> implements QcBillQuickCheckInfoService {

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    public List<QcBillQuickCheckInfo> selectBatchIds(Collection<? extends Serializable> idList) {
        return super.selectBatchIds(idList);
    }
}
