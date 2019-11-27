package fsnip.powerdog.task.modules.smart2fsnip.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import fsnip.powerdog.task.modules.smart2fsnip.entity.CateringRiskLevel;
import fsnip.powerdog.task.modules.smart2fsnip.entity.CateringRiskLevelRecord;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 餐饮风险等级记录
 * @Author: kun.tan
 * @DateTime: 2018-08-02 18:05
 */
@Mapper
public interface CateringRiskLevelRecordDao extends BaseMapper<CateringRiskLevelRecord> {

}
