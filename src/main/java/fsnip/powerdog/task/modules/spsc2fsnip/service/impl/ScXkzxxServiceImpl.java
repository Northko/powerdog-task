package fsnip.powerdog.task.modules.spsc2fsnip.service.impl;

import com.baomidou.mybatisplus.enums.SqlLike;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import fsnip.powerdog.task.datasources.DataSourceNames;
import fsnip.powerdog.task.datasources.annotation.DataSource;
import fsnip.powerdog.task.modules.spsc2fsnip.dao.ScXkzxxDao;
import fsnip.powerdog.task.modules.spsc2fsnip.entity.*;
import fsnip.powerdog.task.modules.spsc2fsnip.service.*;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenxiaolin 2018/7/12 16:08
 * @Desc 经营许可基本信息
 */
@Service("scXkzxxService")
public class ScXkzxxServiceImpl extends ServiceImpl<ScXkzxxDao, ScXkzxxEntity> implements ScXkzxxService {

    private final Logger logger = LogManager.getLogger();

    @Autowired
    private CenterXkzxxService centerXkzxxService;
    @Autowired
    private ScXzfService scXzfService;
    @Autowired
    private CenterXzfService centerXzfService;
    @Autowired
    private ScXzfhcService scXzfhcService;
    @Autowired
    private CenterXzfhcService centerXzfhcService;

    @DataSource(name = DataSourceNames.FOUR)
    @Override
    public void synchronizationSC2CenterDatabase(String beginDate, String endDate) {

        /**
         * 1、同步生产许可信息到中间库
         */
        EntityWrapper wrapper = new EntityWrapper<ScXkzxxEntity>();
        if (StringUtils.isNotBlank(beginDate) && StringUtils.isNotBlank(endDate)) {
            wrapper.between("RECORD_INSERT_TIME", beginDate + " 00:00:00", endDate + " 23:59:59");
        }
        wrapper.like("ssgjbh", "5201", SqlLike.RIGHT);

        List<ScXkzxxEntity> list = selectList(wrapper);

        logger.info("生产许可总记录数：" + list.size());

        if (list != null && list.size() > 0) {
            for (ScXkzxxEntity scXkzxxEntity : list) {

                CenterXkzxxEntity centerXkzxxEntity = new CenterXkzxxEntity(scXkzxxEntity);
                centerXkzxxService.saveInfo(centerXkzxxEntity);
            }
        }

        /**
         * 2、同步小作坊信息到中间库
         */
        List<ScXzfEntity> xzfList = scXzfService.getInfoList(beginDate, endDate);

        logger.info("小作坊总记录数：" + xzfList.size());

        if (xzfList != null && xzfList.size() > 0) {
            for (ScXzfEntity scXzfEntity : xzfList) {

                CenterXzfEntity centerXzfEntity = new CenterXzfEntity(scXzfEntity);
                centerXzfService.saveInfo(centerXzfEntity);

            }
        }
    }

    @DataSource(name = DataSourceNames.FOUR)
    @Override
    public void synSmallWorkshopCheck2Sc() {
        /**
         * 同步中间库的小作坊核查到生产许可
         */
        List<CenterXzfhcEntity> xzfhcList = centerXzfhcService.getXzfhcKist();

        logger.info("小作坊核查总记录数：" + xzfhcList.size());

        if (xzfhcList != null && xzfhcList.size() > 0) {
            for (CenterXzfhcEntity centerXzfhcEntity : xzfhcList) {

                ScXzfhcEntity scXzfhcEntity = new ScXzfhcEntity(centerXzfhcEntity);
                scXzfhcService.saveXzfhc(scXzfhcEntity);
                // 核查通过
                String passed = "1";
                ScXzfEntity scXzfEntity = new ScXzfEntity();
                scXzfEntity.setId(centerXzfhcEntity.getXzfid());
                if (passed.equals(centerXzfhcEntity.getIsPassed())) {
                    // 决定登记
                    int state = 4;
                    scXzfEntity.setState(state);
                }
                // 已处理
                Integer handled = 2;
                scXzfEntity.setInspectResult(handled);
                scXzfService.updateById(scXzfEntity);
                centerXzfhcEntity.setSynState("1");
                centerXzfhcService.updateSynStatus(centerXzfhcEntity);

            }
        }
    }
}
