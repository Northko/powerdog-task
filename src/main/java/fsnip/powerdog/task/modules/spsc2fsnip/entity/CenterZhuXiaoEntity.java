package fsnip.powerdog.task.modules.spsc2fsnip.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.util.Date;

/**
 * @author chenxiaolin 2018/7/13 10:08
 * @Desc 注销许可证信息 Entity
 */
@TableName("fsnip_f_zxxx")
public class CenterZhuXiaoEntity {

	/**
	 * ID
	 */
	@TableId(value = "id",type = IdType.INPUT)
	private Long id;
    
    /**
     * 注销原因
     */
    @TableField("ZXYY")
    private String reason;
    
    /**
     * 注销申请时间
     */
    @TableField("ZXSQSJ")
    private Date applyDate;
    
    /**
     * 注销许可机关
     */
    @TableField("ZXXKJG")
    private String authority;
    
    /**
     * 注销许可日期
     */
    @TableField("ZXXKRQ")
    private String permissionDate;
    
    /**
     * 注销许可人
     */
    @TableField("ZXXKR")
    private String licensor;
    
    /**
     * 委托人代理人ID
     */
    @TableField("WTDLRID")
    private Long agentId;
    
    /**
     * 食品经营许可ID
     */
    @TableField("SPJYXKXXID")
    private Long licenseId;
    
    /**
	 * 经营者名称
	 */
	@TableField("JYZMC")
	private String businessOperator;
    
    /**
	 * 经营场所
	 */
	@TableField("JYCS")
	private String businessPlace;
	
	/**
     * 拟受理机关
     */
    @TableField("NSLJG")
    private String acceptOrgan;
    
    /**
     * 拟受理机关编码
     */
    @TableField("NSLJGBM")
    private String acceptOrganCode;
    
    /**
     * 创建者
     */
    @TableField("CJZ")
    private String createUser;
    
    /**
     * 业务类型  0：企业注销申请 1：依法注销 2：依法撤销 3：依法撤回 4:现场注销办理
     */
    @TableField("YWLX")
    private String businessType;
    
    /**
     * 业务类型名称
     */
    @TableField("YWLXMC")
    private String businessTypeName;
    
    /**
     * 注销来源ID（父类ID）
     */
    @TableField("FLID")
    private Long parentId;
    
    /**
     * 创建时间
     */
    @TableField("CJSJ")
    private Date createTime;
    
    /**
     * 更新者
     */
    @TableField("GXZ")
    private String modifyUer;
    
    /**
     * 更新时间
     */
    @TableField("GXSJ")
    private Date modifyTime;
    
    /**
     * 流程状态
     */
    @TableField("BLZT")
    private String processStatus;
    
    /**
     * 流程状态名称
     */
    @TableField("BLZTMC")
    private String processStatusName;
    
    /**
     * 注销申请状态
     * 		0:暂存（未提交） 1：正在办理 2：同意  3:拒绝处理  4:被撤回 5：不同意 6:退回申请
     */
    @TableField("ZXSQZT")
    private String applyStatus = "0";
    
    /**
     * 注销申请状态名称
     */
    @TableField("ZXSQZTMC")
    private String applyStatusName;
    
    /**
     * 流程ID
     */
    @TableField("process_id")
    private String processId;

	/**
	 * 归档日期
	 */
	@TableField("GDRQ")
	private Date fileDate;

	public CenterZhuXiaoEntity(SpZhuXiaoEntity spZhuXiaoEntity) {

		this.id = spZhuXiaoEntity.getId();
		this.reason = spZhuXiaoEntity.getReason();
		this.applyDate = spZhuXiaoEntity.getApplyDate();
		this.authority = spZhuXiaoEntity.getAuthority();
		this.permissionDate = spZhuXiaoEntity.getPermissionDate();
		this.licensor = spZhuXiaoEntity.getLicensor();
		this.agentId = spZhuXiaoEntity.getAgentId();
		this.licenseId = spZhuXiaoEntity.getLicenseId();
		this.businessOperator = spZhuXiaoEntity.getBusinessOperator();
		this.businessPlace = spZhuXiaoEntity.getBusinessPlace();
		this.acceptOrgan = spZhuXiaoEntity.getAcceptOrgan();
		this.acceptOrganCode = spZhuXiaoEntity.getAcceptOrganCode();
		this.createUser = spZhuXiaoEntity.getCreateUser();
		this.businessType = spZhuXiaoEntity.getBusinessType();
		this.businessTypeName = spZhuXiaoEntity.getBusinessTypeName();
		this.parentId = spZhuXiaoEntity.getParentId();
		this.createTime = spZhuXiaoEntity.getCreateTime();
		this.modifyUer = spZhuXiaoEntity.getModifyUer();
		this.modifyTime = spZhuXiaoEntity.getModifyTime();
		this.processStatus = spZhuXiaoEntity.getProcessStatus();
		this.processStatusName = spZhuXiaoEntity.getProcessStatusName();
		this.applyStatus = spZhuXiaoEntity.getApplyStatus();
		this.applyStatusName = spZhuXiaoEntity.getApplyStatusName();
		this.processId = spZhuXiaoEntity.getProcessId();
		this.fileDate = spZhuXiaoEntity.getFileDate();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getApplyStatusName() {
		return applyStatusName;
	}

	public void setApplyStatusName(String applyStatusName) {
		this.applyStatusName = applyStatusName;
	}

	public String getPermissionDate() {
		return permissionDate;
	}

	public void setPermissionDate(String permissionDate) {
		this.permissionDate = permissionDate;
	}

	public String getLicensor() {
		return licensor;
	}

	public void setLicensor(String licensor) {
		this.licensor = licensor;
	}

	public Long getLicenseId() {
		return licenseId;
	}

	public void setLicenseId(Long licenseId) {
		this.licenseId = licenseId;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getModifyUer() {
		return modifyUer;
	}

	public void setModifyUer(String modifyUer) {
		this.modifyUer = modifyUer;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public Long getAgentId() {
		return agentId;
	}

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public String getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public String getProcessStatusName() {
		return processStatusName;
	}

	public void setProcessStatusName(String processStatusName) {
		this.processStatusName = processStatusName;
	}

	public String getApplyStatus() {
		return applyStatus;
	}

	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public String getBusinessPlace() {
		return businessPlace;
	}

	public void setBusinessPlace(String businessPlace) {
		this.businessPlace = businessPlace;
	}

	public String getAcceptOrgan() {
		return acceptOrgan;
	}

	public void setAcceptOrgan(String acceptOrgan) {
		this.acceptOrgan = acceptOrgan;
	}

	public String getAcceptOrganCode() {
		return acceptOrganCode;
	}

	public void setAcceptOrganCode(String acceptOrganCode) {
		this.acceptOrganCode = acceptOrganCode;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getBusinessTypeName() {
		return businessTypeName;
	}

	public void setBusinessTypeName(String businessTypeName) {
		this.businessTypeName = businessTypeName;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public String getBusinessOperator() {
		return businessOperator;
	}

	public void setBusinessOperator(String businessOperator) {
		this.businessOperator = businessOperator;
	}

	public Date getFileDate() {
		return fileDate;
	}

	public void setFileDate(Date fileDate) {
		this.fileDate = fileDate;
	}
}
