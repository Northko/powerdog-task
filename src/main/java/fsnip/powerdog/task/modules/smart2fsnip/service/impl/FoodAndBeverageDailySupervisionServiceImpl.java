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
import fsnip.powerdog.task.modules.smart2fsnip.dao.FoodAndBeverageDailySupervisionDao;
import fsnip.powerdog.task.modules.smart2fsnip.entity.DailyRecordOfPatrol;
import fsnip.powerdog.task.modules.smart2fsnip.entity.FoodAndBeverageDailySupervision;
import fsnip.powerdog.task.modules.smart2fsnip.service.DailyRecordOfPatrolService;
import fsnip.powerdog.task.modules.smart2fsnip.service.FoodAndBeverageDailySupervisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 食品、餐饮日常监督记录 实现类
 * </p>
 *
 * @author kun.tan
 * @since 2018-8-2 17:00:57
 */
@Service
public class FoodAndBeverageDailySupervisionServiceImpl extends BaseServiceImpl<FoodAndBeverageDailySupervisionDao, FoodAndBeverageDailySupervision> implements FoodAndBeverageDailySupervisionService {

    @Autowired
    private DailyRecordOfPatrolService dailyRecordOfPatrolService;

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public List<FoodAndBeverageDailySupervision> queryFromSource(EntityWrapper<FoodAndBeverageDailySupervision> wrapper) {
        return super.queryFromSource(wrapper);
    }

    @Override
    public boolean insert2Target(List<FoodAndBeverageDailySupervision> beans) {
        List<DailyRecordOfPatrol> dailyRecordOfPatrols = dailySupervision2DailyRecordOfPatrol(beans);
        return dailyRecordOfPatrolService.insert2Target(dailyRecordOfPatrols);
    }

    @Override
    @DataSource(name = DataSourceNames.FIRST)
    public boolean updateStatus(List<FoodAndBeverageDailySupervision> foodAndBeverageDailySupervisions) {
        return super.updateStatus(foodAndBeverageDailySupervisions);
    }

    @Override
    protected boolean whether2UpdateStatus() {
        return true;
    }

    private List<DailyRecordOfPatrol> dailySupervision2DailyRecordOfPatrol(List<FoodAndBeverageDailySupervision> beans) {
        if (CollectionUtils.isEmpty(beans)) {
            return Collections.EMPTY_LIST;
        }
        List<DailyRecordOfPatrol> dailyRecordOfPatrols = beans.stream().map(bean -> {
            DailyRecordOfPatrol dailyRecordOfPatrol = new DailyRecordOfPatrol();
            dailyRecordOfPatrol.setXuuid(bean.getId());
            dailyRecordOfPatrol.setCjclx(bean.getJudgeTypeMain());
            String judgeType = bean.getJudgeType();
            dailyRecordOfPatrol.setXqylb(Constant.EntType.getTypeByDesc(judgeType));
            dailyRecordOfPatrol.setXsjly(DataFrom.SMART.name());
            dailyRecordOfPatrol.setXxcsj(bean.getCreateDate());
            dailyRecordOfPatrol.setXxcdwbh(OrgCodeTranslateUtils.common2fsnip(bean.getUnitCode()));
            dailyRecordOfPatrol.setXxcdw(bean.getJudgeUnit() + bean.getJudgeDepartment());
            dailyRecordOfPatrol.setXxcry(bean.getOrganizerName() + ";" + bean.getParticipantsName());
            dailyRecordOfPatrol.setXbzsj(bean.getCreateDate());
            dailyRecordOfPatrol.setXztmc(bean.getCompanyName());
            dailyRecordOfPatrol.setXfzr(bean.getCompanyPerson());
            dailyRecordOfPatrol.setXzch(bean.getRegistrationCode());
            dailyRecordOfPatrol.setXxkzh(bean.getCreditCode());
            dailyRecordOfPatrol.setXxxdz(bean.getGpsAddress());
            dailyRecordOfPatrol.setXjd(bean.getGpsLongitude());
            dailyRecordOfPatrol.setXwd(bean.getGpsLatitude());
            dailyRecordOfPatrol.setXxjycljg1(bean.getCheckResult());
            dailyRecordOfPatrol.setXsm(
                    new StrBuilder(";")
                            .append(bean.getWorkRecord())
                            .getStr());
            dailyRecordOfPatrol.setXxjycljg1(bean.getDealContent());
            dailyRecordOfPatrol.setXqtfjxx(
                    new StrBuilder(",")
                            .append(bean.getImgUrl())
                            .append(bean.getCheckResultDoc())
                            .append(bean.getCheckTableDoc())
                            .append(bean.getTellPageDoc())
                            .append(bean.getOpnionDoc())
                            .getStr());
            return dailyRecordOfPatrol;
        }).collect(Collectors.toList());
        return dailyRecordOfPatrols;
    }
}