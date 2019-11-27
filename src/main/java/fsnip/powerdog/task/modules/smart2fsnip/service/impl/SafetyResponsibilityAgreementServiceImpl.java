package fsnip.powerdog.task.modules.smart2fsnip.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.common.utils.OrgCodeTranslateUtils;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.smart2fsnip.dao.SafetyResponsibilityAgreementDao;
import fsnip.powerdog.task.modules.smart2fsnip.entity.SafetyResponsibilityAgreement;
import fsnip.powerdog.task.modules.smart2fsnip.service.SafetyResponsibilityAgreementService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 安全责任书Service实现
 * @Author: kun.tan
 * @DateTime: 2018-07-12 15:12
 */
@Service
public class SafetyResponsibilityAgreementServiceImpl extends BaseServiceImpl<SafetyResponsibilityAgreementDao, SafetyResponsibilityAgreement> implements SafetyResponsibilityAgreementService {

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public List<SafetyResponsibilityAgreement> queryFromSource(EntityWrapper<SafetyResponsibilityAgreement> wrapper) {
        return super.queryFromSource(wrapper);
    }

    @Override
    @DataSource(name = DataSourceNames.SECOND)
    @Transactional(rollbackFor = Exception.class)
    public boolean insert2Target(List<SafetyResponsibilityAgreement> beans) {
        if (CollectionUtil.isNotEmpty(beans)) {
            beans.stream().forEach(e -> e.setUnitCode(OrgCodeTranslateUtils.common2fsnip(e.getUnitCode())));
        }
        return super.insert2Target(beans);
    }

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public boolean updateStatus(List<SafetyResponsibilityAgreement> safetyResponsibilityAgreements) {
        return super.updateStatus(safetyResponsibilityAgreements);
    }

    @Override
    protected boolean whether2UpdateStatus() {
        return true;
    }
}
