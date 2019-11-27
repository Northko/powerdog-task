package fsnip.powerdog.task.modules.spsc2fsnip.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.util.Date;

/**
 * Create by chenxiaolin on 2018/7/13 13:07
 * @Desc 贵州省食品生成加工小作坊登记 对象
 */
@TableName("fsnip_sc_gzzf")
public class CenterXzfEntity {

    /**
     *
     */
    @TableId(value = "id",type = IdType.INPUT)
    private Long id;

    /**
     *所属管局编号(受理机关编号)
     */
    @TableField("ssgjbh")
    private String ssgjbh;

    /**
     *作坊名称
     */
    @TableField("zfmc")
    private String zfmc;

    /**
     *登记证号
     */
    @TableField("djzh")
    private String djzh;

    /**
     *登记证号UUID
     */
    @TableField("djzh_uuid")
    private String djzhUUID;

    /**
     *社会信用代码(身份证号码)  类别
     */
    @TableField("shxydm_lb")
    private String shxydmlb;

    /**
     *社会信用代码(身份证号码)
     */
    @TableField("shxydm")
    private String shxydm;

    /**
     *日常监督管理机构
     */
    @TableField("rcjdgljg")
    private String rcjdgljg;

    /**
     *法定代表人(负责人)
     */
    @TableField("fddbr")
    private String fddbr;

    /**
     *食品类别(一级)
     */
    @TableField("splb_1")
    private String splb1;

    /**
     *食品类别(二级)
     */
    @TableField("splb_2")
    private String splb2; 

    /**
     * 食品类别(明细)
     */
    @TableField("splb")
    private String splb;

    /**
     *住所
     */
    @TableField("zs")
    private String zs; 

    /**
     * 生产地址
     */
    @TableField("scdz")
    private String scdz; 

    /**
     *投诉举报电话
     */
    @TableField("tsjbdh")
    private String tsjbdh; 

    /**
     *登记机关
     */
    @TableField("djjg")
    private String djjg; 

    /**
     * 登记机关ID
     */
    @TableField("djjg_id")
    private Long djjgId; 

    /**
     *有效期限
     */
    @TableField("yxqx")
    private Date yxqx; 

    /**
     *发证日期
     */
    @TableField("fzrq")
    private Date fzrq; 

    /**
     *生成二维码存放的路径
     */
    @TableField("rwm_url")
    private String rwmUrl; 

    /**
     *当前状态 (0:未确认, 1:已确认)
     */
    @TableField("state")
    private Integer state; 

    /**
     *创建时间
     */
    @TableField("create_time")
    private Date createTime; 

    /**
     *更改时间
     */
    @TableField("update_time")
    private Date updateTime; 

    /**
     *省(传行政区编码)
     */
    @TableField("province_code")
    private String provinceCode; 

    /**
     *市(传行政区编码)
     */
    @TableField("city_code")
    private String cityCode; 

    /**
     *区县(传行政区编码)
     */
    @TableField("area_code")
    private String areaCode; 

    /**
     *生产详细地址
     */
    @TableField("xxdz")
    private String xxdz; 

    /**
     *住所，省(传行政区编码)
     */
    @TableField("zs_province_code")
    private String zsProvinceCode; 

    /**
     *住所，市(传行政区编码)
     */
    @TableField("zs_city_code")
    private String zsCityCode; 

    /**
     *住所，区县(传行政区编码)
     */
    @TableField("zs_area_code")
    private String zsAreaCode; 

    /**
     *住所，生产详细地址
     */
    @TableField("zs_xxdz")
    private String zsXxdz; 

    /**
     *用户ID
     */
    @TableField("user_id")
    private Long userId; 

    /**
     *发证机关编号
     */
    @TableField("fzjg")
    private String fzjg; 

    /**
     *下发任务的次数
     */
    @TableField("xfrwNo")
    private Integer xfrwNo; 

    /**
     *现场核查处理结果（1-未处理 2-已处理）
     */
    @TableField("inspect_result")
    private Integer inspectResult;

    public CenterXzfEntity(ScXzfEntity scXzfEntity) {
        this.id = scXzfEntity.getId();
        this.ssgjbh = scXzfEntity.getSsgjbh();
        this.zfmc = scXzfEntity.getZfmc();
        this.djzh = scXzfEntity.getDjzh();
        this.djzhUUID = scXzfEntity.getDjzhUUID();
        this.shxydmlb = scXzfEntity.getShxydmlb();
        this.shxydm = scXzfEntity.getShxydm();
        this.rcjdgljg = scXzfEntity.getRcjdgljg();
        this.fddbr = scXzfEntity.getFddbr();
        this.splb1 = scXzfEntity.getSplb1();
        this.splb2 = scXzfEntity.getSplb2();
        this.splb = scXzfEntity.getSplb();
        this.zs = scXzfEntity.getZs();
        this.scdz = scXzfEntity.getScdz();
        this.tsjbdh = scXzfEntity.getTsjbdh();
        this.djjg = scXzfEntity.getDjjg();
        this.djjgId = scXzfEntity.getDjjgId();
        this.yxqx = scXzfEntity.getYxqx();
        this.fzrq = scXzfEntity.getFzrq();
        this.rwmUrl = scXzfEntity.getRwmUrl();
        this.state = scXzfEntity.getState();
        this.createTime = scXzfEntity.getCreateTime();
        this.updateTime = scXzfEntity.getUpdateTime();
        this.provinceCode = scXzfEntity.getProvinceCode();
        this.cityCode = scXzfEntity.getCityCode();
        this.areaCode = scXzfEntity.getAreaCode();
        this.xxdz = scXzfEntity.getXxdz();
        this.zsProvinceCode = scXzfEntity.getZsProvinceCode();
        this.zsCityCode = scXzfEntity.getZsCityCode();
        this.zsAreaCode = scXzfEntity.getZsAreaCode();
        this.zsXxdz = scXzfEntity.getZsXxdz();
        this.userId = scXzfEntity.getUserId();
        this.fzjg = scXzfEntity.getFzjg();
        this.xfrwNo = scXzfEntity.getXfrwNo();
        this.inspectResult = scXzfEntity.getInspectResult();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSsgjbh() {
        return ssgjbh;
    }

    public void setSsgjbh(String ssgjbh) {
        this.ssgjbh = ssgjbh;
    }

    public String getZfmc() {
        return zfmc;
    }

    public void setZfmc(String zfmc) {
        this.zfmc = zfmc;
    }

    public String getDjzh() {
        return djzh;
    }

    public void setDjzh(String djzh) {
        this.djzh = djzh;
    }

    public String getShxydm() {
        return shxydm;
    }

    public void setShxydm(String shxydm) {
        this.shxydm = shxydm;
    }

    public String getRcjdgljg() {
        return rcjdgljg;
    }

    public void setRcjdgljg(String rcjdgljg) {
        this.rcjdgljg = rcjdgljg;
    }

    public String getFddbr() {
        return fddbr;
    }

    public void setFddbr(String fddbr) {
        this.fddbr = fddbr;
    }

    public String getSplb() {
        return splb;
    }

    public void setSplb(String splb) {
        this.splb = splb;
    }

    public String getZs() {
        return zs;
    }

    public void setZs(String zs) {
        this.zs = zs;
    }

    public String getScdz() {
        return scdz;
    }

    public void setScdz(String scdz) {
        this.scdz = scdz;
    }

    public String getTsjbdh() {
        return tsjbdh;
    }

    public void setTsjbdh(String tsjbdh) {
        this.tsjbdh = tsjbdh;
    }

    public String getDjjg() {
        return djjg;
    }

    public void setDjjg(String djjg) {
        this.djjg = djjg;
    }

    public Date getYxqx() {
        return yxqx;
    }

    public void setYxqx(Date yxqx) {
        this.yxqx = yxqx;
    }

    public Date getFzrq() {
        return fzrq;
    }

    public void setFzrq(Date fzrq) {
        this.fzrq = fzrq;
    }

    public String getRwmUrl() {
        return rwmUrl;
    }

    public void setRwmUrl(String rwmUrl) {
        this.rwmUrl = rwmUrl;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() { return updateTime; }

    public void setUpdateTime(Date updateTime) { this.updateTime = updateTime; }

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


    public String getSplb1() {
        return splb1;
    }

    public void setSplb1(String splb1) {
        this.splb1 = splb1;
    }

    public String getSplb2() {
        return splb2;
    }

    public void setSplb2(String splb2) {
        this.splb2 = splb2;
    }

    public String getShxydmlb() {
        return shxydmlb;
    }

    public void setShxydmlb(String shxydmlb) {
        this.shxydmlb = shxydmlb;
    }

    public String getDjzhUUID() {
        return djzhUUID;
    }

    public void setDjzhUUID(String djzhUUID) {
        this.djzhUUID = djzhUUID;
    }

    public Long getDjjgId() {
        return djjgId;
    }

    public void setDjjgId(Long djjgId) {
        this.djjgId = djjgId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFzjg() {
        return fzjg;
    }

    public void setFzjg(String fzjg) {
        this.fzjg = fzjg;
    }

    public String getXxdz() {
        return xxdz;
    }

    public void setXxdz(String xxdz) {
        this.xxdz = xxdz;
    }

    public String getZsProvinceCode() {
        return zsProvinceCode;
    }

    public void setZsProvinceCode(String zsProvinceCode) {
        this.zsProvinceCode = zsProvinceCode;
    }

    public String getZsCityCode() {
        return zsCityCode;
    }

    public void setZsCityCode(String zsCityCode) {
        this.zsCityCode = zsCityCode;
    }

    public String getZsAreaCode() {
        return zsAreaCode;
    }

    public void setZsAreaCode(String zsAreaCode) {
        this.zsAreaCode = zsAreaCode;
    }

    public String getZsXxdz() {
        return zsXxdz;
    }

    public void setZsXxdz(String zsXxdz) {
        this.zsXxdz = zsXxdz;
    }

    public Integer getXfrwNo() {
        return xfrwNo;
    }

    public void setXfrwNo(Integer xfrwNo) {
        this.xfrwNo = xfrwNo;
    }

    public Integer getInspectResult() {
        return inspectResult;
    }

    public void setInspectResult(Integer inspectResult) {
        this.inspectResult = inspectResult;
    }
}
