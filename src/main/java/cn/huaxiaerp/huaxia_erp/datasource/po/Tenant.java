package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

/**
* 租户
* @TableName jsh_tenant* kjc
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tenant implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 用户id
    */
    @ApiModelProperty("用户id")
    private Long tenantId;
    /**
    * 登录名
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("登录名")
    @Length(max= 255,message="编码长度不能超过255")
    private String loginName;
    /**
    * 用户数量限制
    */
    @ApiModelProperty("用户数量限制")
    private Integer userNumLimit;
    /**
    * 租户类型，0免费租户，1付费租户
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("租户类型，0免费租户，1付费租户")
    @Length(max= 1,message="编码长度不能超过1")
    private String type;
    /**
    * 启用 0-禁用  1-启用
    */
    @ApiModelProperty("启用 0-禁用  1-启用")
    private Boolean enabled;
    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private Date createTime;
    /**
    * 到期时间
    */
    @ApiModelProperty("到期时间")
    private Date expireTime;
    /**
    * 备注
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("备注")
    @Length(max= 500,message="编码长度不能超过500")
    private String remark;



}
