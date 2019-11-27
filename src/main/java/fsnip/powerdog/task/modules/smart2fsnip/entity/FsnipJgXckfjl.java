package fsnip.powerdog.task.modules.smart2fsnip.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import fsnip.powerdog.task.base.StatusModel;

@TableName("fsnip_jg_xckfjl")
public class FsnipJgXckfjl extends StatusModel {

    private static final long serialVersionUID = -6917486910459284724L;
    @TableId("X10UUID")
    private String x10Uuid;
    @TableField("X10XCUUID")
    private String x10Xcuuid;
    @TableField("X10KFXUUID")
    private String x10Kfxuuid;
    @TableField("X10FZ")
    private Double x10Fz;
    @TableField(value = "X10BZ",exist = false)
    private String x10Bz;
    @TableField(value = "X10FJURL", exist = false)
    private String x10Fjurl;
    @TableField("B6JCZN")
    private String b6Jczn;
    @TableField("B6GROUP")
    private String b6Group;
    @TableField("b6Ssgjbh")
    private String b6Ssgjbh;
    @TableField("b6Xh")
    private String b6Xh;
    @TableField("b6Pfbz")
    private String b6Pfbz;
    @TableField("b6Pfnr")
    private String b6Pfnr;
    @TableField("B6SFZD")
    private String b6Sfzd;
    @TableField(value = "x10FjStr", exist = false)
    private String x10FjStr;
    @TableField("B6FZ")
    private Double b6Fz;
    @TableField("orderNo")
    private String orderNo;

    public String getX10Uuid() {
        return x10Uuid;
    }

    public void setX10Uuid(String x10Uuid) {
        this.x10Uuid = x10Uuid;
    }

    public String getX10Xcuuid() {
        return x10Xcuuid;
    }

    public void setX10Xcuuid(String x10Xcuuid) {
        this.x10Xcuuid = x10Xcuuid;
    }

    public String getX10Kfxuuid() {
        return x10Kfxuuid;
    }

    public void setX10Kfxuuid(String x10Kfxuuid) {
        this.x10Kfxuuid = x10Kfxuuid;
    }

    public double getX10Fz() {
        return x10Fz;
    }

    public void setX10Fz(double x10Fz) {
        this.x10Fz = x10Fz;
    }

    public String getX10Bz() {
        return x10Bz;
    }

    public void setX10Bz(String x10Bz) {
        this.x10Bz = x10Bz;
    }

    public String getX10Fjurl() {
        return x10Fjurl;
    }

    public void setX10Fjurl(String x10Fjurl) {
        this.x10Fjurl = x10Fjurl;
    }

    public String getB6Jczn() {
        return b6Jczn;
    }

    public void setB6Jczn(String b6Jczn) {
        this.b6Jczn = b6Jczn;
    }

    public String getB6Group() {
        return b6Group;
    }

    public void setB6Group(String b6Group) {
        this.b6Group = b6Group;
    }

    public String getB6Ssgjbh() {
        return b6Ssgjbh;
    }

    public void setB6Ssgjbh(String b6Ssgjbh) {
        this.b6Ssgjbh = b6Ssgjbh;
    }

    public String getB6Xh() {
        return b6Xh;
    }

    public void setB6Xh(String b6Xh) {
        this.b6Xh = b6Xh;
    }

    public String getB6Pfbz() {
        return b6Pfbz;
    }

    public void setB6Pfbz(String b6Pfbz) {
        this.b6Pfbz = b6Pfbz;
    }

    public String getB6Pfnr() {
        return b6Pfnr;
    }

    public void setB6Pfnr(String b6Pfnr) {
        this.b6Pfnr = b6Pfnr;
    }

    public String getB6Sfzd() {
        return b6Sfzd;
    }

    public void setB6Sfzd(String b6Sfzd) {
        this.b6Sfzd = b6Sfzd;
    }

    public String getX10FjStr() {
        return x10FjStr;
    }

    public void setX10FjStr(String x10FjStr) {
        this.x10FjStr = x10FjStr;
    }

    public double getB6Fz() {
        return b6Fz;
    }

    public void setB6Fz(double b6Fz) {
        this.b6Fz = b6Fz;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
