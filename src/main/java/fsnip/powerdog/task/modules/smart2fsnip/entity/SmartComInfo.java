package fsnip.powerdog.task.modules.smart2fsnip.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;


/**
 * @Description: 工商信息表
 * @Author: yangshudong
 * @DateTime: 2018/7/13
 */
@TableName("smart_com_info")
public class SmartComInfo implements Serializable {
    private static final long serialVersionUID = 1L;

	/**\
	 * 转换临时uuid
	 */
	@TableId("uuid")
    private String uuid;
    /**
     * 许可证ID
     */
	private String id;
    /**
     * 许可证类型：1食品经营，2：食品生产，3:小作坊
     */
	private String xkzlx;
    /**
     * 许可证编号
     */
	private String xkzbh;
    /**
     * 主体名称
     */
	private String qymc;
    /**
     * 注册号
     */
	private String zch;
    /**
     * 统一社会信用代码
     */
	private String xydm;
    /**
     * 负责人
     */
	private String fzr;
    /**
     * 联系电话
     */
	private String lxdh;
    /**
     * 管辖单位
     */
	private String gxdw;
    /**
     * 住所
     */
	private String zs;
    /**
     * 是否微企，1:是，其他：否
     */
	private String wq;
    /**
     * 成立日期
     */
	private Date clrq;
    /**
     * 经营范围
     */
	private String jyfw;
    /**
     * 经营类别
     */
	private String jylb;
    /**
     * 经营期限起
     */
	private Date jyqx1;
    /**
     * 经营期限止
     */
	private Date jyqx2;
    /**
     * 核准日期
     */
	private Date hzrq;
    /**
     * 注销日期
     */
	private Date zxrq;
    /**
     * 吊销日期
     */
	private Date dxrq;
    /**
     * 所属社区
     */
	private String sssq;
    /**
     * 登记机关
     */
	private String djjg;
    /**
     * 注册资本
     */
	private String zczb;
    /**
     * 企业类型名称
     */
	private String qylxmc;
    /**
     * 企业类型（主类）
     */
	@TableField("qylx_zl")
	private String qylxZl;
    /**
     * 企业类型（细类）
     */
	@TableField("qylx_xl")
	private String qylxXl;
    /**
     * 许可经营项目
     */
	private String xkjyxm;

	/**
	 * 同步标记
	 */
	@TableField("syn_status")
	private Integer synStatus;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getXkzlx() {
		return xkzlx;
	}

	public void setXkzlx(String xkzlx) {
		this.xkzlx = xkzlx;
	}

	public String getXkzbh() {
		return xkzbh;
	}

	public void setXkzbh(String xkzbh) {
		this.xkzbh = xkzbh;
	}

	public String getQymc() {
		return qymc;
	}

	public void setQymc(String qymc) {
		this.qymc = qymc;
	}

	public String getZch() {
		return zch;
	}

	public void setZch(String zch) {
		this.zch = zch;
	}

	public String getXydm() {
		return xydm;
	}

	public void setXydm(String xydm) {
		this.xydm = xydm;
	}

	public String getFzr() {
		return fzr;
	}

	public void setFzr(String fzr) {
		this.fzr = fzr;
	}

	public String getLxdh() {
		return lxdh;
	}

	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}

	public String getGxdw() {
		return gxdw;
	}

	public void setGxdw(String gxdw) {
		this.gxdw = gxdw;
	}

	public String getZs() {
		return zs;
	}

	public void setZs(String zs) {
		this.zs = zs;
	}

	public String getWq() {
		return wq;
	}

	public void setWq(String wq) {
		this.wq = wq;
	}

	public Date getClrq() {
		return clrq;
	}

	public void setClrq(Date clrq) {
		this.clrq = clrq;
	}

	public String getJyfw() {
		return jyfw;
	}

	public void setJyfw(String jyfw) {
		this.jyfw = jyfw;
	}

	public String getJylb() {
		return jylb;
	}

	public void setJylb(String jylb) {
		this.jylb = jylb;
	}

	public Date getJyqx1() {
		return jyqx1;
	}

	public void setJyqx1(Date jyqx1) {
		this.jyqx1 = jyqx1;
	}

	public Date getJyqx2() {
		return jyqx2;
	}

	public void setJyqx2(Date jyqx2) {
		this.jyqx2 = jyqx2;
	}

	public Date getHzrq() {
		return hzrq;
	}

	public void setHzrq(Date hzrq) {
		this.hzrq = hzrq;
	}

	public Date getZxrq() {
		return zxrq;
	}

	public void setZxrq(Date zxrq) {
		this.zxrq = zxrq;
	}

	public Date getDxrq() {
		return dxrq;
	}

	public void setDxrq(Date dxrq) {
		this.dxrq = dxrq;
	}

	public String getSssq() {
		return sssq;
	}

	public void setSssq(String sssq) {
		this.sssq = sssq;
	}

	public String getDjjg() {
		return djjg;
	}

	public void setDjjg(String djjg) {
		this.djjg = djjg;
	}

	public String getZczb() {
		return zczb;
	}

	public void setZczb(String zczb) {
		this.zczb = zczb;
	}

	public String getQylxmc() {
		return qylxmc;
	}

	public void setQylxmc(String qylxmc) {
		this.qylxmc = qylxmc;
	}

	public String getQylxZl() {
		return qylxZl;
	}

	public void setQylxZl(String qylxZl) {
		this.qylxZl = qylxZl;
	}

	public String getQylxXl() {
		return qylxXl;
	}

	public void setQylxXl(String qylxXl) {
		this.qylxXl = qylxXl;
	}

	public String getXkjyxm() {
		return xkjyxm;
	}

	public void setXkjyxm(String xkjyxm) {
		this.xkjyxm = xkjyxm;
	}

	public Integer getSynStatus() {
		return synStatus;
	}

	public void setSynStatus(Integer synStatus) {
		this.synStatus = synStatus;
	}
}