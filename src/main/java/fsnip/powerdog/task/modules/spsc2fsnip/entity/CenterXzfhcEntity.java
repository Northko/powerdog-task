package fsnip.powerdog.task.modules.spsc2fsnip.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * Create by chenxiaolin on 2018/7/13 14:35
 * @Desc 小作坊核查
 */
@TableName("fsnip_sc_workshopresult")
public class CenterXzfhcEntity {

    /**
     *
     */
    @TableId(value = "id")
    private String id;

    /**
     * 小作坊ID
     */
    @TableField("xzfid")
    private Long xzfid;

    /**
     *
     */
    @TableField("checkorgcode")
    private String checkOrgCode;

    /**
     *
     */
    @TableField("checkorgname")
    private String checkOrgName;

    /**
     *
     */
    @TableField("checked")
    private String check;

    /**
     *
     */
    @TableField("signature")
    private String signature;

    /**
     * 1 合格 2不合格
     */
    @TableField("isPassed")
    private String isPassed;

    @TableField("syn_status")
    private String synState;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getXzfid() {
        return xzfid;
    }

    public void setXzfid(Long xzfid) {
        this.xzfid = xzfid;
    }

    public String getCheckOrgCode() {
        return checkOrgCode;
    }

    public void setCheckOrgCode(String checkOrgCode) {
        this.checkOrgCode = checkOrgCode;
    }

    public String getCheckOrgName() {
        return checkOrgName;
    }

    public void setCheckOrgName(String checkOrgName) {
        this.checkOrgName = checkOrgName;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getIsPassed() {
        return isPassed;
    }

    public void setIsPassed(String isPassed) {
        this.isPassed = isPassed;
    }

    public String getSynState() {
        return synState;
    }

    public void setSynState(String synState) {
        this.synState = synState;
    }
}
