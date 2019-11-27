package fsnip.powerdog.task.modules.lims2supervise.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * @author kun.tan
 * @description 就监管抽检数据
 * @date 2018-12-19 17:38:50
 */
@TableName("spdata")
public class SuperviseSpdata implements Serializable {

    private static final long serialVersionUID = 5483097923325040716L;
    // 检验编号
    @TableId("id")
    private String dataId;

    // 检验项目*
    @TableField("spdata_0")
    private String spdata0;

    // 检验结果*
    @TableField("spdata_1")
    private String spdata1;

    // 结果判定*
    @TableField("spdata_2")
    private String spdata2;

    // 检验依据*
    @TableField("spdata_3")
    private String spdata3;

    // 判定依据*
    @TableField("spdata_4")
    private String spdata4;

    // 标准方法检出限*
    @TableField("spdata_5")
    private String spdata5;

    // 标准检出限单位*
    @TableField("spdata_6")
    private String spdata6;

    // 方法检出限*
    @TableField("spdata_7")
    private String spdata7;

    // 检出限单位*
    @TableField("spdata_8")
    private String spdata8;

    // 标准最小允许限*
    @TableField("spdata_9")
    private String spdata9;

    // 抽检编号
    @TableField("sp_bsb_id")
    private String spBsbId;

    //
    @TableField("created_at")
    private Date createdAt;

    //
    @TableField("updated_at")
    private Date updatedAt;

    // 标准最小允许限单位*
    @TableField("spdata_10")
    private String spdata10;

    // 最小允许限*
    @TableField("spdata_11")
    private String spdata11;

    // 最小允许限单位*
    @TableField("spdata_12")
    private String spdata12;

    // 标准最大允许限*
    @TableField("spdata_13")
    private String spdata13;

    // 标准最大允许限单位*
    @TableField("spdata_14")
    private String spdata14;

    // 最大允许限*
    @TableField("spdata_15")
    private String spdata15;

    // 最大允许限单位*
    @TableField("spdata_16")
    private String spdata16;

    // 说明
    @TableField("spdata_17")
    private String spdata17;

    // 结果单位*
    @TableField("spdata_18")
    private String spdata18;
    // 检验依据简写
    @TableField("spdata19")
    private String spdata19;

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getSpdata0() {
        return spdata0;
    }

    public void setSpdata0(String spdata0) {
        this.spdata0 = spdata0;
    }

    public String getSpdata1() {
        return spdata1;
    }

    public void setSpdata1(String spdata1) {
        this.spdata1 = spdata1;
    }

    public String getSpdata2() {
        return spdata2;
    }

    public void setSpdata2(String spdata2) {
        this.spdata2 = spdata2;
    }

    public String getSpdata3() {
        return spdata3;
    }

    public void setSpdata3(String spdata3) {
        this.spdata3 = spdata3;
    }

    public String getSpdata4() {
        return spdata4;
    }

    public void setSpdata4(String spdata4) {
        this.spdata4 = spdata4;
    }

    public String getSpdata5() {
        return spdata5;
    }

    public void setSpdata5(String spdata5) {
        this.spdata5 = spdata5;
    }

    public String getSpdata6() {
        return spdata6;
    }

    public void setSpdata6(String spdata6) {
        this.spdata6 = spdata6;
    }

    public String getSpdata7() {
        return spdata7;
    }

    public void setSpdata7(String spdata7) {
        this.spdata7 = spdata7;
    }

    public String getSpdata8() {
        return spdata8;
    }

    public void setSpdata8(String spdata8) {
        this.spdata8 = spdata8;
    }

    public String getSpdata9() {
        return spdata9;
    }

    public void setSpdata9(String spdata9) {
        this.spdata9 = spdata9;
    }

    public String getSpBsbId() {
        return spBsbId;
    }

    public void setSpBsbId(String spBsbId) {
        this.spBsbId = spBsbId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getSpdata10() {
        return spdata10;
    }

    public void setSpdata10(String spdata10) {
        this.spdata10 = spdata10;
    }

    public String getSpdata11() {
        return spdata11;
    }

    public void setSpdata11(String spdata11) {
        this.spdata11 = spdata11;
    }

    public String getSpdata12() {
        return spdata12;
    }

    public void setSpdata12(String spdata12) {
        this.spdata12 = spdata12;
    }

    public String getSpdata13() {
        return spdata13;
    }

    public void setSpdata13(String spdata13) {
        this.spdata13 = spdata13;
    }

    public String getSpdata14() {
        return spdata14;
    }

    public void setSpdata14(String spdata14) {
        this.spdata14 = spdata14;
    }

    public String getSpdata15() {
        return spdata15;
    }

    public void setSpdata15(String spdata15) {
        this.spdata15 = spdata15;
    }

    public String getSpdata16() {
        return spdata16;
    }

    public void setSpdata16(String spdata16) {
        this.spdata16 = spdata16;
    }

    public String getSpdata17() {
        return spdata17;
    }

    public void setSpdata17(String spdata17) {
        this.spdata17 = spdata17;
    }

    public String getSpdata18() {
        return spdata18;
    }

    public void setSpdata18(String spdata18) {
        this.spdata18 = spdata18;
    }

    public String getSpdata19() {
        return spdata19;
    }

    public void setSpdata19(String spdata19) {
        this.spdata19 = spdata19;
    }
}

