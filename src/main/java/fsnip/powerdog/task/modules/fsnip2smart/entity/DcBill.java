package fsnip.powerdog.task.modules.fsnip2smart.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * @author kun.tan
 * @description 快检单数据
 * @date 2018-7-13 10:17:15
 */
@TableName("fsnip_qc_bill")
public class DcBill {

    @TableId("bill_uuid")
    private String billUuid;
    @TableField("bill_no")
    private String billNo;
    @TableField("creater_type")
    private Byte createrType;
    @TableField("create_orgcode")
    private String createOrgcode;
    @TableField("enterprise_id")
    private String enterpriseId;
    @TableField("check_time")
    private Date checkTime;
    @TableField("task_category")
    private String taskCategory;
    @TableField("bill_sort")
    private Integer billSort;
    @TableField("bill_state")
    private Byte billState;
    @TableField("create_time")
    private Date createTime;
    @TableField("update_time")
    private Date updateTime;
    @TableField("plan_uuid")
    private String planUuid;
    @TableField("plan_detail_uuid")
    private String planDetailUuid;
    @TableField("plan_dist_uuid")
    private String planDistUuid;
    @TableField("goods_uuid")
    private String goodsUuid;
    @TableField("checkedperson_uuid")
    private String checkedpersonUuid;
    @TableField("quickcheckinfo_uuid")
    private String quickcheckinfoUuid;

    public String getBillUuid() {
        return billUuid;
    }

    public void setBillUuid(String billUuid) {
        this.billUuid = billUuid;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getCreateOrgcode() {
        return createOrgcode;
    }

    public void setCreateOrgcode(String createOrgcode) {
        this.createOrgcode = createOrgcode;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getTaskCategory() {
        return taskCategory;
    }

    public void setTaskCategory(String taskCategory) {
        this.taskCategory = taskCategory;
    }

    public Integer getBillSort() {
        return billSort;
    }

    public void setBillSort(Integer billSort) {
        this.billSort = billSort;
    }

    public Byte getBillState() {
        return billState;
    }

    public void setBillState(Byte billState) {
        this.billState = billState;
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

    public String getPlanUuid() {
        return planUuid;
    }

    public void setPlanUuid(String planUuid) {
        this.planUuid = planUuid;
    }

    public String getPlanDetailUuid() {
        return planDetailUuid;
    }

    public void setPlanDetailUuid(String planDetailUuid) {
        this.planDetailUuid = planDetailUuid;
    }

    public String getPlanDistUuid() {
        return planDistUuid;
    }

    public void setPlanDistUuid(String planDistUuid) {
        this.planDistUuid = planDistUuid;
    }

    public String getGoodsUuid() {
        return goodsUuid;
    }

    public void setGoodsUuid(String goodsUuid) {
        this.goodsUuid = goodsUuid;
    }

    public String getCheckedpersonUuid() {
        return checkedpersonUuid;
    }

    public void setCheckedpersonUuid(String checkedpersonUuid) {
        this.checkedpersonUuid = checkedpersonUuid;
    }

    public String getQuickcheckinfoUuid() {
        return quickcheckinfoUuid;
    }

    public void setQuickcheckinfoUuid(String quickcheckinfoUuid) {
        this.quickcheckinfoUuid = quickcheckinfoUuid;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Byte getCreaterType() {
        return createrType;
    }

    public void setCreaterType(Byte createrType) {
        this.createrType = createrType;
    }
}
