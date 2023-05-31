package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

/**
* 财务主表
* @TableName jsh_account_head
 * * kjc
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountHead implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 类型(支出/收入/收款/付款/转账)
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("类型(支出/收入/收款/付款/转账)")
    @Length(max= 50,message="编码长度不能超过50")
    private String type;
    /**
    * 单位Id(收款/付款单位)
    */
    @ApiModelProperty("单位Id(收款/付款单位)")
    private Long organId;
    /**
    * 经手人id
    */
    @ApiModelProperty("经手人id")
    private Long handsPersonId;
    /**
    * 操作员
    */
    @ApiModelProperty("操作员")
    private Long creator;
    /**
    * 变动金额(优惠/收款/付款/实付)
    */
    @ApiModelProperty("变动金额(优惠/收款/付款/实付)")
    private BigDecimal changeAmount;
    /**
    * 优惠金额
    */
    @ApiModelProperty("优惠金额")
    private BigDecimal discountMoney;
    /**
    * 合计金额
    */
    @ApiModelProperty("合计金额")
    private BigDecimal totalPrice;
    /**
    * 账户(收款/付款)
    */
    @ApiModelProperty("账户(收款/付款)")
    private Long accountId;
    /**
    * 单据编号
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("单据编号")
    @Length(max= 50,message="编码长度不能超过50")
    private String billNo;
    /**
    * 单据日期
    */
    @ApiModelProperty("单据日期")
    private Date billTime;
    /**
    * 备注
    */
    @Size(max= 1000,message="编码长度不能超过1000")
    @ApiModelProperty("备注")
    @Length(max= 1000,message="编码长度不能超过1,000")
    private String remark;
    /**
    * 附件名称
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("附件名称")
    @Length(max= 500,message="编码长度不能超过500")
    private String fileName;
    /**
    * 状态，0未审核、1已审核、9审核中
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("状态，0未审核、1已审核、9审核中")
    @Length(max= 1,message="编码长度不能超过1")
    private String status;
    /**
    * 单据来源，0-pc，1-手机
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("单据来源，0-pc，1-手机")
    @Length(max= 1,message="编码长度不能超过1")
    private String source;
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
