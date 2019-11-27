package fsnip.powerdog.task.modules.fsnip2smart.entity;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

/**
 * 快检单商品信息表数据库对应实体
 *
 * @author kun.tan
 * @date 2017-06-26 17:19:39
 */
@TableName("fsnip_qc_billgoodsinfo")
public class DcBillGoodsInfo {

    @TableId("goods_uuid")
    private String goodsUuid;
    @TableField("sample_name")
    private String sampleName;
    @TableField("sample_logo")
    private String sampleLogo;
    @TableField("production_time")
    private String productionTime;
    @TableField("food_category")
    private String foodCategory;
    @TableField("durability_period")
    private String durabilityPeriod;
    @TableField("execute_standard")
    private String executeStandard;
    @TableField("specification")
    private String specification;
    @TableField("price")
    private Double price;
    @TableField("purchase_quanity")
    private Integer purchaseQuanity;
    @TableField("inventory_quanity")
    private Integer inventoryQuanity;
    @TableField("unit_name")
    private String goodsUnitName;
    @TableField("contacts")
    private String contacts;
    @TableField("phone")
    private String phone;
    @TableField("fax")
    private String fax;
    @TableField("goods_attribute")
    private String goodsAttribute;
    @TableField("others")
    private String others;
    @TableField("goods_state")
    private Integer goodsState;
    @TableField("create_time")
    private Date createTime;
    @TableField("update_time")
    private Date updateTime;

    public String getGoodsUuid() {
        return goodsUuid;
    }

    public void setGoodsUuid(String goodsUuid) {
        this.goodsUuid = goodsUuid;
    }

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    public String getSampleLogo() {
        return sampleLogo;
    }

    public void setSampleLogo(String sampleLogo) {
        this.sampleLogo = sampleLogo;
    }

    public String getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(String productionTime) {
        this.productionTime = productionTime;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    public String getDurabilityPeriod() {
        return durabilityPeriod;
    }

    public void setDurabilityPeriod(String durabilityPeriod) {
        this.durabilityPeriod = durabilityPeriod;
    }

    public String getExecuteStandard() {
        return executeStandard;
    }

    public void setExecuteStandard(String executeStandard) {
        this.executeStandard = executeStandard;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPurchaseQuanity() {
        return purchaseQuanity;
    }

    public void setPurchaseQuanity(Integer purchaseQuanity) {
        this.purchaseQuanity = purchaseQuanity;
    }

    public Integer getInventoryQuanity() {
        return inventoryQuanity;
    }

    public void setInventoryQuanity(Integer inventoryQuanity) {
        this.inventoryQuanity = inventoryQuanity;
    }

    public String getGoodsUnitName() {
        return goodsUnitName;
    }

    public void setGoodsUnitName(String goodsUnitName) {
        this.goodsUnitName = goodsUnitName;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getGoodsAttribute() {
        return goodsAttribute;
    }

    public void setGoodsAttribute(String goodsAttribute) {
        this.goodsAttribute = goodsAttribute;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public Integer getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
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
