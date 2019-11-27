package fsnip.powerdog.task.modules.smart2fsnip.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import fsnip.powerdog.task.modules.smart2fsnip.entity.DailyRecordOfPatrol;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description: 日常巡检记录（Fsnip）
 * @Author: kun.tan
 * @DateTime: 2018-8-2 18:06:15
 */
@Mapper
public interface DailyRecordOfPatrolDao extends BaseMapper<DailyRecordOfPatrol> {

}
