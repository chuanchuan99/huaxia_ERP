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
* 操作日志
* @TableName jsh_log* kjc
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Log implements Serializable {

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
    private Long userId;
    /**
    * 操作模块名称
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("操作模块名称")
    @Length(max= 500,message="编码长度不能超过500")
    private String operation;
    /**
    * 客户端IP
    */
    @Size(max= 200,message="编码长度不能超过200")
    @ApiModelProperty("客户端IP")
    @Length(max= 200,message="编码长度不能超过200")
    private String clientIp;
    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private Date createTime;
    /**
    * 操作状态 0==成功，1==失败
    */
    @ApiModelProperty("操作状态 0==成功，1==失败")
    private Integer status;
    /**
    * 详情
    */
    @Size(max= 5000,message="编码长度不能超过5000")
    @ApiModelProperty("详情")
    @Length(max= 5000,message="编码长度不能超过5,000")
    private String content;
    /**
    * 租户id
    */
    @ApiModelProperty("租户id")
    private Long tenantId;


}
