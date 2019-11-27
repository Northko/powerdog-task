package fsnip.powerdog.task.modules.smart2fsnip.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import fsnip.powerdog.task.modules.smart2fsnip.entity.ScZfxchc;
import fsnip.powerdog.task.modules.smart2fsnip.entity.ScZfxchcFsnip;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @User: QMQ
 * @DateTime: 2018-07-13 13:09
 */
@Mapper
public interface WorkShopCheckSyncBySpFsnipDao extends BaseMapper<ScZfxchcFsnip> {
}
