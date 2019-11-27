package fsnip.powerdog.task.modules.smart2fsnip.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import fsnip.powerdog.task.base.StatusModel;

import java.io.Serializable;


/**
 * <p>
 * 重大活动保障表
 * </p>
 *
 * @author kun.tan
 * @since 2018-8-3 10:03:45
 */
@TableName("smart_important_event")
public class SmartImportantEvent extends StatusModel {

    /**
     * 主键
     */
	@TableId("id")
	private String id;
    /**
     * 活动名称
     */
	@TableField("event_name")
	private String eventName;
    /**
     * 执法者姓名
     */
	@TableField("organizer_name")
	private String organizerName;
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
     * 参与者姓名
     */
	@TableField("participator_name")
	private String participatorName;
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
     * 承接单位名称
     */
	@TableField("company_name")
	private String companyName;
    /**
     * gps时间
     */
	@TableField("gps_time")
	private Date gpsTime;
    /**
     * gps地址
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
     * 保障时间起
     */
	@TableField("begin_date")
	private Date beginDate;
    /**
     * 保障时间止
     */
	@TableField("end_date")
	private Date endDate;
    /**
     * 保障餐次
     */
	@TableField("guarantee_cc")
	private Integer guaranteeCc;
    /**
     * 保障人次
     */
	@TableField("guarantee_rc")
	private Integer guaranteeRc;
    /**
     * 工作情况
     */
	private String detail;
    /**
     * 工作报告
     */
	private String report;
    /**
     * 工作图片
     */
	@TableField("image_url")
	private String imageUrl;
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

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getOrganizerName() {
		return organizerName;
	}

	public void setOrganizerName(String organizerName) {
		this.organizerName = organizerName;
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

	public String getParticipatorName() {
		return participatorName;
	}

	public void setParticipatorName(String participatorName) {
		this.participatorName = participatorName;
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

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getGuaranteeCc() {
		return guaranteeCc;
	}

	public void setGuaranteeCc(Integer guaranteeCc) {
		this.guaranteeCc = guaranteeCc;
	}

	public Integer getGuaranteeRc() {
		return guaranteeRc;
	}

	public void setGuaranteeRc(Integer guaranteeRc) {
		this.guaranteeRc = guaranteeRc;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Date getRecordInsertTime() {
		return recordInsertTime;
	}

	public void setRecordInsertTime(Date recordInsertTime) {
		this.recordInsertTime = recordInsertTime;
	}

}