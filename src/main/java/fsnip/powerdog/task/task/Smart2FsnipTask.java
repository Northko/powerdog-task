package fsnip.powerdog.task.task;

import fsnip.powerdog.task.modules.smart2fsnip.service.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author kun.tan
 * @description 定时任务 从智慧共治公司同步数据
 * @date 2018-7-12 16:03:49
 */
@Service
@EnableScheduling
public class Smart2FsnipTask {

    private final Logger logger = LogManager.getLogger();

    @Autowired
    private SafetyResponsibilityAgreementService safetyResponsibilityAgreementService;
    @Autowired
    private RecordOfYear4DinnerService recordOfYear4DinnerService;
    @Autowired
    private TrainingAchievementService trainingAchievementService;
    @Autowired
    private SmartImportantEventService smartImportantEventService;
    @Autowired
    private SmartImportantEventSubService smartImportantEventSubService;
    @Autowired
    private CateringQuantizationService cateringQuantizationService;
    @Autowired
    private DailySupervisionService dailySupervisionService;
    @Autowired
    private CateringRiskLevelService cateringRiskLevelService;
    @Autowired
    private FoodAndBeverageDailySupervisionService foodAndBeverageDailySupervisionService;
    @Autowired
    private FsnipJgXckfjlService fsnipJgXckfjlService;
    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");

    /**
     * 整点执行
     */
    @Scheduled(cron = "0 0 0/1 * * ?")
    public void synFromDataCenter2Supervise() {
        String now = sdf.format(Calendar.getInstance().getTime());
        try {
            boolean success = safetyResponsibilityAgreementService.synFromSource2Target();
            logger.info("safetyResponsibilityAgreementService " + now + "同步..." + success);

            success = trainingAchievementService.synFromSource2Target();
            logger.info("trainingAchievementService " + now + "同步..." + success);

            success = recordOfYear4DinnerService.synFromSource2Target();
            logger.info("recordOfYear4DinnerService " + now + "同步..." + success);

            success = smartImportantEventService.synFromSource2Target();
            logger.info("smartImportantEventService " + now + "同步..." + success);

            success = smartImportantEventSubService.synFromSource2Target();
            logger.info("smartImportantEventSubService " + now + "同步..." + success);

        } catch (Exception e) {
            logger.error("定时任务synFromDataCenter2Supervise在" + now + "执行...异常: " + e.getMessage());
        }
    }

    /**
     * 整点执行
     */
    @Scheduled(cron = "0 0 0/1 * * ?")
    public void synSmartDataFromDataCenter2Supervise() {
        String now = sdf.format(Calendar.getInstance().getTime());
        try {

            boolean success = cateringQuantizationService.synFromSource2Target();
            logger.info("cateringQuantizationService " + now + "同步..." + success);

            success = dailySupervisionService.synFromSource2Target();
            logger.info("dailySupervisionService " + now + "同步..." + success);

            success = cateringRiskLevelService.synFromSource2Target();
            logger.info("cateringRiskLevelService " + now + "同步..." + success);

            success = foodAndBeverageDailySupervisionService.synFromSource2Target();
            logger.info("foodAndBeverageDailySupervisionService " + now + "同步..." + success);

            success = fsnipJgXckfjlService.synFromSource2Target();
            logger.info("fsnipJgXckfjlService " + now + "同步..." + success);

        } catch (Exception e) {
            logger.error("定时任务synSmartDataFromDataCenter2Supervise在" + now + "执行...异常: " + e.getMessage());
        }
    }
}
