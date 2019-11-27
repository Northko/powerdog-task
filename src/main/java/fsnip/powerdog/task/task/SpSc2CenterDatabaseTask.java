package fsnip.powerdog.task.task;

import fsnip.powerdog.task.modules.spsc2fsnip.service.ScXkzxxService;
import fsnip.powerdog.task.modules.spsc2fsnip.service.SpBusinessLicenseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author chenxiaolin 2018/7/12 17:03
 * @Desc sp【经营许可归档有效数据和注销数据】、sc【生产许可和小作坊数据】同步到中间数据库的定时任务
 */
@Service
@EnableScheduling
public class SpSc2CenterDatabaseTask {

    private final Logger logger = LogManager.getLogger();

    @Autowired
    private SpBusinessLicenseService spBusinessLicenseService;
    @Autowired
    private ScXkzxxService scXkzxxService;

    SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat SDF_TIME = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * @author chenxiaolin 2018/7/13 9:21
     * @Desc 同步经营许可归档有效数据和注销数据到中间数据库
     * 每天凌晨2点开始执行
     */
    @Scheduled(cron = "0 0 2 * * ?")
    public void synchronizationSP2CenterDatabase() {

        logger.info("*********************经营许可数据开始********************************");
        long millis = System.currentTimeMillis();
        logger.info("同步经营许可数据开始执行时间...：" + SDF_TIME.format(new Date()));

        String dateStr = getDateStr();
        spBusinessLicenseService.synchronizationSP2CenterDatabase(dateStr, dateStr);

        long millis2 = System.currentTimeMillis();
        logger.info("同步经营许可总耗时：" + (millis2 - millis) + " ms");
        logger.info("*********************经营许可数据结束********************************");

    }

    /**
     * Create by chenxiaolin on 2018/7/13 11:44
     *
     * @Desc 同步生产许可证信息到中间数据库
     * 每天凌晨三点开始执行
     */
    @Scheduled(cron = "0 0 3 * * ?")
    public void synchronizationSC2CenterDatabase() {

        long millis = System.currentTimeMillis();

        logger.info("*********************生产许可证数据开始********************************");
        logger.info("同步生产许可证数据开始执行时间...：" + SDF_TIME.format(new Date()));

        String dateStr = getDateStr();
        scXkzxxService.synchronizationSC2CenterDatabase(dateStr, dateStr);

        long millis2 = System.currentTimeMillis();
        logger.info("同步同步生产许可总耗时：" + (millis2 - millis) + " ms");
        logger.info("********************生产许可证数据结束********************************");

    }

    @Scheduled(cron = "0 0 0/1 * * ?")
    public void synSmallWorkshopCheck2Sc() {
        scXkzxxService.synSmallWorkshopCheck2Sc();
    }

    /**
     * 获取当前的前一天日期字符串
     *
     * @return
     */
    private String getDateStr() {

        Date date = null;
        String dateStr = "";
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        date = calendar.getTime();
        dateStr = SDF.format(date);

        //为了初次同步数据时要把之前的数据也同步
        if ("2018-07-17".equals(dateStr)) {
            return "";
        }

        return dateStr;

    }

}
