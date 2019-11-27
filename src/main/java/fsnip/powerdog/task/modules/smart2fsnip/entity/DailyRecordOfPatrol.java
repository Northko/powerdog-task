package fsnip.powerdog.task.modules.smart2fsnip.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

/**
 * @Description: 日常巡检记录（Fsnip）
 * @Author: yangshudong
 * @DateTime: 2018/7/12
 */
@TableName("jg_xcjlb")
public class DailyRecordOfPatrol {

    /**
     * 系统编号
     */
    @TableId("XUUID")
    private String xuuid;

    /**
     * 计划单编号
     */
    @TableField("XJHDBH")
    private String xjhdbh;

    /**
     * 标题
     */
    @TableField("XBT")
    private String xbt;

    /**
     * 检查数量
     */
    @TableField("XJHPC")
    private Integer xjhpc;

    /**
     * 计划ID
     */
    @TableField("XJHDID")
    private String xjhdid;

    /**
     * 检查单编号            自动生成，规则待定
     */
    @TableField("XXCDBH")
    private String xxcdbh;

    /**
     * 检查时间
     */
    @TableField("XXCSJ")
    private Date xxcsj;

    /**
     * 检查组
     */
    @TableField("XXCZ")
    private String xxcz;

    /**
     * 检查单位编号
     */
    @TableField("XXCDWBH")
    private String xxcdwbh;

    /**
     * 检查单位名称
     */
    @TableField("XXCDW")
    private String xxcdw;

    /**
     * 检查人员
     */
    @TableField("XXCRY")
    private String xxcry;

    /**
     * 企业档案UUID
     */
    @TableField("XQYDABH")
    private String xqydabh;

    /**
     * 档案是否已存在            本次录入的10            还是以前有20
     */
    @TableField("XDASFYCZ")
    private String xdasfycz;

    /**
     * 主体名称
     */
    @TableField("XZTMC")
    private String xztmc;

    /**
     * 注册号
     */
    @TableField("XZCH")
    private String xzch;

    /**
     * 许可证号
     */
    @TableField("XXKZH")
    private String xxkzh;

    /**
     * 主体类型
     */
    @TableField("XZTLX")
    private String xztlx;

    /**
     * 负责人
     */
    @TableField("XFZR")
    private String xfzr;

    /**
     * 联系电话
     */
    @TableField("XLXDH")
    private String xlxdh;

    /**
     * 省
     */
    @TableField("XPROVINCE")
    private String xprovince;

    /**
     * 市
     */
    @TableField("XCITY")
    private String xcity;

    /**
     * 区县
     */
    @TableField("XAREA")
    private String xarea;

    /**
     * 详细地址
     */
    @TableField("XXXDZ")
    private String xxxdz;

    /**
     * 当前信用等级
     */
    @TableField("XDQXYDJ")
    private String xdqxydj;

    /**
     * 评定后信用等级
     */
    @TableField("XPDHXYDJ")
    private String xpdhxydj;

    /**
     * 当前得分
     */
    @TableField("XDQDF")
    private String xdqdf;

    /**
     * 当前得分
     */
    @TableField("XPDHDF")
    private String xpdhdf;

    /**
     * 惩罚分数
     */
    @TableField("XCFFS")
    private String xcffs;

    /**
     * 巡检员处理主结果            存正常、行政指导、简易、建议中的一个
     */
    @TableField("XXJYCLJG1")
    private String xxjycljg1;

    /**
     * 巡检员处理细结果            二级结果：行政建议、行政告诫
     */
    @TableField("XXJYCLJG2")
    private String xxjycljg2;

    /**
     * 领导处理主结果            存正常、行政指导、简易、建议中的一个
     */
    @TableField("XLDCLJG1")
    private String xldcljg1;

    /**
     * 领导处理细结果            二级结果：行政建议、行政告诫
     */
    @TableField("XLDCLJG2")
    private String xldcljg2;

    /**
     * 负责人意见            同意/不同意
     */
    @TableField("XFZRYJ")
    private String xfzryj;

    /**
     * 意见描述
     */
    @TableField("XYJMS")
    private String xyjms;

    /**
     * 说明
     */
    @TableField("XSM")
    private String xsm;

    /**
     * 文档服务器上文件全路径
     */
    @TableField("XFJLJ")
    private String xfjlj;

    /**
     * 文件名称
     */
    @TableField("XWJMC")
    private String xwjmc;

    /**
     * 文件类型
     */
    @TableField("XWJLX")
    private String xwjlx;

    /**
     * 其他附件信息
     */
    @TableField("XQTFJXX")
    private String xqtfjxx;

    /**
     * 其他附件名称
     */
    @TableField("XQTFJMC")
    private String xqtfjmc;

    /**
     * 企业类别
     */
    @TableField("XQYLB")
    private String xqylb;

    /**
     * 编制者编号
     */
    @TableField("XBZZBH")
    private String xbzzbh;

    /**
     * 编制者
     */
    @TableField("XBZZ")
    private String xbzz;

    /**
     * 状态
     */
    @TableField("XZT")
    private String xzt;

    /**
     * 编制时间
     */
    @TableField("XBZSJ")
    private Date xbzsj;

    /**
     * 行政区编号
     */
    @TableField("XXZQBH")
    private String xxzqbh;

    /**
     * 行政区名称
     */
    @TableField("XXZQMC")
    private String xxzqmc;

    /**
     * 行政区级别
     */
    @TableField("XXZQJB")
    private String xxzqjb;

    /**
     * 计划编制单位编号
     */
    @TableField("XBZDWBH")
    private String xbzdwbh;

    /**
     * 计划编制单位
     */
    @TableField("XBZDW")
    private String xbzdw;

    /**
     * 编制单位身份
     */
    @TableField("XBZDWSF")
    private String xbzdwsf;

    /**
     * 数据来源
     */
    @TableField("XSJLY")
    private String xsjly;

    /**
     * APPID
     */
    @TableField("XAPPID")
    private String xappid;

    /**
     * 是否行政处罚:YES/NO
     */
    @TableField("XSFXZCF")
    private String xsfxzcf;

    /**
     * 信用评分项版本
     */
    @TableField("XBBH")
    private String xbbh;

    /**
     * 是否检查扣分
     */
    @TableField("XSFXCKF")
    private String xsfxckf;

    /**
     * 是否已行政扣分
     */
    @TableField("XSFYXZKF")
    private String xsfyxzkf;

    /**
     * 经度
     */
    @TableField("XJD")
    private String xjd;

    /**
     * 纬度
     */
    @TableField("XWD")
    private String xwd;

    /**
     * 检查类型
     */
    @TableField("cjclx")
    private String cjclx;

    public String getXuuid() {
        return xuuid;
    }

    public void setXuuid(String xuuid) {
        this.xuuid = xuuid;
    }

    public String getXjhdbh() {
        return xjhdbh;
    }

    public void setXjhdbh(String xjhdbh) {
        this.xjhdbh = xjhdbh;
    }

    public String getXbt() {
        return xbt;
    }

    public void setXbt(String xbt) {
        this.xbt = xbt;
    }

    public Integer getXjhpc() {
        return xjhpc;
    }

    public void setXjhpc(Integer xjhpc) {
        this.xjhpc = xjhpc;
    }

    public String getXjhdid() {
        return xjhdid;
    }

    public void setXjhdid(String xjhdid) {
        this.xjhdid = xjhdid;
    }

    public String getXxcdbh() {
        return xxcdbh;
    }

    public void setXxcdbh(String xxcdbh) {
        this.xxcdbh = xxcdbh;
    }

    public Date getXxcsj() {
        return xxcsj;
    }

    public void setXxcsj(Date xxcsj) {
        this.xxcsj = xxcsj;
    }

    public String getXxcz() {
        return xxcz;
    }

    public void setXxcz(String xxcz) {
        this.xxcz = xxcz;
    }

    public String getXxcdwbh() {
        return xxcdwbh;
    }

    public void setXxcdwbh(String xxcdwbh) {
        this.xxcdwbh = xxcdwbh;
    }

    public String getXxcdw() {
        return xxcdw;
    }

    public void setXxcdw(String xxcdw) {
        this.xxcdw = xxcdw;
    }

    public String getXxcry() {
        return xxcry;
    }

    public void setXxcry(String xxcry) {
        this.xxcry = xxcry;
    }

    public String getXqydabh() {
        return xqydabh;
    }

    public void setXqydabh(String xqydabh) {
        this.xqydabh = xqydabh;
    }

    public String getXdasfycz() {
        return xdasfycz;
    }

    public void setXdasfycz(String xdasfycz) {
        this.xdasfycz = xdasfycz;
    }

    public String getXztmc() {
        return xztmc;
    }

    public void setXztmc(String xztmc) {
        this.xztmc = xztmc;
    }

    public String getXzch() {
        return xzch;
    }

    public void setXzch(String xzch) {
        this.xzch = xzch;
    }

    public String getXxkzh() {
        return xxkzh;
    }

    public void setXxkzh(String xxkzh) {
        this.xxkzh = xxkzh;
    }

    public String getXztlx() {
        return xztlx;
    }

    public void setXztlx(String xztlx) {
        this.xztlx = xztlx;
    }

    public String getXfzr() {
        return xfzr;
    }

    public void setXfzr(String xfzr) {
        this.xfzr = xfzr;
    }

    public String getXlxdh() {
        return xlxdh;
    }

    public void setXlxdh(String xlxdh) {
        this.xlxdh = xlxdh;
    }

    public String getXprovince() {
        return xprovince;
    }

    public void setXprovince(String xprovince) {
        this.xprovince = xprovince;
    }

    public String getXcity() {
        return xcity;
    }

    public void setXcity(String xcity) {
        this.xcity = xcity;
    }

    public String getXarea() {
        return xarea;
    }

    public void setXarea(String xarea) {
        this.xarea = xarea;
    }

    public String getXxxdz() {
        return xxxdz;
    }

    public void setXxxdz(String xxxdz) {
        this.xxxdz = xxxdz;
    }

    public String getXdqxydj() {
        return xdqxydj;
    }

    public void setXdqxydj(String xdqxydj) {
        this.xdqxydj = xdqxydj;
    }

    public String getXpdhxydj() {
        return xpdhxydj;
    }

    public void setXpdhxydj(String xpdhxydj) {
        this.xpdhxydj = xpdhxydj;
    }

    public String getXdqdf() {
        return xdqdf;
    }

    public void setXdqdf(String xdqdf) {
        this.xdqdf = xdqdf;
    }

    public String getXpdhdf() {
        return xpdhdf;
    }

    public void setXpdhdf(String xpdhdf) {
        this.xpdhdf = xpdhdf;
    }

    public String getXcffs() {
        return xcffs;
    }

    public void setXcffs(String xcffs) {
        this.xcffs = xcffs;
    }

    public String getXxjycljg1() {
        return xxjycljg1;
    }

    public void setXxjycljg1(String xxjycljg1) {
        this.xxjycljg1 = xxjycljg1;
    }

    public String getXxjycljg2() {
        return xxjycljg2;
    }

    public void setXxjycljg2(String xxjycljg2) {
        this.xxjycljg2 = xxjycljg2;
    }

    public String getXldcljg1() {
        return xldcljg1;
    }

    public void setXldcljg1(String xldcljg1) {
        this.xldcljg1 = xldcljg1;
    }

    public String getXldcljg2() {
        return xldcljg2;
    }

    public void setXldcljg2(String xldcljg2) {
        this.xldcljg2 = xldcljg2;
    }

    public String getXfzryj() {
        return xfzryj;
    }

    public void setXfzryj(String xfzryj) {
        this.xfzryj = xfzryj;
    }

    public String getXyjms() {
        return xyjms;
    }

    public void setXyjms(String xyjms) {
        this.xyjms = xyjms;
    }

    public String getXsm() {
        return xsm;
    }

    public void setXsm(String xsm) {
        this.xsm = xsm;
    }

    public String getXfjlj() {
        return xfjlj;
    }

    public void setXfjlj(String xfjlj) {
        this.xfjlj = xfjlj;
    }

    public String getXwjmc() {
        return xwjmc;
    }

    public void setXwjmc(String xwjmc) {
        this.xwjmc = xwjmc;
    }

    public String getXwjlx() {
        return xwjlx;
    }

    public void setXwjlx(String xwjlx) {
        this.xwjlx = xwjlx;
    }

    public String getXqtfjxx() {
        return xqtfjxx;
    }

    public void setXqtfjxx(String xqtfjxx) {
        this.xqtfjxx = xqtfjxx;
    }

    public String getXqtfjmc() {
        return xqtfjmc;
    }

    public void setXqtfjmc(String xqtfjmc) {
        this.xqtfjmc = xqtfjmc;
    }

    public String getXqylb() {
        return xqylb;
    }

    public void setXqylb(String xqylb) {
        this.xqylb = xqylb;
    }

    public String getXbzzbh() {
        return xbzzbh;
    }

    public void setXbzzbh(String xbzzbh) {
        this.xbzzbh = xbzzbh;
    }

    public String getXbzz() {
        return xbzz;
    }

    public void setXbzz(String xbzz) {
        this.xbzz = xbzz;
    }

    public String getXzt() {
        return xzt;
    }

    public void setXzt(String xzt) {
        this.xzt = xzt;
    }

    public Date getXbzsj() {
        return xbzsj;
    }

    public void setXbzsj(Date xbzsj) {
        this.xbzsj = xbzsj;
    }

    public String getXxzqbh() {
        return xxzqbh;
    }

    public void setXxzqbh(String xxzqbh) {
        this.xxzqbh = xxzqbh;
    }

    public String getXxzqmc() {
        return xxzqmc;
    }

    public void setXxzqmc(String xxzqmc) {
        this.xxzqmc = xxzqmc;
    }

    public String getXxzqjb() {
        return xxzqjb;
    }

    public void setXxzqjb(String xxzqjb) {
        this.xxzqjb = xxzqjb;
    }

    public String getXbzdwbh() {
        return xbzdwbh;
    }

    public void setXbzdwbh(String xbzdwbh) {
        this.xbzdwbh = xbzdwbh;
    }

    public String getXbzdw() {
        return xbzdw;
    }

    public void setXbzdw(String xbzdw) {
        this.xbzdw = xbzdw;
    }

    public String getXbzdwsf() {
        return xbzdwsf;
    }

    public void setXbzdwsf(String xbzdwsf) {
        this.xbzdwsf = xbzdwsf;
    }

    public String getXsjly() {
        return xsjly;
    }

    public void setXsjly(String xsjly) {
        this.xsjly = xsjly;
    }

    public String getXappid() {
        return xappid;
    }

    public void setXappid(String xappid) {
        this.xappid = xappid;
    }

    public String getXsfxzcf() {
        return xsfxzcf;
    }

    public void setXsfxzcf(String xsfxzcf) {
        this.xsfxzcf = xsfxzcf;
    }

    public String getXbbh() {
        return xbbh;
    }

    public void setXbbh(String xbbh) {
        this.xbbh = xbbh;
    }

    public String getXsfxckf() {
        return xsfxckf;
    }

    public void setXsfxckf(String xsfxckf) {
        this.xsfxckf = xsfxckf;
    }

    public String getXsfyxzkf() {
        return xsfyxzkf;
    }

    public void setXsfyxzkf(String xsfyxzkf) {
        this.xsfyxzkf = xsfyxzkf;
    }

    public String getXjd() {
        return xjd;
    }

    public void setXjd(String xjd) {
        this.xjd = xjd;
    }

    public String getXwd() {
        return xwd;
    }

    public void setXwd(String xwd) {
        this.xwd = xwd;
    }

    public String getCjclx() {
        return cjclx;
    }

    public void setCjclx(String cjclx) {
        this.cjclx = cjclx;
    }
}
