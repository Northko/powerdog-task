package fsnip.powerdog.task.modules.smart2fsnip.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import fsnip.powerdog.task.base.StatusModel;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 培训考试成绩
 * @Author: kun.tan
 * @DateTime: 2018-06-22 17:01
 */
@TableName("smart_staff_exam")
public class TrainingAchievement extends StatusModel {

    /**
     * 主键
     */
    @TableId("id")
    private String uuid;
    /**
     * 创建时间
     */
    @TableField("create_date")
    private Date createDate;
    /**
     * 手机号
     */
    @TableField("user_phone")
    private String userPhone;
    /**
     * 姓名
     */
    @TableField("user_name")
    private String userName;
    /**
     * 身份证号码
     */
    @TableField("id_num")
    private String idNum;
    /**
     * 企业ID
     */
    @TableField("company_id")
    private String companyId;
    /**
     * 企业名称
     */
    @TableField("company_name")
    private String companyName;
    /**
     * 试卷类型
     * 食品管理试卷一: 2;
     * 食品管理试卷二: 3;
     * 食品管理试卷三: 4;
     * 食品管理试卷四: 5;
     * 食品管理试卷五: 6;
     * 餐饮管理试卷一: 7;
     * 餐饮管理试卷二: 8;
     * 餐饮管理试卷三: 9;
     * 餐饮管理试卷四: 10;
     * 餐饮管理试卷五: 11
     */
    @TableField("paper_type")
    private String paperType;
    /**
     * 提交答案
     */
    @TableField("commit_answer")
    private String commitAnswer;
    /**
     * 得分
     */
    @TableField("score")
    private String score;
    /**
     * 员工类型：1 负责人，2 员工。
     */
    @TableField("type")
    private String type;
    /**
     * 健康证号
     */
    @TableField("health_card")
    private String healthCard;
    /**
     * 知识培训合格证书
     */
    @TableField("certificate_doc")
    private String certificateDoc;
    /**
     * 是否合格
     */
    @TableField("is_qualified")
    private String result;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public String getCommitAnswer() {
        return commitAnswer;
    }

    public void setCommitAnswer(String commitAnswer) {
        this.commitAnswer = commitAnswer;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHealthCard() {
        return healthCard;
    }

    public void setHealthCard(String healthCard) {
        this.healthCard = healthCard;
    }

    public String getCertificateDoc() {
        return certificateDoc;
    }

    public void setCertificateDoc(String certificateDoc) {
        this.certificateDoc = certificateDoc;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

