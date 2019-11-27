package fsnip.powerdog.task.modules.spsc2fsnip.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;

/**
 * @author chenxiaolin 2018/7/12 16:06
 * @Desc 经营许可基本信息
 */
@TableName("e_spjyxkxx")
public class SPLicenseEntity {

    /**
     * ID
     */
    @TableId
    private Long id;

    /**
     * 经营者名称
     */
    @TableField("JYZMC")
    private String businessOperator;

    /**
     * 社会信用代码（证件号码）
     */
    @TableField("SHXYDMZJHM")
    private String socialCreditCode;

    /**
     * 法定代表人（负责人）
     */
    @TableField("FDDBRFZR")
    private String legalRepresent;

    /**
     * 法定代表人（负责人）证件号码
     */
    @TableField("FDDBRFZRZZHM")
    private String legalRepresentIdCard;

    /**
     * 经济性质
     */
    @TableField("JJXZ")
    private String economicNature;

    /**
     * 住所
     */
    @TableField("ZS")
    private String residence;

    /**
     * 经营场所
     */
    @TableField("JYCS")
    private String businessPlace;

    /**
     * 经营场所行政区划代码 如 贵阳 ：520100
     */
    @TableField("JYCSXZQH")
    private String businessPlaceAdmincode;

    /**
     * 仓库地址
     */
    @TableField("CKDZ")
    private String warehouseAddress;

    /**
     * 许可证编号
     */
    @TableField("XKZBH")
    private String licenseNo;

    /**
     * 主体业态
     */
    @TableField("ZTYT")
    private String mainBodyForm;

    /**
     * 主体业态代码
     */
    @TableField("ZTYTDM")
    private String mainBodyCode;

    /**
     * 是否含网络经营
     */
    @TableField("SFHWLJY")
    private String networkBusiness;

    /**
     * 网站地址
     */
    @TableField("WZDZ")
    private String websiteAddress;

    /**
     * 是否有实体门店
     * 		1：有 2：没有
     */
    @TableField("STMD")
    private String entityStore;

    /**
     * 是否有中央厨房
     */
    @TableField("ZYCF")
    private String centralKitchen;


    /**
     * 是否连锁经营
     */
    @TableField("LSJY")
    private String chainOperation;

    /**
     * 是否批发销售
     */
    @TableField("PFXS")
    private String wholeSale;

    /**
     * 餐馆规模
     */
    @TableField("CGGM")
    private String restaurantScale;

    /**
     * 食堂类型
     */
    @TableField("STLX")
    private String refectoryType;

    /**
     * 是否有集体用餐配送单位
     */
    @TableField("JTYCPSDW")
    private String groupMealDeliveryUnit;

    /**
     * 是否利用自动售货设备从事食品销售
     */
    @TableField("LYZDSHSBCSSPXS")
    private String useAutoEquipment;

    /**
     * 经营项目
     */
    @TableField("JYXM")
    private String businessItem;

    /**
     * 其他类食品销售
     */
    @TableField("QTLSPXS")
    private String otherTypeSale;

    /**
     * 其他类食品制售
     */
    @TableField("QTLSPZS")
    private String otherTypeMakeSale;

    /**
     * 是否有散装熟食销售
     */
    @TableField("SZSSXS")
    private String bulkCookFoodSale;

    /**
     * 是否自制饮品制售
     */
    @TableField("ZLJZS")
    private String selfbrewMakeSale;

    /**
     * 是否裱花糕点制售
     */
    @TableField("BHGDZS")
    private String pastryMakeSale;

    /**
     * 是否有自酿酒销售
     */
    @TableField("ZLJXS")
    private String selfbrewWineSale;

    /**
     * 酒类销售包装类型
     */
    @TableField("JLXSBZLX")
    private String brewWinePackageType;

    /**
     * 酒类销售
     */
    @TableField("JLXS")
    private String brewWineSale;

    /**
     * 日常监督管理机构
     */
    @TableField("RCJDGLJG")
    private String dailySuperviAdminMechanism;

    /**
     * 日常监督管理人员
     */
    @TableField("RCJDGLRY")
    private String dailySuperviAdminPerson;

    /**
     * 有效期
     */
    @TableField("YXQ")
    private String valid;

    /**
     * 有效期至
     */
    @TableField("YXQZ")
    private Date validTill;

    /**
     * 申请副本数
     */
    @TableField("SQFBS")
    private String copyNum;

    /**
     * 发证机关
     */
    @TableField("FZJG")
    private String issuAuthority;

    /**
     * 发证机关编号
     */
    @TableField("FZJGBH")
    private String issuAuthorityNo;

    /**
     * 核准日期
     */
    @TableField("HZRQ")
    private Date approvalDate;

    /**
     * 新办日期
     */
    @TableField("XBRQ")
    private Date newHandleDate;

    /**
     * 签发人
     */
    @TableField("QFR")
    private String issuer;

    /**
     * 职工人数
     */
    @TableField("ZGRS")
    private String workerNum;

    /**
     * 应体检人数
     */
    @TableField("YTJRS")
    private String physicalExamNum;

    /**
     * 邮政编码
     */
    @TableField("YJBM")
    private String postcode;

    /**
     * E-mail
     */
    @TableField("EMAIL")
    private String email;

   /* *//**
     * 是否实体店
     *//*
    @TableField("SFSTD")
    private String isStore;*/

    /**
     * 主体业态-备注
     */
    @TableField("ZTYTBZ")
    private String mainBodyFormRemark;

    /**
     * 网站截图
     */
    @TableField("WZJT")
    private String websiteScreenshot;

    /**
     * 经营项目-备注
     */
    @TableField("JYXMBZ")
    private String businessItemRemark;

    /**
     * 就餐座位数(个)
     */
    @TableField("JCZWS")
    private String diningSeats;

    /**
     * 原许可证ID
     */
    @TableField("YXKZID")
    private Long primaryLicenseId;

    /**
     * 原许可证编号
     */
    @TableField("YXKZBH")
    private String primaryLicenseNo;

    /**
     * 委托人代理人ID
     */
    @TableField("WTDLRID")
    private Long agentId;

    /**
     * 拟受理机关
     */
    @TableField("NSLJG")
    private String acceptOrgan;

    /**
     * 拟受理机关Code
     */
    @TableField("NSLJGBM")
    private String acceptOrganCode;

    /**
     * 创建者
     */
    @TableField("CJZ")
    private String createUser;

    /**
     * 申请类型  1：企业申请  2：现场办理
     */
    @TableField("SQLY")
    private String applyType;

    /**
     * 申请类型名称
     */
    @TableField("SQLYMC")
    private String applyTypeName;

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

    /**************许可证状态相关字段  Start ************/
    /**
     * 业务类型
     * 		1：新办 2：换证  3：延续 4：变更  5:档案修改
     */
    @TableField("YWLX")
    private String businessType;

    /**
     * 业务类型名称
     */
    @TableField("YWLXMC")
    private String businessTypeName;

    /**
     * 许可证状态
     * 		0:暂存(未提交) 1：正在办理 2：有效 3：无效 4：被注销 5：被撤回 6：注销 7:拒绝处理 8:被撤回 9:退回申请 10:已经档案修改
     */
    @TableField("XKZZT")
    private String licenseStatus = "0";

    /**
     * 许可证状态名称
     */
    @TableField("XKZZTMC")
    private String licenseStatusName;

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
    /**************许可证状态相关字段  End ************/

    /*************   延续相关字段    Start  *************/
    /**
     * 布局流程、设施设备等是否变化 1：代表是 2：代表否
     */
    @TableField("BJSBSFBH")
    private String layoutAndEquipChange;
    /**************  延续相关字段  End ************/

    /*************   领证发证相关字段    Start  *************/
    /**
     * 发证日期
     */
    @TableField("FZRQ")
    private Date certificateDate;

    /**
     * 二维码路径 正本
     */
    @TableField("EWMLJ")
    private String qRCodeUrl;

    /**
     * 领证人
     */
    @TableField("LZR")
    private String recipients;

    /**
     * 领证日期
     */
    @TableField("LZRQ")
    private Date receiveDate;
    /*************   领证发证相关字段    End  *************/

    /*************   换证相关字段    Start  *************/
    /**
     * 收回正本数
     */
    @TableField("SHZBS")
    private String callBackOriginalNum;

    /**
     * 收回副本数
     */
    @TableField("SHFBS")
    private String callBackCopyNum;

    /**
     * 换证原因
     */
    @TableField("HZYY")
    private String changeReason;
    /*************   换证相关字段    End  *************/

    /**********   特殊流程相关字段    Start  ***********/
    /**
     * 是否需要走特殊流程
     */
    @TableField("isspecialstep")
    private int isSpecialStep;
    /**********   特殊流程相关字段    End  ************/

    /**
     * 流程ID
     */
    @TableField("process_id")
    private String processId;

    /**
     * 投诉举报电话
     */
    @TableField("TSJBDH")
    private String complaintCall;

    /**
     * 归档日期
     */
    @TableField("GDRQ")
    private Date fileDate;

	public String getBusinessItemRemark() {
		return businessItemRemark;
	}

	public void setBusinessItemRemark(String businessItemRemark) {
		this.businessItemRemark = businessItemRemark;
	}

	public String getqRCodeUrl() {
		return qRCodeUrl;
	}

	public void setqRCodeUrl(String qRCodeUrl) {
		this.qRCodeUrl = qRCodeUrl;
	}

	public String getWebsiteScreenshot() {
		return websiteScreenshot;
	}

	public void setWebsiteScreenshot(String websiteScreenshot) {
		this.websiteScreenshot = websiteScreenshot;
	}

	public String getMainBodyFormRemark() {
		return mainBodyFormRemark;
	}

	public void setMainBodyFormRemark(String mainBodyFormRemark) {
		this.mainBodyFormRemark = mainBodyFormRemark;
	}

	public String getMainBodyCode() {
		return mainBodyCode;
	}

	public void setMainBodyCode(String mainBodyCode) {
		this.mainBodyCode = mainBodyCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBusinessOperator() {
		return businessOperator;
	}

	public void setBusinessOperator(String businessOperator) {
		this.businessOperator = businessOperator;
	}

	public String getSocialCreditCode() {
		return socialCreditCode;
	}

	public void setSocialCreditCode(String socialCreditCode) {
		this.socialCreditCode = socialCreditCode;
	}

	public String getLegalRepresent() {
		return legalRepresent;
	}

	public void setLegalRepresent(String legalRepresent) {
		this.legalRepresent = legalRepresent;
	}

	public String getEconomicNature() {
		return economicNature;
	}

	public void setEconomicNature(String economicNature) {
		this.economicNature = economicNature;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public String getLayoutAndEquipChange() {
		return layoutAndEquipChange;
	}

	public void setLayoutAndEquipChange(String layoutAndEquipChange) {
		this.layoutAndEquipChange = layoutAndEquipChange;
	}

	public String getBusinessPlace() {
		return businessPlace;
	}

	public void setBusinessPlace(String businessPlace) {
		this.businessPlace = businessPlace;
	}

	public String getWarehouseAddress() {
		return warehouseAddress;
	}

	public void setWarehouseAddress(String warehouseAddress) {
		this.warehouseAddress = warehouseAddress;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getMainBodyForm() {
		return mainBodyForm;
	}

	public void setMainBodyForm(String mainBodyForm) {
		this.mainBodyForm = mainBodyForm;
	}

	public String getWebsiteAddress() {
		return websiteAddress;
	}

	public void setWebsiteAddress(String websiteAddress) {
		this.websiteAddress = websiteAddress;
	}

	public String getCentralKitchen() {
		return centralKitchen;
	}

	public void setCentralKitchen(String centralKitchen) {
		this.centralKitchen = centralKitchen;
	}

	public String getGroupMealDeliveryUnit() {
		return groupMealDeliveryUnit;
	}

	public void setGroupMealDeliveryUnit(String groupMealDeliveryUnit) {
		this.groupMealDeliveryUnit = groupMealDeliveryUnit;
	}

	public String getUseAutoEquipment() {
		return useAutoEquipment;
	}

	public void setUseAutoEquipment(String useAutoEquipment) {
		this.useAutoEquipment = useAutoEquipment;
	}

	public String getBusinessItem() {
		return businessItem;
	}

	public void setBusinessItem(String businessItem) {
		this.businessItem = businessItem;
	}

	public String getOtherTypeSale() {
		return otherTypeSale;
	}

	public void setOtherTypeSale(String otherTypeSale) {
		this.otherTypeSale = otherTypeSale;
	}

	public String getOtherTypeMakeSale() {
		return otherTypeMakeSale;
	}

	public void setOtherTypeMakeSale(String otherTypeMakeSale) {
		this.otherTypeMakeSale = otherTypeMakeSale;
	}

	public String getBulkCookFoodSale() {
		return bulkCookFoodSale;
	}

	public void setBulkCookFoodSale(String bulkCookFoodSale) {
		this.bulkCookFoodSale = bulkCookFoodSale;
	}

	public String getSelfbrewWineSale() {
		return selfbrewWineSale;
	}

	public void setSelfbrewWineSale(String selfbrewWineSale) {
		this.selfbrewWineSale = selfbrewWineSale;
	}

	public String getDailySuperviAdminMechanism() {
		return dailySuperviAdminMechanism;
	}

	public void setDailySuperviAdminMechanism(String dailySuperviAdminMechanism) {
		this.dailySuperviAdminMechanism = dailySuperviAdminMechanism;
	}

	public String getDailySuperviAdminPerson() {
		return dailySuperviAdminPerson;
	}

	public void setDailySuperviAdminPerson(String dailySuperviAdminPerson) {
		this.dailySuperviAdminPerson = dailySuperviAdminPerson;
	}

	public Date getValidTill() {
		return validTill;
	}

	public void setValidTill(Date validTill) {
		this.validTill = validTill;
	}

	public String getIssuAuthority() {
		return issuAuthority;
	}

	public void setIssuAuthority(String issuAuthority) {
		this.issuAuthority = issuAuthority;
	}

	public Date getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}

	public Date getNewHandleDate() {
		return newHandleDate;
	}

	public void setNewHandleDate(Date newHandleDate) {
		this.newHandleDate = newHandleDate;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getLicenseStatus() {
		return licenseStatus;
	}

	public void setLicenseStatus(String licenseStatus) {
		this.licenseStatus = licenseStatus;
	}

	public String getLicenseStatusName() {
		return licenseStatusName;
	}

	public void setLicenseStatusName(String licenseStatusName) {
		this.licenseStatusName = licenseStatusName;
	}

	public String getCopyNum() {
		return copyNum;
	}

	public void setCopyNum(String copyNum) {
		this.copyNum = copyNum;
	}

	public String getWorkerNum() {
		return workerNum;
	}

	public void setWorkerNum(String workerNum) {
		this.workerNum = workerNum;
	}

	public String getPhysicalExamNum() {
		return physicalExamNum;
	}

	public void setPhysicalExamNum(String physicalExamNum) {
		this.physicalExamNum = physicalExamNum;
	}

	public String getDiningSeats() {
		return diningSeats;
	}

	public void setDiningSeats(String diningSeats) {
		this.diningSeats = diningSeats;
	}

	public String getCallBackOriginalNum() {
		return callBackOriginalNum;
	}

	public void setCallBackOriginalNum(String callBackOriginalNum) {
		this.callBackOriginalNum = callBackOriginalNum;
	}

	public String getCallBackCopyNum() {
		return callBackCopyNum;
	}

	public void setCallBackCopyNum(String callBackCopyNum) {
		this.callBackCopyNum = callBackCopyNum;
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

	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	public String getEntityStore() {
		return entityStore;
	}

	public void setEntityStore(String entityStore) {
		this.entityStore = entityStore;
	}

	public String getBrewWineSale() {
		return brewWineSale;
	}

	public void setBrewWineSale(String brewWineSale) {
		this.brewWineSale = brewWineSale;
	}

	public String getAcceptOrgan() {
		return acceptOrgan;
	}

	public void setAcceptOrgan(String acceptOrgan) {
		this.acceptOrgan = acceptOrgan;
	}

	public String getNetworkBusiness() {
		return networkBusiness;
	}

	public void setNetworkBusiness(String networkBusiness) {
		this.networkBusiness = networkBusiness;
	}

	/*public String getIsStore() {
		return isStore;
	}

	public void setIsStore(String isStore) {
		this.isStore = isStore;
	}*/

	public Long getPrimaryLicenseId() {
		return primaryLicenseId;
	}

	public void setPrimaryLicenseId(Long primaryLicenseId) {
		this.primaryLicenseId = primaryLicenseId;
	}

	public String getPrimaryLicenseNo() {
		return primaryLicenseNo;
	}

	public void setPrimaryLicenseNo(String primaryLicenseNo) {
		this.primaryLicenseNo = primaryLicenseNo;
	}

	public int getIsSpecialStep() {
		return isSpecialStep;
	}

	public void setIsSpecialStep(int isSpecialStep) {
		this.isSpecialStep = isSpecialStep;
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

	public String getBusinessPlaceAdmincode() {
		return businessPlaceAdmincode;
	}

	public void setBusinessPlaceAdmincode(String businessPlaceAdmincode) {
		this.businessPlaceAdmincode = businessPlaceAdmincode;
	}

	public String getChangeReason() {
		return changeReason;
	}

	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

	public Long getAgentId() {
		return agentId;
	}

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public SPLicenseEntity() {
		super();
	}

	public Date getCertificateDate() {
		return certificateDate;
	}

	public void setCertificateDate(Date certificateDate) {
		this.certificateDate = certificateDate;
	}

	public String getRecipients() {
		return recipients;
	}

	public void setRecipients(String recipients) {
		this.recipients = recipients;
	}

	public Date getReceiveDate() {
		return receiveDate;
	}

	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}

	public String getLegalRepresentIdCard() {
		return legalRepresentIdCard;
	}

	public void setLegalRepresentIdCard(String legalRepresentIdCard) {
		this.legalRepresentIdCard = legalRepresentIdCard;
	}

	public String getAcceptOrganCode() {
		return acceptOrganCode;
	}

	public void setAcceptOrganCode(String acceptOrganCode) {
		this.acceptOrganCode = acceptOrganCode;
	}

	public String getIssuAuthorityNo() {
		return issuAuthorityNo;
	}

	public void setIssuAuthorityNo(String issuAuthorityNo) {
		this.issuAuthorityNo = issuAuthorityNo;
	}

	public String getApplyType() {
		return applyType;
	}

	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public String getApplyTypeName() {
		return applyTypeName;
	}

	public void setApplyTypeName(String applyTypeName) {
		this.applyTypeName = applyTypeName;
	}

	public String getChainOperation() {
		return chainOperation;
	}

	public void setChainOperation(String chainOperation) {
		this.chainOperation = chainOperation;
	}

	public String getWholeSale() {
		return wholeSale;
	}

	public void setWholeSale(String wholeSale) {
		this.wholeSale = wholeSale;
	}

	public String getRestaurantScale() {
		return restaurantScale;
	}

	public void setRestaurantScale(String restaurantScale) {
		this.restaurantScale = restaurantScale;
	}

	public String getRefectoryType() {
		return refectoryType;
	}

	public void setRefectoryType(String refectoryType) {
		this.refectoryType = refectoryType;
	}

	public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public String getBrewWinePackageType() {
		return brewWinePackageType;
	}

	public void setBrewWinePackageType(String brewWinePackageType) {
		this.brewWinePackageType = brewWinePackageType;
	}

	public String getSelfbrewMakeSale() {
		return selfbrewMakeSale;
	}

	public void setSelfbrewMakeSale(String selfbrewMakeSale) {
		this.selfbrewMakeSale = selfbrewMakeSale;
	}

	public String getPastryMakeSale() {
		return pastryMakeSale;
	}

	public void setPastryMakeSale(String pastryMakeSale) {
		this.pastryMakeSale = pastryMakeSale;
	}

    public String getComplaintCall() {
        return complaintCall;
    }

    public void setComplaintCall(String complaintCall) {
        this.complaintCall = complaintCall;
    }

    public Date getFileDate() {
        return fileDate;
    }

    public void setFileDate(Date fileDate) {
        this.fileDate = fileDate;
    }
}
