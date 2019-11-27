package fsnip.powerdog.task.task;

import fsnip.powerdog.task.common.utils.BeanUtilsPlugin;
import fsnip.powerdog.task.modules.fsnip2smart.entity.WorkShopCheck;
import fsnip.powerdog.task.modules.fsnip2smart.entity.WorkShopCheckFsnip;
import fsnip.powerdog.task.modules.fsnip2smart.service.QcBillService;
import fsnip.powerdog.task.modules.fsnip2smart.service.SpBsbsService;
import fsnip.powerdog.task.modules.fsnip2smart.service.WorkShopCheckSyncByJgFsnipService;
import fsnip.powerdog.task.modules.fsnip2smart.service.WorkShopCheckSyncByJgService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 定时任务 同步数据到中间库
 * @Author: kun.tan
 * @DateTime: 2018-07-13 10:58
 */
@Service
@EnableScheduling
public class Fsnip2SmartTask {

    private final Logger logger = LogManager.getLogger();

    @Autowired
    private QcBillService billService;
    @Autowired
    private SpBsbsService bsbsService;
    @Autowired
    private WorkShopCheckSyncByJgService workShopCheckSyncByJgService;
    @Autowired
    private WorkShopCheckSyncByJgFsnipService workShopCheckSyncByJgFsnipService;

    /**
     * 整点执行
     */
    @Scheduled(cron = "0 0 0/1 * * ?")
    public void synQuickCheckDataFromSupervise2DataCenter() {
        Calendar calendar = Calendar.getInstance();
        Date endTime = calendar.getTime();
        calendar.set(Calendar.HOUR, -1);
        Date startTime = calendar.getTime();
        try {
            boolean success = billService.synFromSource2Target(startTime, endTime);
            logger.info("快检数据定时任务synQuickCheckDataFromSupervise2DataCenter在" + endTime + "执行..." + success);
        } catch (Exception e) {
            logger.error("定时任务synQuickCheckDataFromSupervise2DataCenter在" + endTime + "执行...异常: " + e.getMessage());
        }
    }

    /**
     * 整点执行
     */
    @Scheduled(cron = "0 0 0/1 * * ?")
    public void synInspectionDataFromSupervise2DataCenter() {
        Calendar calendar = Calendar.getInstance();
        Date endTime = calendar.getTime();
        calendar.set(Calendar.HOUR, -1);
        Date startTime = calendar.getTime();
        try {
            boolean success = bsbsService.synFromSource2Target(startTime, endTime);
            logger.info("抽检数据定时任务synInspectionDataFromSupervise2DataCenter在" + endTime + "执行..." + success);
        } catch (Exception e) {
            logger.error("定时任务synInspectionDataFromSupervise2DataCenter在" + endTime + "执行...异常: " + e.getMessage());
        }
    }


    /**
     * 从监管同步数据到中间库
     */
    @Scheduled(cron = "0 0 0/1 * * ?")
    public void synWorkshopCheckDataFromSupervise2DataCenter() {
        Calendar calendar = Calendar.getInstance();
        Date endTime = calendar.getTime();
        calendar.set(Calendar.HOUR, -1);
        Date startTime = calendar.getTime();
        List<WorkShopCheckFsnip> workShopCheckFsnipList = workShopCheckSyncByJgFsnipService.queryFromSource(startTime, endTime);
        List<WorkShopCheck> workShopCheckList = new ArrayList<>();
        for (WorkShopCheckFsnip workShopCheckFsnip : workShopCheckFsnipList) {
            WorkShopCheck workShopCheck = new WorkShopCheck();
            BeanUtilsPlugin.copyPropertiesIgnoreNull(workShopCheckFsnip, workShopCheck);
            workShopCheckList.add(workShopCheck);
        }
        boolean success = workShopCheckSyncByJgService.insert2Target(workShopCheckList);
        logger.info("定时任务synWorkshopCheckDataFromSupervise2DataCenter在" + endTime + "执行..." + success);
    }

}
