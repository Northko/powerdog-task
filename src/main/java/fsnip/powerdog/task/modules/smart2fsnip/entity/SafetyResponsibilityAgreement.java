package fsnip.powerdog.task.modules.smart2fsnip.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import fsnip.powerdog.task.base.StatusModel;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 安全责任书
 * @Author: kun.tan
 * @DateTime: 2018-06-22 16:35
 */
@TableName("smart_food_safety_responsibility")
public class SafetyResponsibilityAgreement extends StatusModel {

    /**
     * 主键
     */
    @TableId("id")
    private String uuid;
    /**
     * 创建时间
     */
    @TableField("create_date")
    private Date createDate;
    /**
     * 组织者姓名
     */
    @TableField("organizer_name")
    private String organizerName;
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
     * 监管部门
     */
    @TableField("judge_department")
    private String organizerDepartment;
    /**
     * 参与者姓名
     */
    @TableField("participator_name")
    private String participatorName;
    /**
     * 主体ID
     */
    @TableField("company_id")
    private String companyId;
    /**
     * 主体名称
     */
    @TableField("company_name")
    private String companyName;
    /**
     * 安全责任文书
     */
    @TableField("doc_url")
    private String docUrl;
    /**
     * 补充说明
     */
    @TableField("supplement")
    private String supplement;
    /**
     * 现场图片
     */
    @TableField("img_url")
    private String imgUrl;
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
     * 食品安全责任书类型
     * 食品安全责任书 - 餐饮服务:10;
     * 食品安全责任书 - 重大活动餐饮服务:20;
     * 食品安全责任书 - 经营（销售）企业:30;
     * 食品安全责任书 - 生产企业:40;
     * 食品安全责任书 - 小作坊:50.
     */
    @TableField("type")
    private String foodSafetyResponsibilityType;

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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public String getOrganizerDepartment() {
        return organizerDepartment;
    }

    public void setOrganizerDepartment(String organizerDepartment) {
        this.organizerDepartment = organizerDepartment;
    }

    public String getParticipatorName() {
        return participatorName;
    }

    public void setParticipatorName(String participatorName) {
        this.participatorName = participatorName;
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

    public String getDocUrl() {
        return docUrl;
    }

    public void setDocUrl(String docUrl) {
        this.docUrl = docUrl;
    }

    public String getSupplement() {
        return supplement;
    }

    public void setSupplement(String supplement) {
        this.supplement = supplement;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
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

    public String getFoodSafetyResponsibilityType() {
        return foodSafetyResponsibilityType;
    }

    public void setFoodSafetyResponsibilityType(String foodSafetyResponsibilityType) {
        this.foodSafetyResponsibilityType = foodSafetyResponsibilityType;
    }

    public String getJudgeUnit() {
        return judgeUnit;
    }

    public void setJudgeUnit(String judgeUnit) {
        this.judgeUnit = judgeUnit;
    }
}
