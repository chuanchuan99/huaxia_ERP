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
* 消息表
* @TableName jsh_msg* kjc
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Msg implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 消息标题
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("消息标题")
    @Length(max= 100,message="编码长度不能超过100")
    private String msgTitle;
    /**
    * 消息内容
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("消息内容")
    @Length(max= 500,message="编码长度不能超过500")
    private String msgContent;
    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private Date createTime;
    /**
    * 消息类型
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("消息类型")
    @Length(max= 20,message="编码长度不能超过20")
    private String type;
    /**
    * 接收人id
    */
    @ApiModelProperty("接收人id")
    private Long userId;
    /**
    * 状态，1未读 2已读
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("状态，1未读 2已读")
    @Length(max= 1,message="编码长度不能超过1")
    private String status;
    /**
    * 租户id
    */
    @ApiModelProperty("租户id")
    private Long tenantId;
    /**
    * 删除标记，0未删除，1删除
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("删除标记，0未删除，1删除")
    @Length(max= 1,message="编码长度不能超过1")
    private String deleteFlag;


}
