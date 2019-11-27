package fsnip.powerdog.task.modules.fsnip2smart.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import fsnip.powerdog.task.modules.fsnip2smart.entity.WorkShopCheck;
import fsnip.powerdog.task.modules.fsnip2smart.entity.WorkShopCheckFsnip;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:小作坊检查记录
 * @User: QMQ
 * @DateTime: 2018-07-13 10:51
 */
@Mapper
public interface WorkShopCheckFsnipDao extends BaseMapper<WorkShopCheckFsnip> {
}
