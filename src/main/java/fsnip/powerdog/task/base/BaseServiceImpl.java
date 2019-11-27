package fsnip.powerdog.task.base;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.toolkit.CollectionUtils;
import fsnip.powerdog.task.common.exception.RRException;
import fsnip.powerdog.task.common.unaltered.Constant;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 封装数据同步service
 * @Author: kun.tan
 * @DateTime: 2018-07-12 17:01
 */
public class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> {

    public static final int handleSize = 1000;
    public static final int handleSizeForLims = 2500;

    public List<T> queryFromSource(Date startTime, Date endTime) {
        return selectList(new EntityWrapper<T>().between("RECORD_INSERT_TIME", startTime, endTime));
    }

    public List<T> queryFromSource(EntityWrapper<T> wrapper) {
        if (null == wrapper) {
            wrapper = new EntityWrapper<T>();
            wrapper.eq("syn_status", Constant.SYN_STATUS_NO);
            wrapper.last("LIMIT " + handleSize);
        }
        return selectList(wrapper);
    }

    public List<T> queryFromSourceForLims(EntityWrapper<T> wrapper) {
        if (null == wrapper) {
            wrapper = new EntityWrapper<T>();
            wrapper.eq("syn_status", Constant.SYN_STATUS_NO);
            wrapper.last(" ORDER BY created_at DESC LIMIT " + handleSizeForLims);
        }
        return selectList(wrapper);
    }

    public boolean insert2Target(List<T> beans) {
        if (CollectionUtils.isNotEmpty(beans)) {
            return insertOrUpdateBatch(beans);
        }
        return true;
    }

    public boolean updateStatus(List<T> beans) {
        if (CollectionUtils.isNotEmpty(beans)) {
            for (T bean : beans) {
                if (null == bean) {
                    continue;
                }
                if (bean instanceof StatusModel) {
                    ((StatusModel) bean).setSynStatus(Constant.SYN_STATUS_YES);
                } else {
                    throw new RRException("实体无同步状态，请继承BaseModel");
                }
            }
            return insertOrUpdateBatch(beans);
        }
        return false;
    }

    public final boolean synFromSource2Target(Date startTime, Date endTime) {
        List<T> beans = queryFromSource(startTime, endTime);
        boolean success = insert2Target(beans);
        if (success && whether2UpdateStatus()) {
            return updateStatus(beans);
        }
        return success;
    }

    public final boolean synFromSource2Target() {
        List<T> beans = queryFromSource(null);
        boolean success = insert2Target(beans);
        if (success && whether2UpdateStatus()) {
            return updateStatus(beans);
        }
        return success;
    }

    public final boolean synFromSource2TargetForLims() {
        List<T> beans = queryFromSourceForLims(null);
        boolean success = insert2Target(beans);
        if (success && whether2UpdateStatus()) {
            return updateStatus(beans);
        }
        return success;
    }
    protected boolean whether2UpdateStatus() {
        return false;
    }
}
