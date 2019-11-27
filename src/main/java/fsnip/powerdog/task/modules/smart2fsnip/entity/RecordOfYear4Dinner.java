package fsnip.powerdog.task.modules.smart2fsnip.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import fsnip.powerdog.task.base.StatusModel;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 年夜饭备案
 * @Author: kun.tan
 * @DateTime: 2018-06-22 16:39
 */
@TableName("smart_newyear_dinner")
public class RecordOfYear4Dinner extends StatusModel {

    /**
     * 主键
     */
    @TableId("id")
    private String uuid;
    /**
     * 建档时间
     */
    @TableField("task_date")
    private Date taskDate;
    /**
     * 任务名称
     */
    @TableField("task_name")
    private String taskName;
    /**
     * 任务内容
     */
    @TableField("task_content")
    private String taskContent;
    /**
     * 监管单位
     */
    @TableField("judge_unit")
    private String judgeUnit;
    /**
     * 监管部门
     */
    @TableField("judge_department")
    private String organizerDepartment;
    /**
     * 监管机构编码
     */
    @TableField("unit_code")
    private String unitCode;
    /**
     * GPS时间
     */
    @TableField("gps_time")
    private Date gpsTime;
    /**
     * GPS地址
     */
    @TableField("gps_addr")
    private String gpsAddr;
    /**
     * GPS经度
     */
    @TableField("gps_longitude")
    private String gpsLongitude;
    /**
     * GPS纬度
     */
    @TableField("gps_latitude")
    private String gpsLatitude;
    /**
     * 备案主体ID
     */
    @TableField("company_id")
    private String companyId;
    /**
     * 备案主体名称
     */
    @TableField("company_name")
    private String companyName;
    /**
     * 负责人
     */
    @TableField("company_manager")
    private String companyManager;
    /**
     * 备案桌数
     */
    @TableField("record_number")
    private String recordNumber;
    /**
     * 就餐人数
     */
    @TableField("number_diners")
    private String numberDiners;
    /**
     * 备案报告
     */
    @TableField("filing_report")
    private String filingReport;
    /**
     * 组织者名称
     */
    @TableField("organizer_name")
    private String organizerName;
    /**
     * 参与者名称
     */
    @TableField("participator_name")
    private String participatorName;
    /**
     * 图片
     */
    @TableField("img_url")
    private String imgUrl;
    /**
     * 备案文书
     */
    @TableField("doc_url")
    private String docUrl;
    /**
     * 备案年份
     */
    @TableField("record_year")
    private String recordYear;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public Date getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(Date taskDate) {
        this.taskDate = taskDate;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent;
    }

    public String getOrganizerDepartment() {
        return organizerDepartment;
    }

    public void setOrganizerDepartment(String organizerDepartment) {
        this.organizerDepartment = organizerDepartment;
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

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyManager() {
        return companyManager;
    }

    public void setCompanyManager(String companyManager) {
        this.companyManager = companyManager;
    }

    public String getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    public String getNumberDiners() {
        return numberDiners;
    }

    public void setNumberDiners(String numberDiners) {
        this.numberDiners = numberDiners;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public String getParticipatorName() {
        return participatorName;
    }

    public void setParticipatorName(String participatorName) {
        this.participatorName = participatorName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDocUrl() {
        return docUrl;
    }

    public void setDocUrl(String docUrl) {
        this.docUrl = docUrl;
    }

    public String getRecordYear() {
        return recordYear;
    }

    public void setRecordYear(String recordYear) {
        this.recordYear = recordYear;
    }

    public String getFilingReport() {
        return filingReport;
    }

    public void setFilingReport(String filingReport) {
        this.filingReport = filingReport;
    }

    public String getJudgeUnit() {
        return judgeUnit;
    }

    public void setJudgeUnit(String judgeUnit) {
        this.judgeUnit = judgeUnit;
    }
}
