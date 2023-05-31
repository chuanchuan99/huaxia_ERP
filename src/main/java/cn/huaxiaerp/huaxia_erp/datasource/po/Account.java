package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.math.BigDecimal;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

/**
* 账户信息
* @TableName jsh_account
* kjc
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 名称
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("名称")
    @Length(max= 50,message="编码长度不能超过50")
    private String name;
    /**
    * 编号
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("编号")
    @Length(max= 50,message="编码长度不能超过50")
    private String serialNo;
    /**
    * 期初金额
    */
    @ApiModelProperty("期初金额")
    private BigDecimal initialAmount;
    /**
    * 当前余额
    */
    @ApiModelProperty("当前余额")
    private BigDecimal currentAmount;
    /**
    * 备注
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("备注")
    @Length(max= 100,message="编码长度不能超过100")
    private String remark;
    /**
    * 启用
    */
    @ApiModelProperty("启用")
    private Boolean enabled;
    /**
    * 排序
    */
    @Size(max= 10,message="编码长度不能超过10")
    @ApiModelProperty("排序")
    @Length(max= 10,message="编码长度不能超过10")
    private String sort;
    /**
    * 是否默认
    */
    @ApiModelProperty("是否默认")
    private Boolean isDefault;
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
