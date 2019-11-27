package fsnip.powerdog.task.modules.smart2fsnip.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import fsnip.powerdog.task.base.StatusModel;


/**
 * <p>
 * 食品餐饮风险等级评定表
 * </p>
 *
 * @author kun.tan
 * @Date 2018-8-2 16:28:32
 */
@TableName("smart_jg_spcy_fxdj")
public class CateringRiskLevel extends StatusModel {

    /**
     * 主键
     */
	private String id;
    /**
     * 创建时间
     */
	@TableField("create_date")
	private Date createDate;
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
     * 监管类型
     */
	@TableField("risk_type")
	private String riskType;
    /**
     * 组织者姓名
     */
	@TableField("organizer_name")
	private String organizerName;
    /**
     * 参与者姓名
     */
	@TableField("participator_name")
	private String participatorName;
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
     * 食品许可证编号
     */
	@TableField("food_license")
	private String foodLicense;
    /**
     * 年度
     */
	@TableField("year_num")
	private String yearNum;
    /**
     * 静态风险因素量化风险分值
     */
	@TableField("static_value")
	private String staticValue;
    /**
     * 动态风险因素量化风险分值
     */
	@TableField("dynamic_value")
	private String dynamicValue;
    /**
     * 食品生产日常监管ID
     */
	@TableField("food_rcjg_id")
	private String foodRcjgId;
    /**
     * 动态风险因素量化风险文书
     */
	@TableField("dynamic_doc")
	private String dynamicDoc;
    /**
     * 静态风险因素量化风险文书
     */
	@TableField("static_doc")
	private String staticDoc;
    /**
     * 风险等级确定表
     */
	@TableField("confirm_doc")
	private String confirmDoc;
    /**
     * 风险等级得分
     */
	@TableField("risk_score")
	private String riskScore;
    /**
     * 风险等级
     */
	@TableField("risk_grade")
	private String riskGrade;
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
     * gps时间
     */
	@TableField("gps_time")
	private Date gpsTime;
    /**
     * 工作情况
     */
	@TableField("work_situation")
	private String workSituation;
    /**
     * 工作照片
     */
	@TableField("work_img")
	private String workImg;

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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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

	public String getRiskType() {
		return riskType;
	}

	public void setRiskType(String riskType) {
		this.riskType = riskType;
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

	public String getFoodLicense() {
		return foodLicense;
	}

	public void setFoodLicense(String foodLicense) {
		this.foodLicense = foodLicense;
	}

	public String getYearNum() {
		return yearNum;
	}

	public void setYearNum(String yearNum) {
		this.yearNum = yearNum;
	}

	public String getStaticValue() {
		return staticValue;
	}

	public void setStaticValue(String staticValue) {
		this.staticValue = staticValue;
	}

	public String getDynamicValue() {
		return dynamicValue;
	}

	public void setDynamicValue(String dynamicValue) {
		this.dynamicValue = dynamicValue;
	}

	public String getFoodRcjgId() {
		return foodRcjgId;
	}

	public void setFoodRcjgId(String foodRcjgId) {
		this.foodRcjgId = foodRcjgId;
	}

	public String getDynamicDoc() {
		return dynamicDoc;
	}

	public void setDynamicDoc(String dynamicDoc) {
		this.dynamicDoc = dynamicDoc;
	}

	public String getStaticDoc() {
		return staticDoc;
	}

	public void setStaticDoc(String staticDoc) {
		this.staticDoc = staticDoc;
	}

	public String getConfirmDoc() {
		return confirmDoc;
	}

	public void setConfirmDoc(String confirmDoc) {
		this.confirmDoc = confirmDoc;
	}

	public String getRiskScore() {
		return riskScore;
	}

	public void setRiskScore(String riskScore) {
		this.riskScore = riskScore;
	}

	public String getRiskGrade() {
		return riskGrade;
	}

	public void setRiskGrade(String riskGrade) {
		this.riskGrade = riskGrade;
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

	public Date getGpsTime() {
		return gpsTime;
	}

	public void setGpsTime(Date gpsTime) {
		this.gpsTime = gpsTime;
	}

	public String getWorkSituation() {
		return workSituation;
	}

	public void setWorkSituation(String workSituation) {
		this.workSituation = workSituation;
	}

	public String getWorkImg() {
		return workImg;
	}

	public void setWorkImg(String workImg) {
		this.workImg = workImg;
	}
}