package fsnip.powerdog.task.modules.fsnip2smart.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 快速检测信息表对应实体
 *
 * @author kun.tan
 * @date 2018-7-13 10:27:46
 */
@TableName("fsnip_qc_billquickcheckinfo")
public class DcBillQuickCheckInfo {

    @TableId("quickcheckinfo_uuid")
    private String quickcheckinfoUuid;
    @TableField("check_no")
    private String checkNo;
    @TableField("check_device")
    private String checkDevice;
    @TableField("sample_batcheNo")
    private String sampleBatcheNo;
    @TableField("sample_quantity")
    private int sampleQuantity;
    @TableField("check_item")
    private String checkItem;
    @TableField("check_result")
    private Byte checkResult;
    @TableField("result_confirm")
    private Byte resultConfirm;
    @TableField("is_sendcheck")
    private Byte isSendcheck;
    @TableField("attachment_info")
    private String attachmentInfo;
    @TableField("quickcheckinfo_sort")
    private Integer quickcheckinfoSort;
    @TableField("quickcheckinfo_state")
    private Byte quickcheckinfoState;
    @TableField("create_time")
    private Date createTime;
    @TableField("update_time")
    private Date updateTime;
    @TableField("longitude")
    private String longitude;
    @TableField("latitude")
    private String latitude;

    public String getQuickcheckinfoUuid() {
        return quickcheckinfoUuid;
    }

    public void setQuickcheckinfoUuid(String quickcheckinfoUuid) {
        this.quickcheckinfoUuid = quickcheckinfoUuid;
    }

    public String getCheckNo() {
        return checkNo;
    }

    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo;
    }

    public String getCheckDevice() {
        return checkDevice;
    }

    public void setCheckDevice(String checkDevice) {
        this.checkDevice = checkDevice;
    }

    public String getSampleBatcheNo() {
        return sampleBatcheNo;
    }

    public void setSampleBatcheNo(String sampleBatcheNo) {
        this.sampleBatcheNo = sampleBatcheNo;
    }

    public int getSampleQuantity() {
        return sampleQuantity;
    }

    public void setSampleQuantity(int sampleQuantity) {
        this.sampleQuantity = sampleQuantity;
    }

    public String getCheckItem() {
        return checkItem;
    }

    public void setCheckItem(String checkItem) {
        this.checkItem = checkItem;
    }

    public Byte getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(Byte checkResult) {
        this.checkResult = checkResult;
    }

    public Byte getResultConfirm() {
        return resultConfirm;
    }

    public void setResultConfirm(Byte resultConfirm) {
        this.resultConfirm = resultConfirm;
    }

    public Byte getIsSendcheck() {
        return isSendcheck;
    }

    public void setIsSendcheck(Byte isSendcheck) {
        this.isSendcheck = isSendcheck;
    }

    public String getAttachmentInfo() {
        return attachmentInfo;
    }

    public void setAttachmentInfo(String attachmentInfo) {
        this.attachmentInfo = attachmentInfo;
    }

    public Integer getQuickcheckinfoSort() {
        return quickcheckinfoSort;
    }

    public void setQuickcheckinfoSort(Integer quickcheckinfoSort) {
        this.quickcheckinfoSort = quickcheckinfoSort;
    }

    public Byte getQuickcheckinfoState() {
        return quickcheckinfoState;
    }

    public void setQuickcheckinfoState(Byte quickcheckinfoState) {
        this.quickcheckinfoState = quickcheckinfoState;
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

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
