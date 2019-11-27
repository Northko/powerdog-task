package fsnip.powerdog.task.task;

import fsnip.powerdog.task.modules.lims2supervise.service.LimsSpBsbsService;
import fsnip.powerdog.task.modules.lims2supervise.service.LimsSpdataService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @description: lims同步数据到监管
 * @author: kun.tan
 * @dateTime: 2018-12-20 9:23
 */
@Service
@EnableScheduling
public class Lims2SuperviseTask {

    private final Logger logger = LogManager.getLogger();

    @Autowired
    private LimsSpBsbsService limsSpBsbsService;
    @Autowired
    private LimsSpdataService limsSpdataService;

    //@Scheduled(cron = "0 0 0/1 * * ?")
    //@Scheduled(cron = "*/30 * * * * ?")
    @Scheduled(cron = "0 30 0 * * ?")//每天半夜12点30分执行一次
    public void synSampleDataFromLimis2Supervise() {
        Date now = Calendar.getInstance().getTime();
        try {
            boolean success = limsSpBsbsService.synFromSource2TargetForLims();
            logger.info("limsSpBsbsService " + now + "同步..." + success);

            success = limsSpdataService.synFromSource2TargetForLims();
            logger.info("limsSpdataService " + now + "同步..." + success);

        } catch (Exception e) {
            logger.error("定时任务synSampleDataFromLimis2Supervise在" + now + "执行...异常: " + e.getMessage());
        }
    }
}
