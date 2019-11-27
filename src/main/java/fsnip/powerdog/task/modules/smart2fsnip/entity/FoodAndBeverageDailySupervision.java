package fsnip.powerdog.task.modules.smart2fsnip.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import fsnip.powerdog.task.base.StatusModel;

import java.util.Date;


/**
 * <p>
 * 食品、餐饮日常监督记录
 * </p>
 *
 * @author kun.tan
 * @Date 2018-8-2 16:59:40
 */
@TableName("smart_jg_spcy_rcjg")
public class FoodAndBeverageDailySupervision extends StatusModel {

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
     * 监管主类型
     */
    @TableField("judge_type_main")
    private String judgeTypeMain;
    /**
     * 监管类型
     */
    @TableField("judge_type")
    private String judgeType;
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
     * 工作图片
     */
    @TableField("img_url")
    private String imgUrl;
    /**
     * 检查结果
     */
    @TableField("check_result")
    private String checkResult;
    /**
     * 处理结果
     */
    @TableField("deal_content")
    private String dealContent;
    /**
     * 告知页文书
     */
    @TableField("tell_page_doc")
    private String tellPageDoc;
    /**
     * 日常监督检查要点表
     */
    @TableField("check_table_doc")
    private String checkTableDoc;
    /**
     * 检查结果文书
     */
    @TableField("check_result_doc")
    private String checkResultDoc;
    /**
     * 监督意见书
     */
    @TableField("opnion_doc")
    private String opnionDoc;
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

    public String getJudgeTypeMain() {
        return judgeTypeMain;
    }

    public void setJudgeTypeMain(String judgeTypeMain) {
        this.judgeTypeMain = judgeTypeMain;
    }

    public String getJudgeType() {
        return judgeType;
    }

    public void setJudgeType(String judgeType) {
        this.judgeType = judgeType;
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

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    public String getDealContent() {
        return dealContent;
    }

    public void setDealContent(String dealContent) {
        this.dealContent = dealContent;
    }

    public String getTellPageDoc() {
        return tellPageDoc;
    }

    public void setTellPageDoc(String tellPageDoc) {
        this.tellPageDoc = tellPageDoc;
    }

    public String getCheckTableDoc() {
        return checkTableDoc;
    }

    public void setCheckTableDoc(String checkTableDoc) {
        this.checkTableDoc = checkTableDoc;
    }

    public String getCheckResultDoc() {
        return checkResultDoc;
    }

    public void setCheckResultDoc(String checkResultDoc) {
        this.checkResultDoc = checkResultDoc;
    }

    public String getOpnionDoc() {
        return opnionDoc;
    }

    public void setOpnionDoc(String opnionDoc) {
        this.opnionDoc = opnionDoc;
    }

    public String getWorkRecord() {
        return workRecord;
    }

    public void setWorkRecord(String workRecord) {
        this.workRecord = workRecord;
    }
}