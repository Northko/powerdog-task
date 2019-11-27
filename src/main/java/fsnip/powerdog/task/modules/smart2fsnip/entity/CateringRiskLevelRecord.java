package fsnip.powerdog.task.modules.smart2fsnip.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 餐饮风险等级记录
 * @author: kun.tan
 * @DateTime: 2018-8-2 17:29:40
 */
@TableName("jg_fxdjjlb")
public class CateringRiskLevelRecord {

    @TableId("uuid")
    private String uuid;
    /**
     * 巡查记录ID
     */
    @TableField("xcjl_uuid")
    private String xcjlUuid;
    /**
     * 企业id
     */
    @TableField("qy_uuid")
    private String qyid;

    /**
     * 静态分值
     */
    @TableField("jtfz")
    private String jtfz;
    /**
     * 动态分值
     */
    @TableField("dtfz")
    private String dtfz;
    /**
     * 动/静态总分
     */
    @TableField("totalfz")
    private String totalfz;
    /**
     * 评分等级
     */
    @TableField("risk_grade")
    private String riskGrade;
    /**
     * 巡查时间
     */
    @TableField("xcsj")
    private Date xcsj;
    /**
     * 巡查机构
     */
    @TableField("cheakorg")
    private String cheakorg;
    /**
     * 巡查机构编码
     */
    @TableField("orgcode")
    private String orgcode;
    /**
     * 企业类型
     */
    @TableField("qylx")
    private String qylx;
    /**
     * 企业类别 1 生产 2 流通 3 餐饮
     */
    @TableField("qylb")
    private String qylb;

    /**
     * 巡查单编号(计划单编号 + 三位流水)
     */
    @TableField("xcdbh")
    private String xxcdbh;
    /**
     * 巡查人员
     */
    @TableField("xcry")
    private String xxcry;
    /**
     * 主体名称
     */
    @TableField("qymc")
    private String xztmc;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getXcjlUuid() {
        return xcjlUuid;
    }

    public void setXcjlUuid(String xcjlUuid) {
        this.xcjlUuid = xcjlUuid;
    }

    public String getQyid() {
        return qyid;
    }

    public void setQyid(String qyid) {
        this.qyid = qyid;
    }

    public String getJtfz() {
        return jtfz;
    }

    public void setJtfz(String jtfz) {
        this.jtfz = jtfz;
    }

    public String getDtfz() {
        return dtfz;
    }

    public void setDtfz(String dtfz) {
        this.dtfz = dtfz;
    }

    public String getTotalfz() {
        return totalfz;
    }

    public void setTotalfz(String totalfz) {
        this.totalfz = totalfz;
    }

    public String getRiskGrade() {
        return riskGrade;
    }

    public void setRiskGrade(String riskGrade) {
        this.riskGrade = riskGrade;
    }

    public Date getXcsj() {
        return xcsj;
    }

    public void setXcsj(Date xcsj) {
        this.xcsj = xcsj;
    }

    public String getCheakorg() {
        return cheakorg;
    }

    public void setCheakorg(String cheakorg) {
        this.cheakorg = cheakorg;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public String getQylx() {
        return qylx;
    }

    public void setQylx(String qylx) {
        this.qylx = qylx;
    }

    public String getQylb() {
        return qylb;
    }

    public void setQylb(String qylb) {
        this.qylb = qylb;
    }

    public String getXxcdbh() {
        return xxcdbh;
    }

    public void setXxcdbh(String xxcdbh) {
        this.xxcdbh = xxcdbh;
    }

    public String getXxcry() {
        return xxcry;
    }

    public void setXxcry(String xxcry) {
        this.xxcry = xxcry;
    }

    public String getXztmc() {
        return xztmc;
    }

    public void setXztmc(String xztmc) {
        this.xztmc = xztmc;
    }
}
