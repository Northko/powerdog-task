package fsnip.powerdog.task.modules.smart2fsnip.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import fsnip.powerdog.task.base.StatusModel;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:小作坊检查信息 (中间库)
 * @User: QMQ
 * @DateTime: 2018-07-13 13:05
 */
@TableName("fsnip_sc_zfxchc")
public class ScZfxchc extends StatusModel {
    /*@TableId("id")
    private String id;*/

    @TableId("xzfid")
    private String xzfid;

    @TableField("checkOrgCode")
    private String checkOrgCode;

    @TableField("checkOrgName")
    private String checkOrgName;

    @TableField("check")
    private String check;

    @TableField("signature")
    private String signature;

    @TableField("isPassed")
    private String isPassed;


    public String getXzfid() {
        return xzfid;
    }

    public void setXzfid(String xzfid) {
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


}
