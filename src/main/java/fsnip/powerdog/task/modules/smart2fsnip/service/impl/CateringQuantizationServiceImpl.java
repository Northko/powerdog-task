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
import fsnip.powerdog.task.modules.smart2fsnip.dao.CateringQuantizationDao;
import fsnip.powerdog.task.modules.smart2fsnip.entity.CateringQuantization;
import fsnip.powerdog.task.modules.smart2fsnip.entity.DailyRecordOfPatrol;
import fsnip.powerdog.task.modules.smart2fsnip.service.CateringQuantizationService;
import fsnip.powerdog.task.modules.smart2fsnip.service.DailyRecordOfPatrolService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 餐饮量化分级记录  实现
 * </p>
 *
 * @author kun.tan
 * @since 2018-8-2 11:50:35
 */
@Service
public class CateringQuantizationServiceImpl extends BaseServiceImpl<CateringQuantizationDao, CateringQuantization> implements CateringQuantizationService {

    public static final String GRADE_D = "D";
    @Autowired
    private DailyRecordOfPatrolService dailyRecordOfPatrolService;

    public static final String CHECK_TYPE = "餐饮量化分级检查";

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public List<CateringQuantization> queryFromSource(EntityWrapper<CateringQuantization> wrapper) {
        return super.queryFromSource(wrapper);
    }

    @Override
    public boolean insert2Target(List<CateringQuantization> beans) {
        List<DailyRecordOfPatrol> dailyRecordOfPatrols = cateringQuantization2DailyRecordOfPatrol(beans);
        return dailyRecordOfPatrolService.insert2Target(dailyRecordOfPatrols);
    }

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public boolean updateStatus(List<CateringQuantization> cateringQuantization) {
        return super.updateStatus(cateringQuantization);
    }

    @Override
    protected boolean whether2UpdateStatus() {
        return true;
    }

    private List<DailyRecordOfPatrol> cateringQuantization2DailyRecordOfPatrol(List<CateringQuantization> beans) {
        if (CollectionUtils.isEmpty(beans)) {
            return Collections.EMPTY_LIST;
        }
        List<DailyRecordOfPatrol> dailyRecordOfPatrols = beans.stream().map(bean -> {
            DailyRecordOfPatrol dailyRecordOfPatrol = new DailyRecordOfPatrol();
            dailyRecordOfPatrol.setXuuid(bean.getId());
            dailyRecordOfPatrol.setXsjly(DataFrom.SMART.name());
            dailyRecordOfPatrol.setXxcsj(bean.getCreateDate());
            dailyRecordOfPatrol.setXztlx(bean.getQualityType());
            dailyRecordOfPatrol.setXztmc(bean.getCompanyName());
            dailyRecordOfPatrol.setXfzr(bean.getCompanyPerson());
            dailyRecordOfPatrol.setXzch(bean.getRegistrationCode());
            dailyRecordOfPatrol.setXxkzh(bean.getFoodLicense());
            dailyRecordOfPatrol.setXxxdz(bean.getGpsAddress());
            dailyRecordOfPatrol.setXjd(bean.getGpsLongitude());
            dailyRecordOfPatrol.setXwd(bean.getGpsLatitude());
            dailyRecordOfPatrol.setXqtfjxx(
                    new StrBuilder(",")
                            .append(bean.getImgUrl())
                            .append(bean.getDocUrl())
                            .getStr());
            dailyRecordOfPatrol.setXdqdf(bean.getTotalScore());
            dailyRecordOfPatrol.setXpdhdf(bean.getGotScore());
            //标化分
            //dailyRecordOfPatrol.setXcffs(bean.getStandardSore());
            // 智慧监管数据不存在检查结果，目前评级为D则判定为不符合，A、B、C则判定为符合
            String grade = bean.getGrade();
            String checkResult;
            if (StringUtils.isBlank(grade)) {
                checkResult = Constant.InspectCheckResult.UNKNOWN.getResult();
            } else if (grade.contains(GRADE_D)) {
                checkResult = Constant.InspectCheckResult.DISQUALIFICATION.getResult();
            } else {
                checkResult = Constant.InspectCheckResult.QUALIFICATION.getResult();
            }
            dailyRecordOfPatrol.setXxjycljg1(checkResult);
            dailyRecordOfPatrol.setXsm(
                    new StrBuilder(";")
                            .append(grade)
                            .append(bean.getWorkRecord())
                            .getStr());
            dailyRecordOfPatrol.setXxcry(bean.getOrganizerName() + ";" + bean.getParticipantsName());
            dailyRecordOfPatrol.setXxcdwbh(OrgCodeTranslateUtils.common2fsnip(bean.getUnitCode()));
            dailyRecordOfPatrol.setXxcdw(bean.getJudgeUnit() + ";" + bean.getJudgeDepartment());
            dailyRecordOfPatrol.setCjclx(CHECK_TYPE);
            return dailyRecordOfPatrol;
        }).collect(Collectors.toList());
        return dailyRecordOfPatrols;
    }
}