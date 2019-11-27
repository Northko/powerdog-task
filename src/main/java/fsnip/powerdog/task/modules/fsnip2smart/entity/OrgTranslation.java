package fsnip.powerdog.task.modules.fsnip2smart.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * Created with IntelliJ IDEA.
 *
 * @description: 组织机构编码转换
 * @author: kun.tan
 * @dateTime: 2018-11-20 11:11
 */
@TableName("fsnip_org_translation")
public class OrgTranslation {

    @TableId("uuid")
    private String uuid;

    @TableField("org_name")
    private String orgName;

    @TableField("common_code")
    private String commonCode;

    @TableField("fsnip_code")
    private String fsnipCode;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getCommonCode() {
        return commonCode;
    }

    public void setCommonCode(String commonCode) {
        this.commonCode = commonCode;
    }

    public String getFsnipCode() {
        return fsnipCode;
    }

    public void setFsnipCode(String fsnipCode) {
        this.fsnipCode = fsnipCode;
    }
}
