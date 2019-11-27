package fsnip.powerdog.task.modules.spsc2fsnip.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.util.Date;


/**
 * Create by chenxiaolin on 2018/7/13 11:24
 * @Desc 生产许可证信息
 */
@TableName("fsnip_sc_xkzxx")
public class CenterXkzxxEntity {

    /**
     * ID
     */
    @TableId(value = "id",type = IdType.INPUT)
    private Long id;

    /**
     * 生产者名称
     */
    @TableField("SCZMC")
    private String sczmc;

    /**
     * 生产许可证编号
     */
    @TableField("SCXKZBH")
    private String scxkzbh;

    /**
     *原生产许可证编号备注
     */
    @TableField("LSCXKZBH")
    private String lscxkzbz;  

    /**
     *社会信用代码(身份证号码)  类别
     */
    @TableField("shxydm_lb")
    private String shxydmlb;  

    /**
     *社会信用代码：（身份证号码）
     */
    @TableField("SHXYDM")
    private String shxydm;  

    /**
     *日常监督管理机构
     */
    @TableField("RCJDGLJG")
    private String rcjdgljg;  

    /**
     *法定代表人
     */
    @TableField("FDDBR")
    private String fddbr;  

    /**
     *住所
     */
    @TableField("ZS")
    private String zs;  

    /**
     *日常监督管理人员
     */
    @TableField("RCJDGLRY")
    private String rcjdglry;  

    /**
     *投诉举报电话
     */
    @TableField("TSJBDH")
    private String tsjbdh;  

    /**
     *生产地址
     */
    @TableField("SCDZ")
    private String scdz;  

    /**
     *发证机关
     */
    @TableField("FZJG")
    private String fzjg;  

    /**
     *发证机关编码
     */
    @TableField("fzjgbm")
    private String fzjgbm;  

    /**
     *食品类别
     */
    @TableField("SPFL")
    private String spfl;  

    /**
     *签发人
     */
    @TableField("QFR")
    private String qfr;

    /**
     *发证日期
     */
    @TableField("FZRQ")
    private String fzrq; 

    /**
     *有效期至
     */
    @TableField("YXQZ")
    private String yxqz; 

    /**
     *外设仓库地址
     */
    @TableField("WSCKDZ")
    private String wsckdz; 

    /**
     *省(传行政区编码)
     */
    @TableField("PROVINCE_CODE")
    private String provinceCode; 

    /**
     *市(传行政区编码)
     */
    @TableField("CITY_CODE")
    private String cityCode; 

    /**
     *区县(传行政区编码)
     */
    @TableField("AREA_CODE")
    private String areaCode;

    /**
     *当前状态 0保存，1提交
     */
    @TableField("STATUS")
    private Integer status;

    /**
     *创建时间
     */
    @TableField("CREATE_DATE")
    private Date createDate; 

    /**
     *更改时间
     */
    @TableField("UPDATE_DATE")
    private Date updateDate; 

    /**
     *所属管局编号
     */
    @TableField("SSGJBH")
    private String ssgjbh; 

    /**
     *二维码全路径副本
     */
    @TableField("FBEWMQLJ")
    private String fbewmqlj; 

    /**
     *二维码全路径正本
     */
    @TableField("ZBEWMQLJ")
    private String zbewmqlj; 

    /**
     *用户ID
     */
    @TableField("USER_ID")
    private Long userId;

    public CenterXkzxxEntity(ScXkzxxEntity scXkzxxEntity) {
        this.id = scXkzxxEntity.getId();
        this.sczmc = scXkzxxEntity.getSczmc();
        this.scxkzbh = scXkzxxEntity.getScxkzbh();
        this.lscxkzbz = scXkzxxEntity.getLscxkzbz();
        this.shxydmlb = scXkzxxEntity.getShxydmlb();
        this.shxydm = scXkzxxEntity.getShxydm();
        this.rcjdgljg = scXkzxxEntity.getRcjdgljg();
        this.fddbr = scXkzxxEntity.getFddbr();
        this.zs = scXkzxxEntity.getZs();
        this.rcjdglry = scXkzxxEntity.getRcjdglry();
        this.tsjbdh = scXkzxxEntity.getTsjbdh();
        this.scdz = scXkzxxEntity.getScdz();
        this.fzjg = scXkzxxEntity.getFzjg();
        this.fzjgbm = scXkzxxEntity.getFzjgbm();
        this.spfl = scXkzxxEntity.getSpfl();
        this.qfr = scXkzxxEntity.getQfr();
        this.fzrq = scXkzxxEntity.getFzrq();
        this.yxqz = scXkzxxEntity.getYxqz();
        this.wsckdz = scXkzxxEntity.getWsckdz();
        this.provinceCode = scXkzxxEntity.getProvinceCode();
        this.cityCode = scXkzxxEntity.getCityCode();
        this.areaCode = scXkzxxEntity.getAreaCode();
        this.status = scXkzxxEntity.getStatus();
        this.createDate = scXkzxxEntity.getCreateDate();
        this.updateDate = scXkzxxEntity.getUpdateDate();
        this.ssgjbh = scXkzxxEntity.getSsgjbh();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSczmc() {
        return sczmc;
    }

    public void setSczmc(String sczmc) {
        this.sczmc = sczmc;
    }

    public String getScxkzbh() {
        return scxkzbh;
    }

    public void setScxkzbh(String scxkzbh) {
        this.scxkzbh = scxkzbh;
    }

    public String getShxydmlb() {
        return shxydmlb;
    }

    public void setShxydmlb(String shxydmlb) {
        this.shxydmlb = shxydmlb;
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

    public String getZs() {
        return zs;
    }

    public void setZs(String zs) {
        this.zs = zs;
    }

    public String getRcjdglry() {
        return rcjdglry;
    }

    public void setRcjdglry(String rcjdglry) {
        this.rcjdglry = rcjdglry;
    }

    public String getTsjbdh() {
        return tsjbdh;
    }

    public void setTsjbdh(String tsjbdh) {
        this.tsjbdh = tsjbdh;
    }

    public String getScdz() {
        return scdz;
    }

    public void setScdz(String scdz) {
        this.scdz = scdz;
    }

    public String getFzjg() {
        return fzjg;
    }

    public void setFzjg(String fzjg) {
        this.fzjg = fzjg;
    }

    public String getFzjgbm() {
        return fzjgbm;
    }

    public void setFzjgbm(String fzjgbm) {
        this.fzjgbm = fzjgbm;
    }

    public String getSpfl() {
        return spfl;
    }

    public void setSpfl(String spfl) {
        this.spfl = spfl;
    }

    public String getQfr() {
        return qfr;
    }

    public void setQfr(String qfr) {
        this.qfr = qfr;
    }

    public String getYxqz() {
        return yxqz;
    }

    public void setYxqz(String yxqz) {
        this.yxqz = yxqz;
    }

    public String getWsckdz() {
        return wsckdz;
    }

    public void setWsckdz(String wsckdz) {
        this.wsckdz = wsckdz;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }


    public String getSsgjbh() {
        return ssgjbh;
    }

    public void setSsgjbh(String ssgjbh) {
        this.ssgjbh = ssgjbh;
    }

    public String getFbewmqlj() {
        return fbewmqlj;
    }

    public void setFbewmqlj(String fbewmqlj) {
        this.fbewmqlj = fbewmqlj;
    }

    public String getZbewmqlj() {
        return zbewmqlj;
    }

    public void setZbewmqlj(String zbewmqlj) {
        this.zbewmqlj = zbewmqlj;
    }

    public String getLscxkzbz() {
        return lscxkzbz;
    }

    public void setLscxkzbz(String lscxkzbz) {
        this.lscxkzbz = lscxkzbz;
    }

    public String getFzrq() {
        return fzrq;
    }

    public void setFzrq(String fzrq) {
        this.fzrq = fzrq;
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

}
