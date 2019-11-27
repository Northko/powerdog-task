package fsnip.powerdog.task.modules.fsnip2smart.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 小作坊任务检查
 * @User: QMQ
 * @DateTime: 2018-07-13 10:26
 */
@TableName("fsnip_sc_workshopcheck")
public class WorkShopCheck {

    /**
     * UUID 主键
     */
    @TableId("uuId")
    private  String uuId ;

    /**
     * 小作坊任务id
     */
    @TableField("scid")
    private  String scId;

    /**
     * 小作坊名称
     */
    @TableField("zfmc")
    private String zfmc;

    /**
     * 法定代表人
     */
    @TableField("fddbr")
    private  String fddbr;

    /**
     * 社会信用代码
     */
    @TableField("shxydm")
    private String shxydm;

    /**
     * 生产地址
     */
    @TableField("scxxdz")
    private  String scxxdz;

    /**
     *住所
     */
    @TableField("zsxxdz")
    private  String zsxxdz;

    /**
     * 食品类别
     */
    @TableField("splb")
    private String splb ;

    /**
     * 品种明细
     */
    @TableField("splbmx")
    private String splbmx;

    /**
     * 日常监督管理机构
     */
    @TableField("rcjdgljg")
    private String rcjdgljg;

    /**
     * 核查机构编码
     */
    @TableField("checkorgcode")
    private String checkorgcode;
    /**
     *核查机构
     */
    @TableField("checkorgname")
    private String checkorgname;

    @TableField("status")
    //状态10:已接收 20:执行中 30:已提交
    private  int status;
    public static final int workshopcheck_PRE    = 10; // 已接收
    public static final int workshopcheck_EXECUTION = 20; // 执行中
    public static final int workshopcheck_SUBMIT = 30; // 已提交

    /**
     * 任务创建时间
     */
    @TableField("cjsj")
    private Date cjsj;

    /**
     * 任务创建者
     */
    @TableField("cjz")
    private String cjz;

    @TableField("record_insert_time")
    private Date record_insert_time;

    /**
     * 同步标记
     */
    @TableField("syn_status")
    private Integer synStatus;

    public String getUuId() {
        return uuId;
    }

    public void setUuId(String uuId) {
        this.uuId = uuId;
    }

    public String getScId() {
        return scId;
    }

    public void setScId(String scId) {
        this.scId = scId;
    }

    public String getZfmc() {
        return zfmc;
    }

    public void setZfmc(String zfmc) {
        this.zfmc = zfmc;
    }

    public String getFddbr() {
        return fddbr;
    }

    public void setFddbr(String fddbr) {
        this.fddbr = fddbr;
    }

    public String getShxydm() {
        return shxydm;
    }

    public void setShxydm(String shxydm) {
        this.shxydm = shxydm;
    }

    public String getScxxdz() {
        return scxxdz;
    }

    public void setScxxdz(String scxxdz) {
        this.scxxdz = scxxdz;
    }

    public String getZsxxdz() {
        return zsxxdz;
    }

    public void setZsxxdz(String zsxxdz) {
        this.zsxxdz = zsxxdz;
    }

    public String getSplb() {
        return splb;
    }

    public void setSplb(String splb) {
        this.splb = splb;
    }

    public String getSplbmx() {
        return splbmx;
    }

    public void setSplbmx(String splbmx) {
        this.splbmx = splbmx;
    }

    public String getRcjdgljg() {
        return rcjdgljg;
    }

    public void setRcjdgljg(String rcjdgljg) {
        this.rcjdgljg = rcjdgljg;
    }

    public String getCheckorgcode() {
        return checkorgcode;
    }

    public void setCheckorgcode(String checkorgcode) {
        this.checkorgcode = checkorgcode;
    }

    public String getCheckorgname() {
        return checkorgname;
    }

    public void setCheckorgname(String checkorgname) {
        this.checkorgname = checkorgname;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static int getWorkshopcheck_PRE() {
        return workshopcheck_PRE;
    }

    public static int getWorkshopcheck_EXECUTION() {
        return workshopcheck_EXECUTION;
    }

    public static int getWorkshopcheck_SUBMIT() {
        return workshopcheck_SUBMIT;
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    public String getCjz() {
        return cjz;
    }

    public void setCjz(String cjz) {
        this.cjz = cjz;
    }

    public Date getRecord_insert_time() {
        return record_insert_time;
    }

    public void setRecord_insert_time(Date record_insert_time) {
        this.record_insert_time = record_insert_time;
    }

    public Integer getSynStatus() {
        return synStatus;
    }

    public void setSynStatus(Integer synStatus) {
        this.synStatus = synStatus;
    }
}
