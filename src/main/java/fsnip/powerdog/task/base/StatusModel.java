package fsnip.powerdog.task.base;

import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 实体基类
 * @Author: kun.tan
 * @DateTime: 2018-07-13 14:56
 */
public class StatusModel implements Serializable {

    /**
     * 同步状态
     */
    @TableField("syn_status")
    private Integer synStatus;

    public Integer getSynStatus() {
        return synStatus;
    }

    public void setSynStatus(Integer synStatus) {
        this.synStatus = synStatus;
    }
}
