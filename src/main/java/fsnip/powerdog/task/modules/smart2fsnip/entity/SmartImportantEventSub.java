package fsnip.powerdog.task.modules.smart2fsnip.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import fsnip.powerdog.task.base.StatusModel;

import java.util.Date;


/**
 * <p>
 * 重大活动保障监管
 * </p>
 *
 * @author kun.tan
 * @since 2018-8-3 10:11:31
 */
@TableName("smart_important_event_sub")
public class SmartImportantEventSub extends StatusModel {

    /**
     * 主键
     */
    @TableId("id")
    private String id;
    /**
     * 保障名称
     */
    @TableField("important_event_id")
    private String importantEventId;
    /**
     * 监管单位
     */
    @TableField("judge_unit")
    private String judgeUnit;
    /**
     * 监管部门
     */
    @TableField("judge_department")
    private String judgeDepartment;
    /**
     * 监管机构编码
     */
    @TableField("unit_code")
    private String unitCode;
    /**
     * 建档时间
     */
    @TableField("task_date")
    private Date taskDate;
    /**
     * 承接单位ID
     */
    @TableField("company_id")
    private String companyId;
    /**
     * 工作情况
     */
    private String detail;
    /**
     * 工作图片
     */
    @TableField("image_url")
    private String imageUrl;
    /**
     * 快检报告
     */
    @TableField("quick_check_report")
    private String quickCheckReport;
    /**
     * 抽检报告
     */
    @TableField("random_check_report")
    private String randomCheckReport;
    /**
     * 工作情况记录表上传时间
     */
    @TableField("work_doc_date")
    private Date workDocDate;
    /**
     * 工作情况记录表
     */
    @TableField("work_doc_url")
    private String workDocUrl;
    /**
     * gps时间
     */
    @TableField("gps_time")
    private Date gpsTime;
    /**
     * GPS地址
     */
    @TableField("gps_addr")
    private String gpsAddr;
    /**
     * gps经度
     */
    @TableField("gps_longitude")
    private String gpsLongitude;
    /**
     * gps纬度
     */
    @TableField("gps_latitude")
    private String gpsLatitude;
    /**
     * 组织者姓名
     */
    @TableField("organizer_name")
    private String organizerName;
    /**
     * 承接单位名称
     */
    @TableField("company_name")
    private String companyName;
    /**
     * 记录时间
     */
    @TableField("RECORD_INSERT_TIME")
    private Date recordInsertTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getImportantEventId() {
        return importantEventId;
    }

    public void setImportantEventId(String importantEventId) {
        this.importantEventId = importantEventId;
    }

    public String getJudgeUnit() {
        return judgeUnit;
    }

    public void setJudgeUnit(String judgeUnit) {
        this.judgeUnit = judgeUnit;
    }

    public String getJudgeDepartment() {
        return judgeDepartment;
    }

    public void setJudgeDepartment(String judgeDepartment) {
        this.judgeDepartment = judgeDepartment;
    }

    public Date getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(Date taskDate) {
        this.taskDate = taskDate;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getQuickCheckReport() {
        return quickCheckReport;
    }

    public void setQuickCheckReport(String quickCheckReport) {
        this.quickCheckReport = quickCheckReport;
    }

    public String getRandomCheckReport() {
        return randomCheckReport;
    }

    public void setRandomCheckReport(String randomCheckReport) {
        this.randomCheckReport = randomCheckReport;
    }

    public Date getWorkDocDate() {
        return workDocDate;
    }

    public void setWorkDocDate(Date workDocDate) {
        this.workDocDate = workDocDate;
    }

    public String getWorkDocUrl() {
        return workDocUrl;
    }

    public void setWorkDocUrl(String workDocUrl) {
        this.workDocUrl = workDocUrl;
    }

    public Date getGpsTime() {
        return gpsTime;
    }

    public void setGpsTime(Date gpsTime) {
        this.gpsTime = gpsTime;
    }

    public String getGpsAddr() {
        return gpsAddr;
    }

    public void setGpsAddr(String gpsAddr) {
        this.gpsAddr = gpsAddr;
    }

    public String getGpsLongitude() {
        return gpsLongitude;
    }

    public void setGpsLongitude(String gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }

    public String getGpsLatitude() {
        return gpsLatitude;
    }

    public void setGpsLatitude(String gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getRecordInsertTime() {
        return recordInsertTime;
    }

    public void setRecordInsertTime(Date recordInsertTime) {
        this.recordInsertTime = recordInsertTime;
    }

}