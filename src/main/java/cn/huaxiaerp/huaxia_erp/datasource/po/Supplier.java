package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.NotBlank;
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
* 供应商/客户信息表
* @TableName jsh_supplier* kjc
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supplier implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 供应商名称
    */
    @NotBlank(message="[供应商名称]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("供应商名称")
    @Length(max= 255,message="编码长度不能超过255")
    private String supplier;
    /**
    * 联系人
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("联系人")
    @Length(max= 100,message="编码长度不能超过100")
    private String contacts;
    /**
    * 联系电话
    */
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("联系电话")
    @Length(max= 30,message="编码长度不能超过30")
    private String phoneNum;
    /**
    * 电子邮箱
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("电子邮箱")
    @Length(max= 50,message="编码长度不能超过50")
    private String email;
    /**
    * 备注
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("备注")
    @Length(max= 500,message="编码长度不能超过500")
    private String description;
    /**
    * 是否系统自带 0==系统 1==非系统
    */
    @ApiModelProperty("是否系统自带 0==系统 1==非系统")
    private Integer isystem;
    /**
    * 类型
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("类型")
    @Length(max= 20,message="编码长度不能超过20")
    private String type;
    /**
    * 启用
    */
    @ApiModelProperty("启用")
    private Boolean enabled;
    /**
    * 预收款
    */
    @ApiModelProperty("预收款")
    private BigDecimal advanceIn;
    /**
    * 期初应收
    */
    @ApiModelProperty("期初应收")
    private BigDecimal beginNeedGet;
    /**
    * 期初应付
    */
    @ApiModelProperty("期初应付")
    private BigDecimal beginNeedPay;
    /**
    * 累计应收
    */
    @ApiModelProperty("累计应收")
    private BigDecimal allNeedGet;
    /**
    * 累计应付
    */
    @ApiModelProperty("累计应付")
    private BigDecimal allNeedPay;
    /**
    * 传真
    */
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("传真")
    @Length(max= 30,message="编码长度不能超过30")
    private String fax;
    /**
    * 手机
    */
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("手机")
    @Length(max= 30,message="编码长度不能超过30")
    private String telephone;
    /**
    * 地址
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("地址")
    @Length(max= 50,message="编码长度不能超过50")
    private String address;
    /**
    * 纳税人识别号
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("纳税人识别号")
    @Length(max= 50,message="编码长度不能超过50")
    private String taxNum;
    /**
    * 开户行
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("开户行")
    @Length(max= 50,message="编码长度不能超过50")
    private String bankName;
    /**
    * 账号
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("账号")
    @Length(max= 50,message="编码长度不能超过50")
    private String accountNumber;
    /**
    * 税率
    */
    @ApiModelProperty("税率")
    private BigDecimal taxRate;
    /**
    * 排序
    */
    @Size(max= 10,message="编码长度不能超过10")
    @ApiModelProperty("排序")
    @Length(max= 10,message="编码长度不能超过10")
    private String sort;
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
