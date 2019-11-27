package fsnip.powerdog.task.base;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 封装数据同步模板方法
 * @Author: kun.tan
 * @DateTime: 2018-07-12 18:11
 */
public interface BaseService<T> extends IService<T> {

    List<T> queryFromSource(Date startTime, Date endTime);

    List<T> queryFromSource(EntityWrapper<T> wrapper);

    List<T> queryFromSourceForLims(EntityWrapper<T> wrapper);

    boolean insert2Target(List<T> beans);

    boolean updateStatus(List<T> beans);

    /**
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @return 是否成功
     */
    boolean synFromSource2Target(Date startTime, Date endTime);

    boolean synFromSource2Target();

    boolean synFromSource2TargetForLims();
}
