package fsnip.powerdog.task.modules.fsnip2smart.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

/**
 * 被抽检人信息表对应实体
 *
 * @author kun.tan
 * @date 2018-7-13 10:38:06
 */
@TableName("fsnip_qc_billcheckedperson")
public class DcBillCheckedPerson {

    @TableId("checkedperson_uuid")
    private String checkedpersonUuid;
    @TableField("unit_name")
    private String unitName;
    @TableField("booth_name")
    private String boothName;
    @TableField("business_license_no")
    private String businessLicenseNo;
    @TableField("legal_representative")
    private String legalRepresentative;
    @TableField("phone")
    private String phone;
    @TableField("email")
    private String email;
    @TableField("province_code")
    private String provinceCode;
    @TableField("city_code")
    private String cityCode;
    @TableField("area_code")
    private String areaCode;
    @TableField("detail_address")
    private String detailAddress;
    @TableField("location")
    private String location;
    @TableField("place")
    private String place;
    @TableField("regional_property")
    private String regionalProperty;
    @TableField("checkedperson_state")
    private Byte checkedpersonState;
    @TableField("create_time")
    private Date createTime;
    @TableField("update_time")
    private Date updateTime;

    public String getCheckedpersonUuid() {
        return checkedpersonUuid;
    }

    public void setCheckedpersonUuid(String checkedpersonUuid) {
        this.checkedpersonUuid = checkedpersonUuid;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getBoothName() {
        return boothName;
    }

    public void setBoothName(String boothName) {
        this.boothName = boothName;
    }

    public String getBusinessLicenseNo() {
        return businessLicenseNo;
    }

    public void setBusinessLicenseNo(String businessLicenseNo) {
        this.businessLicenseNo = businessLicenseNo;
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getRegionalProperty() {
        return regionalProperty;
    }

    public void setRegionalProperty(String regionalProperty) {
        this.regionalProperty = regionalProperty;
    }

    public Byte getCheckedpersonState() {
        return checkedpersonState;
    }

    public void setCheckedpersonState(Byte checkedpersonState) {
        this.checkedpersonState = checkedpersonState;
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
}
