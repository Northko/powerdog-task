package fsnip.powerdog.task.modules.smart2fsnip.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.toolkit.CollectionUtils;
import fsnip.powerdog.task.base.BaseServiceImpl;
import fsnip.powerdog.task.common.unaltered.Constant;
import fsnip.powerdog.task.common.unaltered.DataFrom;
import fsnip.powerdog.task.common.utils.OrgCodeTranslateUtils;
import fsnip.powerdog.task.common.utils.StrBuilder;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.smart2fsnip.dao.CateringRiskLevelDao;
import fsnip.powerdog.task.modules.smart2fsnip.entity.CateringRiskLevel;
import fsnip.powerdog.task.modules.smart2fsnip.entity.CateringRiskLevelRecord;
import fsnip.powerdog.task.modules.smart2fsnip.entity.DailyRecordOfPatrol;
import fsnip.powerdog.task.modules.smart2fsnip.service.CateringRiskLevelRecordService;
import fsnip.powerdog.task.modules.smart2fsnip.service.CateringRiskLevelService;
import fsnip.powerdog.task.modules.smart2fsnip.service.DailyRecordOfPatrolService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 食品餐饮风险等级评定表  服务实现类
 * </p>
 *
 * @author kun.tan
 * @since 2018-8-2 16:43:12
 */
@Service
public class CateringRiskLevelServiceImpl extends BaseServiceImpl<CateringRiskLevelDao, CateringRiskLevel> implements CateringRiskLevelService {

    public static final String GRADE_D = "D";
    @Autowired
    private DailyRecordOfPatrolService dailyRecordOfPatrolService;
    @Autowired
    private CateringRiskLevelRecordService cateringRiskLevelRecordService;

    public static final String CHECK_TYPE_CATERING_RISK_LEVEL = "餐饮风险等级评定检查";

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public List<CateringRiskLevel> queryFromSource(EntityWrapper<CateringRiskLevel> wrapper) {
        return super.queryFromSource(wrapper);
    }

    @Override
    public boolean insert2Target(List<CateringRiskLevel> beans) {
        if (CollectionUtils.isNotEmpty(beans)) {
            List<DailyRecordOfPatrol> dailyRecordOfPatrols = new ArrayList<>();
            List<CateringRiskLevelRecord> cateringRiskLevelRecords = new ArrayList<>();
            beans.forEach(bean -> {
                DailyRecordOfPatrol dailyRecordOfPatrol = new DailyRecordOfPatrol();
                dailyRecordOfPatrol.setXuuid(bean.getId());
                dailyRecordOfPatrol.setCjclx(CHECK_TYPE_CATERING_RISK_LEVEL);
                dailyRecordOfPatrol.setXsjly(DataFrom.SMART.name());
                dailyRecordOfPatrol.setXxcsj(bean.getCreateDate());
                dailyRecordOfPatrol.setXxcdwbh(OrgCodeTranslateUtils.common2fsnip(bean.getUnitCode()));
                dailyRecordOfPatrol.setXxcdw(bean.getJudgeUnit() + bean.getJudgeDepartment());
                dailyRecordOfPatrol.setXxcry(bean.getOrganizerName() + ";" + bean.getParticipatorName());
                String riskType = bean.getRiskType();
                dailyRecordOfPatrol.setXqylb(Constant.EntType.getTypeByDesc(riskType));
                dailyRecordOfPatrol.setXbzsj(bean.getCreateDate());
                // 智慧监管数据不存在检查结果，目前评级为D则判定为不符合，A、B、C则判定为符合
                String grade = bean.getRiskGrade();
                String checkResult;
                if (StringUtils.isBlank(grade)) {
                    checkResult = Constant.InspectCheckResult.UNKNOWN.getResult();
                } else if (grade.contains(GRADE_D)) {
                    checkResult = Constant.InspectCheckResult.DISQUALIFICATION.getResult();
                } else {
                    checkResult = Constant.InspectCheckResult.QUALIFICATION.getResult();
                }
                dailyRecordOfPatrol.setXxjycljg1(checkResult);
                dailyRecordOfPatrol.setXsm(grade + " ; " + bean.getWorkSituation());
                dailyRecordOfPatrol.setXztmc(bean.getCompanyName());
                dailyRecordOfPatrol.setXfzr(bean.getCompanyPerson());
                dailyRecordOfPatrol.setXzch(bean.getRegistrationCode());
                dailyRecordOfPatrol.setXxkzh(bean.getFoodLicense());
                dailyRecordOfPatrol.setXxxdz(bean.getGpsAddr());
                dailyRecordOfPatrol.setXjd(bean.getGpsLongitude());
                dailyRecordOfPatrol.setXwd(bean.getGpsLatitude());
                dailyRecordOfPatrol.setXqtfjxx(
                        new StrBuilder(",")
                                .append(bean.getWorkImg())
                                .append(bean.getDynamicDoc())
                                .append(bean.getStaticDoc())
                                .append(bean.getConfirmDoc())
                                .getStr());
                dailyRecordOfPatrols.add(dailyRecordOfPatrol);

                CateringRiskLevelRecord cateringRiskLevelRecord = new CateringRiskLevelRecord();
                cateringRiskLevelRecord.setUuid(bean.getId());
                cateringRiskLevelRecord.setXcjlUuid(bean.getId());
                cateringRiskLevelRecord.setJtfz(bean.getStaticValue());
                cateringRiskLevelRecord.setDtfz(bean.getDynamicValue());
                cateringRiskLevelRecord.setRiskGrade(bean.getRiskGrade());
                cateringRiskLevelRecord.setXcsj(bean.getCreateDate());
                cateringRiskLevelRecord.setQylb(Constant.EntType.getTypeByDesc(riskType));
                cateringRiskLevelRecord.setCheakorg(bean.getJudgeUnit() + bean.getJudgeDepartment());
                cateringRiskLevelRecord.setXxcry(bean.getOrganizerName() + ";" + bean.getParticipatorName());
                cateringRiskLevelRecord.setXztmc(bean.getCompanyName());
                cateringRiskLevelRecords.add(cateringRiskLevelRecord);
            });
            cateringRiskLevelRecordService.insert2Target(cateringRiskLevelRecords);
            return dailyRecordOfPatrolService.insert2Target(dailyRecordOfPatrols);
        }
        return false;
    }

    @Override
    protected boolean whether2UpdateStatus() {
        return true;
    }
}