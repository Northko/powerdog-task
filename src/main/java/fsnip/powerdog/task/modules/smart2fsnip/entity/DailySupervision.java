package fsnip.powerdog.task.modules.smart2fsnip.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import fsnip.powerdog.task.base.StatusModel;

import java.util.Date;


/**
 * <p>
 * 一般日常监管记录
 * </p>
 *
 * @author kun.tan
 * @Date 2018-8-2 16:09:30
 */
@TableName("smart_jg_rcjg")
public class DailySupervision extends StatusModel {

    /**
     * 主键
     */
    private String id;
    /**
     * 日常监管类别
     */
    @TableField("judge_type")
    private String judgeType;
    /**
     * 任务名称
     */
    @TableField("task_name")
    private String taskName;
    /**
     * 监管部门
     */
    @TableField("judge_department")
    private String judgeDepartment;
    /**
     * 监管单位
     */
    @TableField("judge_unit")
    private String judgeUnit;
    /**
     * 监管机构编码
     */
    @TableField("unit_code")
    private String unitCode;
    /**
     * 组织者姓名
     */
    @TableField("organizer_name")
    private String organizerName;
    /**
     * 参与者姓名
     */
    @TableField("participants_name")
    private String participantsName;
    /**
     * 任务时间
     */
    @TableField("task_time")
    private Date taskTime;
    /**
     * 主体名称
     */
    @TableField("company_name")
    private String companyName;
    /**
     * 负责人
     */
    @TableField("company_person")
    private String companyPerson;
    /**
     * 统一社会信用代码
     */
    @TableField("credit_code")
    private String creditCode;
    /**
     * 注册号
     */
    @TableField("registration_code")
    private String registrationCode;
    /**
     * 任务地址（手工）
     */
    @TableField("task_address")
    private String taskAddress;
    /**
     * 任务报告
     */
    @TableField("task_report")
    private String taskReport;
    /**
     * GPS地址
     */
    @TableField("gps_address")
    private String gpsAddress;
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
     * 任务图片
     */
    @TableField("task_images")
    private String taskImages;
    /**
     * GPS时间
     */
    @TableField("gps_time")
    private Date gpsTime;
    /**
     * 检查结果
     */
    @TableField("check_result")
    private String checkResult;

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

    public String getJudgeType() {
        return judgeType;
    }

    public void setJudgeType(String judgeType) {
        this.judgeType = judgeType;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getJudgeDepartment() {
        return judgeDepartment;
    }

    public void setJudgeDepartment(String judgeDepartment) {
        this.judgeDepartment = judgeDepartment;
    }

    public String getJudgeUnit() {
        return judgeUnit;
    }

    public void setJudgeUnit(String judgeUnit) {
        this.judgeUnit = judgeUnit;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public String getParticipantsName() {
        return participantsName;
    }

    public void setParticipantsName(String participantsName) {
        this.participantsName = participantsName;
    }

    public Date getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(Date taskTime) {
        this.taskTime = taskTime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyPerson() {
        return companyPerson;
    }

    public void setCompanyPerson(String companyPerson) {
        this.companyPerson = companyPerson;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public String getRegistrationCode() {
        return registrationCode;
    }

    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
    }

    public String getTaskAddress() {
        return taskAddress;
    }

    public void setTaskAddress(String taskAddress) {
        this.taskAddress = taskAddress;
    }

    public String getTaskReport() {
        return taskReport;
    }

    public void setTaskReport(String taskReport) {
        this.taskReport = taskReport;
    }

    public String getGpsAddress() {
        return gpsAddress;
    }

    public void setGpsAddress(String gpsAddress) {
        this.gpsAddress = gpsAddress;
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

    public String getTaskImages() {
        return taskImages;
    }

    public void setTaskImages(String taskImages) {
        this.taskImages = taskImages;
    }

    public Date getGpsTime() {
        return gpsTime;
    }

    public void setGpsTime(Date gpsTime) {
        this.gpsTime = gpsTime;
    }

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }
}