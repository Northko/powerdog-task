package fsnip.powerdog.task.modules.fsnip2smart.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 快检检测项目实体
 * @Author: kun.tan
 * @DateTime: 2018-7-13 10:33:33
 */
@TableName("fsnip_qc_billcheckitem")
public class DcBillCheckItem {

    @TableId("check_item_uuid")
    private String checkItemUuid;
    @TableField("quickcheckinfo_uuid")
    private String quickcheckinfoUuid;
    @TableField("check_item")
    private String checkItem;
    @TableField("standard_value")
    private String standardValue;
    @TableField("actual_value")
    private String actualValue;
    @TableField("check_result")
    private Byte checkResult;
    @TableField("create_time")
    private Date createTime;
    @TableField("update_time")
    private Date updateTime;

    public String getCheckItemUuid() {
        return checkItemUuid;
    }

    public void setCheckItemUuid(String checkItemUuid) {
        this.checkItemUuid = checkItemUuid;
    }

    public String getQuickcheckinfoUuid() {
        return quickcheckinfoUuid;
    }

    public void setQuickcheckinfoUuid(String quickcheckinfoUuid) {
        this.quickcheckinfoUuid = quickcheckinfoUuid;
    }

    public String getCheckItem() {
        return checkItem;
    }

    public void setCheckItem(String checkItem) {
        this.checkItem = checkItem;
    }

    public String getStandardValue() {
        return standardValue;
    }

    public void setStandardValue(String standardValue) {
        this.standardValue = standardValue;
    }

    public String getActualValue() {
        return actualValue;
    }

    public void setActualValue(String actualValue) {
        this.actualValue = actualValue;
    }

    public Byte getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(Byte checkResult) {
        this.checkResult = checkResult;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
