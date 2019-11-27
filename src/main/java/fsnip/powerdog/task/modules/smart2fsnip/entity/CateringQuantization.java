package fsnip.powerdog.task.modules.smart2fsnip.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import fsnip.powerdog.task.base.StatusModel;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 餐饮量化分级记录
 * @Author: kun.tan
 * @DateTime: 2018-08-02 11:35
 */
@TableName("smart_jg_cy_lhfj")
public class CateringQuantization extends StatusModel {

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
     * 量化分级类型
     */
    @TableField("quality_type")
    private String qualityType;
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
     * 监督图片
     */
    @TableField("img_url")
    private String imgUrl;
    /**
     * 评定文书
     */
    @TableField("doc_url")
    private String docUrl;
    /**
     * 应得分
     */
    @TableField("total_score")
    private String totalScore;
    /**
     * 实得分
     */
    @TableField("got_score")
    private String gotScore;
    /**
     * 标化分
     */
    @TableField("standard_sore")
    private String standardSore;
    /**
     * 结论
     */
    private String grade;
    /**
     * 工作记录
     */
    @TableField("work_record")
    private String workRecord;

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

    public String getQualityType() {
        return qualityType;
    }

    public void setQualityType(String qualityType) {
        this.qualityType = qualityType;
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

    public String getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(String totalScore) {
        this.totalScore = totalScore;
    }

    public String getGotScore() {
        return gotScore;
    }

    public void setGotScore(String gotScore) {
        this.gotScore = gotScore;
    }

    public String getStandardSore() {
        return standardSore;
    }

    public void setStandardSore(String standardSore) {
        this.standardSore = standardSore;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getWorkRecord() {
        return workRecord;
    }

    public void setWorkRecord(String workRecord) {
        this.workRecord = workRecord;
    }
}

