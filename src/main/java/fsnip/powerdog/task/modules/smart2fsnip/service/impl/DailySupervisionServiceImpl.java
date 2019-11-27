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
import fsnip.powerdog.task.modules.smart2fsnip.dao.DailySupervisionDao;
import fsnip.powerdog.task.modules.smart2fsnip.entity.DailyRecordOfPatrol;
import fsnip.powerdog.task.modules.smart2fsnip.entity.DailySupervision;
import fsnip.powerdog.task.modules.smart2fsnip.service.DailyRecordOfPatrolService;
import fsnip.powerdog.task.modules.smart2fsnip.service.DailySupervisionService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 一般日常监管记录  服务实现类
 * </p>
 *
 * @author kun.tan
 * @since 2018-8-2 16:12:21
 */
@Service
public class DailySupervisionServiceImpl extends BaseServiceImpl<DailySupervisionDao, DailySupervision> implements DailySupervisionService {

    /**
     * 检查发现幺蛾子
     */
    public static final String BUG_FOUND = "发现问题";
    public static final String BUG_NOT_FOUND = "未发现问题";

    @Autowired
    private DailyRecordOfPatrolService dailyRecordOfPatrolService;

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public List<DailySupervision> queryFromSource(EntityWrapper<DailySupervision> wrapper) {
        return super.queryFromSource(wrapper);
    }

    @Override
    public boolean insert2Target(List<DailySupervision> beans) {
        List<DailyRecordOfPatrol> dailyRecordOfPatrols = dailySupervision2DailyRecordOfPatrol(beans);
        return dailyRecordOfPatrolService.insert2Target(dailyRecordOfPatrols);
    }

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public boolean updateStatus(List<DailySupervision> dailySupervisions) {
        return super.updateStatus(dailySupervisions);
    }

    @Override
    protected boolean whether2UpdateStatus() {
        return true;
    }

    private List<DailyRecordOfPatrol> dailySupervision2DailyRecordOfPatrol(List<DailySupervision> beans) {
        if (CollectionUtils.isEmpty(beans)) {
            return Collections.EMPTY_LIST;
        }
        List<DailyRecordOfPatrol> dailyRecordOfPatrols = beans.stream().map(bean -> {
            DailyRecordOfPatrol dailyRecordOfPatrol = new DailyRecordOfPatrol();
            dailyRecordOfPatrol.setXuuid(bean.getId());
            String judgeType = bean.getJudgeType();
            dailyRecordOfPatrol.setXqylb(Constant.EntType.getTypeByDesc(judgeType));
            dailyRecordOfPatrol.setCjclx(judgeType);
            dailyRecordOfPatrol.setXsjly(DataFrom.SMART.name());
            dailyRecordOfPatrol.setXbt(bean.getTaskName());
            dailyRecordOfPatrol.setXxcdwbh(OrgCodeTranslateUtils.common2fsnip(bean.getUnitCode()));
            dailyRecordOfPatrol.setXxcry(bean.getOrganizerName() + ";" + bean.getParticipantsName());
            dailyRecordOfPatrol.setXxcdw(bean.getJudgeUnit() + bean.getJudgeDepartment());
            dailyRecordOfPatrol.setXbzsj(bean.getTaskTime());
            dailyRecordOfPatrol.setXxcsj(bean.getTaskTime());
            dailyRecordOfPatrol.setXztmc(bean.getCompanyName());
            dailyRecordOfPatrol.setXfzr(bean.getCompanyPerson());
            dailyRecordOfPatrol.setXzch(bean.getRegistrationCode());
            dailyRecordOfPatrol.setXxkzh(bean.getCreditCode());
            dailyRecordOfPatrol.setXxxdz(bean.getGpsAddress());
            dailyRecordOfPatrol.setXjd(bean.getGpsLongitude());
            dailyRecordOfPatrol.setXwd(bean.getGpsLatitude());
            dailyRecordOfPatrol.setXfjlj(bean.getTaskImages());
            //智慧监管数据检查结果判定
            String smartCheckResult = bean.getCheckResult();
            String checkResult;
            if (StringUtils.isBlank(smartCheckResult)) {
                checkResult = Constant.InspectCheckResult.UNKNOWN.getResult();
            } else {
                int indexOfNotFound = smartCheckResult.indexOf(BUG_NOT_FOUND);
                if (indexOfNotFound >= 0 && smartCheckResult.indexOf(BUG_FOUND) - 1 != indexOfNotFound) {
                    checkResult = Constant.InspectCheckResult.QUALIFICATION.getResult();
                } else {
                    checkResult = Constant.InspectCheckResult.DISQUALIFICATION.getResult();
                }
            }
            dailyRecordOfPatrol.setXxjycljg1(checkResult);
            dailyRecordOfPatrol.setXsm(
                    new StrBuilder(";")
                            .append(smartCheckResult)
                            .append(bean.getTaskReport())
                            .getStr());
            return dailyRecordOfPatrol;
        }).collect(Collectors.toList());
        return dailyRecordOfPatrols;
    }
}