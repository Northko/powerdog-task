package fsnip.powerdog.task.modules.lims2supervise.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author kun.tan
 * @description lims 抽检数据
 * @date 2018-12-19 17:38:38
 */
@TableName("sp_bsbs")
public class SuperviseSpBsbs implements Serializable {

    private static final long serialVersionUID = 1233467649467599159L;
    // 检验编号
    @TableField("id")
    private String id;

    // 抽样编号*  抽样编号唯一  根据抽样编号更新
    @TableId("sp_s_16")
    private String spS16;

    // 被抽样单位名称*
    @TableField("sp_s_1")
    private String spS1;

    //
    @TableField("created_at")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String createdAt;


    @TableField("updated_at")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String updatedAt;

    // 抽样地点-2*
    @TableField("sp_s_2")
    private String spS2;

    // 省(被抽样单位)*
    @TableField("sp_s_3")
    private String spS3;

    // 市(被抽样单位)
    @TableField("sp_s_4")
    private String spS4;

    // 县(被抽样单位)
    @TableField("sp_s_5")
    private String spS5;

    // 单位*
    @TableField("sp_s_6")
    private String spS6;

    // 单位地址(被抽样单位)*
    @TableField("sp_s_7")
    private String spS7;

    // 被抽样单位法人(负责人)*
    @TableField("sp_s_8")
    private String spS8;

    // 电话(被抽样单位负责人)
    @TableField("sp_s_9")
    private String spS9;

    // 邮编(被抽样单位)
    @TableField("sp_s_10")
    private String spS10;

    // 被抽样单位负责(联系)人*
    @TableField("sp_s_11")
    private String spS11;

    // 电话(被抽样单位联系人)*
    @TableField("sp_s_12")
    private String spS12;

    // 生产许可证号*
    @TableField("sp_s_13")
    private String spS13;

    // 样品名称*
    @TableField("sp_s_14")
    private String spS14;

    // 抽样数量*
    @TableField("sp_n_15")
    private float spN15;

    // 食品大类
    @TableField("sp_s_17")
    private String spS17;

    // 食品亚类
    @TableField("sp_s_18")
    private String spS18;

    // 食品次亚类
    @TableField("sp_s_19")
    private String spS19;

    // 食品细类
    @TableField("sp_s_20")
    private String spS20;

    // 样品来源*
    @TableField("sp_s_21")
    private String spS_21;

    //
    @TableField("sp_d_22")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String spD22;

    // 年销售额
    @TableField("sp_s_23")
    private String spS23;

    // 抽样方式*
    @TableField("sp_s_24")
    private String spS24;

    // 抽样工具
    @TableField("sp_s_25")
    private String spS25;

    // 样品规格*
    @TableField("sp_s_26")
    private String spS26;

    // 样品批号*
    @TableField("sp_s_27")
    private String spS27;

    // 生产日期*
    @TableField("sp_d_28")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String spD28;

    // 保质期*
    @TableField("sp_n_29")
    private String spN29;

    // 抽样时样品存储状态*
    @TableField("sp_s_30")
    private String spS30;

    // 储存条件-温度(℃)
    @TableField("sp_n_31")
    private BigDecimal spN31;

    // 储存条件-湿度(%)
    @TableField("sp_n_32")
    private BigDecimal spN32;

    // 抽样样品包装*
    @TableField("sp_s_33")
    private String spS33;

    // 备注
    @TableField("sp_s_34")
    private String spS34;

    // 抽样单位名称*
    @TableField("sp_s_35")
    private String spS35;

    // 单位级别*
    @TableField("sp_s_36")
    private String spS36;

    // 抽样人员*
    @TableField("sp_s_37")
    private String spS37;

    // 抽样时间*
    @TableField("sp_d_38")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String spD38;

    // 电话（抽样单位）*
    @TableField("sp_s_39")
    private String spS39;

    // 抽样单位负责（联系）人*
    @TableField("sp_s_40")
    private String spS40;

    // 电话(抽样单位负责人)*
    @TableField("sp_s_41")
    private String spS41;

    // 电子邮箱(抽样单位负责人)*
    @TableField("sp_s_42")
    private String spS42;

    // 检验机构名称*
    @TableField("sp_s_43")
    private String spS43;

    // 检验目的/任务类别*
    @TableField("sp_s_44")
    private String spS44;

    // 报告书编号*
    @TableField("sp_s_45")
    private String spS45;

    // 收检日期*
    @TableField("sp_d_46")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String spD46;

    // 报告日期*
    @TableField("sp_d_47")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String spD47;

    // 报告签发人*
    @TableField("sp_s_48")
    private String spS48;

    // 联系人(检验机构)*
    @TableField("sp_s_49")
    private String spS49;

    // 电话(检验机构)*
    @TableField("sp_s_50")
    private String spS50;

    // 电子邮箱(检验机构)*
    @TableField("sp_s_51")
    private String spS51;

    // 所在省份*
    @TableField("sp_s_52")
    private String spS52;

    //
    @TableField("sp_s_53")
    private String spS53;

    //
    @TableField("sp_s_54")
    private String spS54;

    //
    @TableField("sp_s_55")
    private String spS55;

    //
    @TableField("sp_s_56")
    private String spS56;

    //
    @TableField("sp_s_57")
    private String spS57;

    //
    @TableField("sp_s_58")
    private String spS58;

    //
    @TableField("sp_s_59")
    private String spS59;

    //
    @TableField("sp_s_60")
    private String spS60;

    // 样品形态*
    @TableField("sp_s_61")
    private String spS61;

    // 样品类型*
    @TableField("sp_s_62")
    private String spS62;

    // 包装分类*
    @TableField("sp_s_63")
    private String spS63;

    // 标识生产企业名称*
    @TableField("sp_s_64")
    private String spS64;

    // 标识生产企业地址*
    @TableField("sp_s_65")
    private String spS65;

    //
    @TableField("sp_s_66")
    private String spS66;

    // 报送分类-2*
    @TableField("sp_s_67")
    private String spS67;

    // 抽样地点-1*
    @TableField("sp_s_68")
    private String spS68;

    //
    @TableField("sp_s_69")
    private String spS69;

    // 报送分类-1*
    @TableField("sp_s_70")
    private String spS70;

    // 结论*
    @TableField("sp_s_71")
    private String spS71;

    // 执行标准/技术文件*
    @TableField("sp_s_72")
    private String spS72;

    // 质量等级*
    @TableField("sp_s_73")
    private String spS73;

    // 商标*
    @TableField("sp_s_74")
    private String spS74;

    // 生产企业联系人*
    @TableField("sp_s_75")
    private String spS75;

    // 生产企业电话*
    @TableField("sp_s_76")
    private String spS76;

    //
    @TableField("sp_s_77")
    private String spS77;

    //
    @TableField("sp_s_78")
    private String spS78;

    //
    @TableField("sp_s_79")
    private String spS79;

    //
    @TableField("sp_s_80")
    private String spS80;

    //
    @TableField("sp_s_81")
    private String spS81;

    //
    @TableField("sp_s_82")
    private String spS82;

    //
    @TableField("sp_s_83")
    private String spS83;

    // 检验报告备注
    @TableField("sp_s_84")
    private String spS84;

    // 填报人(检验机构)*
    @TableField("sp_s_85")
    private String spS85;

    // 填报日期*
    @TableField("sp_d_86")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String spD86;

    // 电话(检验机构填报人)*
    @TableField("sp_s_87")
    private String spS87;

    // 电子邮箱(检验机构填报人)*
    @TableField("sp_s_88")
    private String spS88;

    //
    @TableField("tname")
    private String tname;

    //
    @TableField("submit_d_flag")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String submitDFlag;

    //
    @TableField("sp_n_jcxcount")
    private BigDecimal spNJcxcount;

    // 传真
    @TableField("sp_s_bsfl")
    private String spSBsfl;

    // 任务来源*
    @TableField("sp_s_2_1")
    private String spS21;

    //
    @TableField("sp_i_state")
    private Integer spIState;

    //
    @TableField("sp_i_jgback")
    private Integer spIJgback;

    //
    @TableField("sp_s_reason")
    private String spSReason;

    //
    @TableField("sp_i_backtimes")
    private Integer spIBacktimes;

    // 区域类型*
    @TableField("sp_s_201")
    private String spS201;

    // 省(生产企业)*
    @TableField("sp_s_202")
    private String spS202;

    // 样品属性
    @TableField("sp_s_203")
    private String spS203;

    // 单价*
    @TableField("sp_s_204")
    private String spS204;

    // 是否出口*
    @TableField("sp_s_205")
    private String spS205;

    // 抽样基数/批量*
    @TableField("sp_s_206")
    private String spS206;

    //
    @TableField("sp_s_207")
    private String spS207;

    // 备样数量*
    @TableField("sp_s_208")
    private String spS208;

    //
    @TableField("sp_s_209")
    private String spS209;

    //
    @TableField("sp_s_210")
    private String spS210;

    // 单位地址（抽样单位）
    @TableField("sp_s_211")
    private String spS211;

    // 邮编（抽样单位）
    @TableField("sp_s_212")
    private String spS212;

    // 传真（抽样单位）
    @TableField("sp_s_213")
    private String spS213;

    // 确认情况
    @TableField("sp_s_214")
    private String spS214;

    // 社会信用代码/营业执照号
    @TableField("sp_s_215")
    private String spS215;

    //
    @TableField("sp_t_procedure")
    private String spTProcedure;

    //
    @TableField("fail_report_path")
    private String failReportPath;

    //
    @TableField("is_yydj")
    private Boolean isYydj;

    //
    @TableField("current_yycz_step")
    private Integer currentYyczStep;

    // 报告分类*
    @TableField("bgfl")
    private String bgfl;

    // 许可证-类型*
    @TableField("sp_xkz")
    private String spXkz;

    // 许可证-内容*
    @TableField("sp_xkz_id")
    private String spXkzId;

    //
    @TableField("fail_report_at")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String failReportAt;

    //
    @TableField("czb_reverted_flag")
    private Boolean czbRevertedFlag;

    //
    @TableField("synced")
    private Boolean synced;

    //
    @TableField("gbsj")
    private String gbsj;

    //
    @TableField("via_api")
    private Boolean viaApi;

    //
    @TableField("application_id")
    private Integer applicationId;

    //
    @TableField("report_path")
    private String reportPath;

    //
    @TableField("cyd_file_path")
    private String cydFilePath;

    //
    @TableField("cyjygzs_file_path")
    private String cyjygzsFilePath;

    //
    @TableField("yydj_enabled_by_admin_at")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String yydjEnabledByAdminAt;


    @TableField("synced_at")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String syncedAt;

    //
    @TableField("czb_reverted_reason")
    private String czbRevertedReason;

    // 市(生产企业)
    @TableField("sp_s_220")
    private String spS220;

    // 县(生产企业)
    @TableField("sp_s_221")
    private String spS221;

    // 条形码
    @TableField("sp_s_222")
    private String spS222;

    //
    @TableField("user_id")
    private Integer userId;

    //
    @TableField("uid")
    private String uid;

    //
    @TableField("sp_s_37_user_id")
    private Integer spS37UserId;

    //
    @TableField("deleted_at")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String deletedAt;

    @TableField("sp_s_sfjk")
    private String spSsfjk;

    // 原产国
    @TableField("sp_s_ycg")
    private String spSycg;
    // 是否委托生产
    @TableField("sp_s_sfwtsc")
    private String sp_s_sfwtsc;
    // 委托企业详细地址
    @TableField("sp_s_qydz")
    private String sp_s_qydz;
    // 委托企业名称
    @TableField("sp_s_qymc")
    private String sp_s_qymc;
    // 委托生产许可证编号
    @TableField("sp_s_qs")
    private String sp_s_qs;
    // 委托联系人
    @TableField("sp_s_lxr")
    private String sp_s_lxr;
    // 委托电话
    @TableField("sp_s_tel")
    private String sp_s_tel;
    // 风险监测报告备注
    @TableField("sp_s_89")
    private String sp_s_89;
    // 检验结论
    @TableField("inspection_basis")
    private String inspection_basis;

    // 检验依据
    @TableField("decision_basis")
    private String decision_basis;
    // 风险报告检验依据
    @TableField("FX_jyyj_custom")
    private String FX_jyyj_custom;

    // 状态  1 表示国家二级站导入数据;2 表示通过前段页面手动添加数据
    @TableField("state")
    private String state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpS1() {
        return spS1;
    }

    public void setSpS1(String spS1) {
        this.spS1 = spS1;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getSpS2() {
        return spS2;
    }

    public void setSpS2(String spS2) {
        this.spS2 = spS2;
    }

    public String getSpS3() {
        return spS3;
    }

    public void setSpS3(String spS3) {
        this.spS3 = spS3;
    }

    public String getSpS4() {
        return spS4;
    }

    public void setSpS4(String spS4) {
        this.spS4 = spS4;
    }

    public String getSpS5() {
        return spS5;
    }

    public void setSpS5(String spS5) {
        this.spS5 = spS5;
    }

    public String getSpS6() {
        return spS6;
    }

    public void setSpS6(String spS6) {
        this.spS6 = spS6;
    }

    public String getSpS7() {
        return spS7;
    }

    public void setSpS7(String spS7) {
        this.spS7 = spS7;
    }

    public String getSpS8() {
        return spS8;
    }

    public void setSpS8(String spS8) {
        this.spS8 = spS8;
    }

    public String getSpS9() {
        return spS9;
    }

    public void setSpS9(String spS9) {
        this.spS9 = spS9;
    }

    public String getSpS10() {
        return spS10;
    }

    public void setSpS10(String spS10) {
        this.spS10 = spS10;
    }

    public String getSpS11() {
        return spS11;
    }

    public void setSpS11(String spS11) {
        this.spS11 = spS11;
    }

    public String getSpS12() {
        return spS12;
    }

    public void setSpS12(String spS12) {
        this.spS12 = spS12;
    }

    public String getSpS13() {
        return spS13;
    }

    public void setSpS13(String spS13) {
        this.spS13 = spS13;
    }

    public String getSpS14() {
        return spS14;
    }

    public void setSpS14(String spS14) {
        this.spS14 = spS14;
    }

    public float getSpN15() {
        return spN15;
    }

    public void setSpN15(float spN15) {
        this.spN15 = spN15;
    }

    public String getSpS16() {
        return spS16;
    }

    public void setSpS16(String spS16) {
        this.spS16 = spS16;
    }

    public String getSpS17() {
        return spS17;
    }

    public void setSpS17(String spS17) {
        this.spS17 = spS17;
    }

    public String getSpS18() {
        return spS18;
    }

    public void setSpS18(String spS18) {
        this.spS18 = spS18;
    }

    public String getSpS19() {
        return spS19;
    }

    public void setSpS19(String spS19) {
        this.spS19 = spS19;
    }

    public String getSpS20() {
        return spS20;
    }

    public void setSpS20(String spS20) {
        this.spS20 = spS20;
    }

    public String getSpS_21() {
        return spS_21;
    }

    public void setSpS_21(String spS_21) {
        this.spS_21 = spS_21;
    }

    public String getSpD22() {
        return spD22;
    }

    public void setSpD22(String spD22) {
        this.spD22 = spD22;
    }

    public String getSpS23() {
        return spS23;
    }

    public void setSpS23(String spS23) {
        this.spS23 = spS23;
    }

    public String getSpS24() {
        return spS24;
    }

    public void setSpS24(String spS24) {
        this.spS24 = spS24;
    }

    public String getSpS25() {
        return spS25;
    }

    public void setSpS25(String spS25) {
        this.spS25 = spS25;
    }

    public String getSpS26() {
        return spS26;
    }

    public void setSpS26(String spS26) {
        this.spS26 = spS26;
    }

    public String getSpS27() {
        return spS27;
    }

    public void setSpS27(String spS27) {
        this.spS27 = spS27;
    }

    public String getSpD28() {
        return spD28;
    }

    public void setSpD28(String spD28) {
        this.spD28 = spD28;
    }

    public String getSpN29() {
        return spN29;
    }

    public void setSpN29(String spN29) {
        this.spN29 = spN29;
    }

    public String getSpS30() {
        return spS30;
    }

    public void setSpS30(String spS30) {
        this.spS30 = spS30;
    }

    public BigDecimal getSpN31() {
        return spN31;
    }

    public void setSpN31(BigDecimal spN31) {
        this.spN31 = spN31;
    }

    public BigDecimal getSpN32() {
        return spN32;
    }

    public void setSpN32(BigDecimal spN32) {
        this.spN32 = spN32;
    }

    public String getSpS33() {
        return spS33;
    }

    public void setSpS33(String spS33) {
        this.spS33 = spS33;
    }

    public String getSpS34() {
        return spS34;
    }

    public void setSpS34(String spS34) {
        this.spS34 = spS34;
    }

    public String getSpS35() {
        return spS35;
    }

    public void setSpS35(String spS35) {
        this.spS35 = spS35;
    }

    public String getSpS36() {
        return spS36;
    }

    public void setSpS36(String spS36) {
        this.spS36 = spS36;
    }

    public String getSpS37() {
        return spS37;
    }

    public void setSpS37(String spS37) {
        this.spS37 = spS37;
    }

    public String getSpD38() {
        return spD38;
    }

    public void setSpD38(String spD38) {
        this.spD38 = spD38;
    }

    public String getSpS39() {
        return spS39;
    }

    public void setSpS39(String spS39) {
        this.spS39 = spS39;
    }

    public String getSpS40() {
        return spS40;
    }

    public void setSpS40(String spS40) {
        this.spS40 = spS40;
    }

    public String getSpS41() {
        return spS41;
    }

    public void setSpS41(String spS41) {
        this.spS41 = spS41;
    }

    public String getSpS42() {
        return spS42;
    }

    public void setSpS42(String spS42) {
        this.spS42 = spS42;
    }

    public String getSpS43() {
        return spS43;
    }

    public void setSpS43(String spS43) {
        this.spS43 = spS43;
    }

    public String getSpS44() {
        return spS44;
    }

    public void setSpS44(String spS44) {
        this.spS44 = spS44;
    }

    public String getSpS45() {
        return spS45;
    }

    public void setSpS45(String spS45) {
        this.spS45 = spS45;
    }

    public String getSpD46() {
        return spD46;
    }

    public void setSpD46(String spD46) {
        this.spD46 = spD46;
    }

    public String getSpD47() {
        return spD47;
    }

    public void setSpD47(String spD47) {
        this.spD47 = spD47;
    }

    public String getSpS48() {
        return spS48;
    }

    public void setSpS48(String spS48) {
        this.spS48 = spS48;
    }

    public String getSpS49() {
        return spS49;
    }

    public void setSpS49(String spS49) {
        this.spS49 = spS49;
    }

    public String getSpS50() {
        return spS50;
    }

    public void setSpS50(String spS50) {
        this.spS50 = spS50;
    }

    public String getSpS51() {
        return spS51;
    }

    public void setSpS51(String spS51) {
        this.spS51 = spS51;
    }

    public String getSpS52() {
        return spS52;
    }

    public void setSpS52(String spS52) {
        this.spS52 = spS52;
    }

    public String getSpS53() {
        return spS53;
    }

    public void setSpS53(String spS53) {
        this.spS53 = spS53;
    }

    public String getSpS54() {
        return spS54;
    }

    public void setSpS54(String spS54) {
        this.spS54 = spS54;
    }

    public String getSpS55() {
        return spS55;
    }

    public void setSpS55(String spS55) {
        this.spS55 = spS55;
    }

    public String getSpS56() {
        return spS56;
    }

    public void setSpS56(String spS56) {
        this.spS56 = spS56;
    }

    public String getSpS57() {
        return spS57;
    }

    public void setSpS57(String spS57) {
        this.spS57 = spS57;
    }

    public String getSpS58() {
        return spS58;
    }

    public void setSpS58(String spS58) {
        this.spS58 = spS58;
    }

    public String getSpS59() {
        return spS59;
    }

    public void setSpS59(String spS59) {
        this.spS59 = spS59;
    }

    public String getSpS60() {
        return spS60;
    }

    public void setSpS60(String spS60) {
        this.spS60 = spS60;
    }

    public String getSpS61() {
        return spS61;
    }

    public void setSpS61(String spS61) {
        this.spS61 = spS61;
    }

    public String getSpS62() {
        return spS62;
    }

    public void setSpS62(String spS62) {
        this.spS62 = spS62;
    }

    public String getSpS63() {
        return spS63;
    }

    public void setSpS63(String spS63) {
        this.spS63 = spS63;
    }

    public String getSpS64() {
        return spS64;
    }

    public void setSpS64(String spS64) {
        this.spS64 = spS64;
    }

    public String getSpS65() {
        return spS65;
    }

    public void setSpS65(String spS65) {
        this.spS65 = spS65;
    }

    public String getSpS66() {
        return spS66;
    }

    public void setSpS66(String spS66) {
        this.spS66 = spS66;
    }

    public String getSpS67() {
        return spS67;
    }

    public void setSpS67(String spS67) {
        this.spS67 = spS67;
    }

    public String getSpS68() {
        return spS68;
    }

    public void setSpS68(String spS68) {
        this.spS68 = spS68;
    }

    public String getSpS69() {
        return spS69;
    }

    public void setSpS69(String spS69) {
        this.spS69 = spS69;
    }

    public String getSpS70() {
        return spS70;
    }

    public void setSpS70(String spS70) {
        this.spS70 = spS70;
    }

    public String getSpS71() {
        return spS71;
    }

    public void setSpS71(String spS71) {
        this.spS71 = spS71;
    }

    public String getSpS72() {
        return spS72;
    }

    public void setSpS72(String spS72) {
        this.spS72 = spS72;
    }

    public String getSpS73() {
        return spS73;
    }

    public void setSpS73(String spS73) {
        this.spS73 = spS73;
    }

    public String getSpS74() {
        return spS74;
    }

    public void setSpS74(String spS74) {
        this.spS74 = spS74;
    }

    public String getSpS75() {
        return spS75;
    }

    public void setSpS75(String spS75) {
        this.spS75 = spS75;
    }

    public String getSpS76() {
        return spS76;
    }

    public void setSpS76(String spS76) {
        this.spS76 = spS76;
    }

    public String getSpS77() {
        return spS77;
    }

    public void setSpS77(String spS77) {
        this.spS77 = spS77;
    }

    public String getSpS78() {
        return spS78;
    }

    public void setSpS78(String spS78) {
        this.spS78 = spS78;
    }

    public String getSpS79() {
        return spS79;
    }

    public void setSpS79(String spS79) {
        this.spS79 = spS79;
    }

    public String getSpS80() {
        return spS80;
    }

    public void setSpS80(String spS80) {
        this.spS80 = spS80;
    }

    public String getSpS81() {
        return spS81;
    }

    public void setSpS81(String spS81) {
        this.spS81 = spS81;
    }

    public String getSpS82() {
        return spS82;
    }

    public void setSpS82(String spS82) {
        this.spS82 = spS82;
    }

    public String getSpS83() {
        return spS83;
    }

    public void setSpS83(String spS83) {
        this.spS83 = spS83;
    }

    public String getSpS84() {
        return spS84;
    }

    public void setSpS84(String spS84) {
        this.spS84 = spS84;
    }

    public String getSpS85() {
        return spS85;
    }

    public void setSpS85(String spS85) {
        this.spS85 = spS85;
    }

    public String getSpD86() {
        return spD86;
    }

    public void setSpD86(String spD86) {
        this.spD86 = spD86;
    }

    public String getSpS87() {
        return spS87;
    }

    public void setSpS87(String spS87) {
        this.spS87 = spS87;
    }

    public String getSpS88() {
        return spS88;
    }

    public void setSpS88(String spS88) {
        this.spS88 = spS88;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getSubmitDFlag() {
        return submitDFlag;
    }

    public void setSubmitDFlag(String submitDFlag) {
        this.submitDFlag = submitDFlag;
    }

    public BigDecimal getSpNJcxcount() {
        return spNJcxcount;
    }

    public void setSpNJcxcount(BigDecimal spNJcxcount) {
        this.spNJcxcount = spNJcxcount;
    }

    public String getSpSBsfl() {
        return spSBsfl;
    }

    public void setSpSBsfl(String spSBsfl) {
        this.spSBsfl = spSBsfl;
    }

    public String getSpS21() {
        return spS21;
    }

    public void setSpS21(String spS21) {
        this.spS21 = spS21;
    }

    public Integer getSpIState() {
        return spIState;
    }

    public void setSpIState(Integer spIState) {
        this.spIState = spIState;
    }

    public Integer getSpIJgback() {
        return spIJgback;
    }

    public void setSpIJgback(Integer spIJgback) {
        this.spIJgback = spIJgback;
    }

    public String getSpSReason() {
        return spSReason;
    }

    public void setSpSReason(String spSReason) {
        this.spSReason = spSReason;
    }

    public Integer getSpIBacktimes() {
        return spIBacktimes;
    }

    public void setSpIBacktimes(Integer spIBacktimes) {
        this.spIBacktimes = spIBacktimes;
    }

    public String getSpS201() {
        return spS201;
    }

    public void setSpS201(String spS201) {
        this.spS201 = spS201;
    }

    public String getSpS202() {
        return spS202;
    }

    public void setSpS202(String spS202) {
        this.spS202 = spS202;
    }

    public String getSpS203() {
        return spS203;
    }

    public void setSpS203(String spS203) {
        this.spS203 = spS203;
    }

    public String getSpS204() {
        return spS204;
    }

    public void setSpS204(String spS204) {
        this.spS204 = spS204;
    }

    public String getSpS205() {
        return spS205;
    }

    public void setSpS205(String spS205) {
        this.spS205 = spS205;
    }

    public String getSpS206() {
        return spS206;
    }

    public void setSpS206(String spS206) {
        this.spS206 = spS206;
    }

    public String getSpS207() {
        return spS207;
    }

    public void setSpS207(String spS207) {
        this.spS207 = spS207;
    }

    public String getSpS208() {
        return spS208;
    }

    public void setSpS208(String spS208) {
        this.spS208 = spS208;
    }

    public String getSpS209() {
        return spS209;
    }

    public void setSpS209(String spS209) {
        this.spS209 = spS209;
    }

    public String getSpS210() {
        return spS210;
    }

    public void setSpS210(String spS210) {
        this.spS210 = spS210;
    }

    public String getSpS211() {
        return spS211;
    }

    public void setSpS211(String spS211) {
        this.spS211 = spS211;
    }

    public String getSpS212() {
        return spS212;
    }

    public void setSpS212(String spS212) {
        this.spS212 = spS212;
    }

    public String getSpS213() {
        return spS213;
    }

    public void setSpS213(String spS213) {
        this.spS213 = spS213;
    }

    public String getSpS214() {
        return spS214;
    }

    public void setSpS214(String spS214) {
        this.spS214 = spS214;
    }

    public String getSpS215() {
        return spS215;
    }

    public void setSpS215(String spS215) {
        this.spS215 = spS215;
    }

    public String getSpTProcedure() {
        return spTProcedure;
    }

    public void setSpTProcedure(String spTProcedure) {
        this.spTProcedure = spTProcedure;
    }

    public String getFailReportPath() {
        return failReportPath;
    }

    public void setFailReportPath(String failReportPath) {
        this.failReportPath = failReportPath;
    }

    public Boolean getYydj() {
        return isYydj;
    }

    public void setYydj(Boolean yydj) {
        isYydj = yydj;
    }

    public Integer getCurrentYyczStep() {
        return currentYyczStep;
    }

    public void setCurrentYyczStep(Integer currentYyczStep) {
        this.currentYyczStep = currentYyczStep;
    }

    public String getBgfl() {
        return bgfl;
    }

    public void setBgfl(String bgfl) {
        this.bgfl = bgfl;
    }

    public String getSpXkz() {
        return spXkz;
    }

    public void setSpXkz(String spXkz) {
        this.spXkz = spXkz;
    }

    public String getSpXkzId() {
        return spXkzId;
    }

    public void setSpXkzId(String spXkzId) {
        this.spXkzId = spXkzId;
    }

    public String getFailReportAt() {
        return failReportAt;
    }

    public void setFailReportAt(String failReportAt) {
        this.failReportAt = failReportAt;
    }

    public Boolean getCzbRevertedFlag() {
        return czbRevertedFlag;
    }

    public void setCzbRevertedFlag(Boolean czbRevertedFlag) {
        this.czbRevertedFlag = czbRevertedFlag;
    }

    public Boolean getSynced() {
        return synced;
    }

    public void setSynced(Boolean synced) {
        this.synced = synced;
    }

    public String getGbsj() {
        return gbsj;
    }

    public void setGbsj(String gbsj) {
        this.gbsj = gbsj;
    }

    public Boolean getViaApi() {
        return viaApi;
    }

    public void setViaApi(Boolean viaApi) {
        this.viaApi = viaApi;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public String getReportPath() {
        return reportPath;
    }

    public void setReportPath(String reportPath) {
        this.reportPath = reportPath;
    }

    public String getCydFilePath() {
        return cydFilePath;
    }

    public void setCydFilePath(String cydFilePath) {
        this.cydFilePath = cydFilePath;
    }

    public String getCyjygzsFilePath() {
        return cyjygzsFilePath;
    }

    public void setCyjygzsFilePath(String cyjygzsFilePath) {
        this.cyjygzsFilePath = cyjygzsFilePath;
    }

    public String getYydjEnabledByAdminAt() {
        return yydjEnabledByAdminAt;
    }

    public void setYydjEnabledByAdminAt(String yydjEnabledByAdminAt) {
        this.yydjEnabledByAdminAt = yydjEnabledByAdminAt;
    }

    public String getSyncedAt() {
        return syncedAt;
    }

    public void setSyncedAt(String syncedAt) {
        this.syncedAt = syncedAt;
    }

    public String getCzbRevertedReason() {
        return czbRevertedReason;
    }

    public void setCzbRevertedReason(String czbRevertedReason) {
        this.czbRevertedReason = czbRevertedReason;
    }

    public String getSpS220() {
        return spS220;
    }

    public void setSpS220(String spS220) {
        this.spS220 = spS220;
    }

    public String getSpS221() {
        return spS221;
    }

    public void setSpS221(String spS221) {
        this.spS221 = spS221;
    }

    public String getSpS222() {
        return spS222;
    }

    public void setSpS222(String spS222) {
        this.spS222 = spS222;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getSpS37UserId() {
        return spS37UserId;
    }

    public void setSpS37UserId(Integer spS37UserId) {
        this.spS37UserId = spS37UserId;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getSpSsfjk() {
        return spSsfjk;
    }

    public void setSpSsfjk(String spSsfjk) {
        this.spSsfjk = spSsfjk;
    }

    public String getSpSycg() {
        return spSycg;
    }

    public void setSpSycg(String spSycg) {
        this.spSycg = spSycg;
    }

    public String getSp_s_sfwtsc() {
        return sp_s_sfwtsc;
    }

    public void setSp_s_sfwtsc(String sp_s_sfwtsc) {
        this.sp_s_sfwtsc = sp_s_sfwtsc;
    }

    public String getSp_s_qydz() {
        return sp_s_qydz;
    }

    public void setSp_s_qydz(String sp_s_qydz) {
        this.sp_s_qydz = sp_s_qydz;
    }

    public String getSp_s_qymc() {
        return sp_s_qymc;
    }

    public void setSp_s_qymc(String sp_s_qymc) {
        this.sp_s_qymc = sp_s_qymc;
    }

    public String getSp_s_qs() {
        return sp_s_qs;
    }

    public void setSp_s_qs(String sp_s_qs) {
        this.sp_s_qs = sp_s_qs;
    }

    public String getSp_s_lxr() {
        return sp_s_lxr;
    }

    public void setSp_s_lxr(String sp_s_lxr) {
        this.sp_s_lxr = sp_s_lxr;
    }

    public String getSp_s_tel() {
        return sp_s_tel;
    }

    public void setSp_s_tel(String sp_s_tel) {
        this.sp_s_tel = sp_s_tel;
    }

    public String getSp_s_89() {
        return sp_s_89;
    }

    public void setSp_s_89(String sp_s_89) {
        this.sp_s_89 = sp_s_89;
    }

    public String getInspection_basis() {
        return inspection_basis;
    }

    public void setInspection_basis(String inspection_basis) {
        this.inspection_basis = inspection_basis;
    }

    public String getDecision_basis() {
        return decision_basis;
    }

    public void setDecision_basis(String decision_basis) {
        this.decision_basis = decision_basis;
    }

    public String getFX_jyyj_custom() {
        return FX_jyyj_custom;
    }

    public void setFX_jyyj_custom(String FX_jyyj_custom) {
        this.FX_jyyj_custom = FX_jyyj_custom;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
