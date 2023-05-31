package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

/**
* 系统参数
* @TableName jsh_system_config* kjc
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SystemConfig implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 公司名称
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("公司名称")
    @Length(max= 50,message="编码长度不能超过50")
    private String companyName;
    /**
    * 公司联系人
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("公司联系人")
    @Length(max= 20,message="编码长度不能超过20")
    private String companyContacts;
    /**
    * 公司地址
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("公司地址")
    @Length(max= 50,message="编码长度不能超过50")
    private String companyAddress;
    /**
    * 公司电话
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("公司电话")
    @Length(max= 20,message="编码长度不能超过20")
    private String companyTel;
    /**
    * 公司传真
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("公司传真")
    @Length(max= 20,message="编码长度不能超过20")
    private String companyFax;
    /**
    * 公司邮编
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("公司邮编")
    @Length(max= 20,message="编码长度不能超过20")
    private String companyPostCode;
    /**
    * 销售协议
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("销售协议")
    @Length(max= 500,message="编码长度不能超过500")
    private String saleAgreement;
    /**
    * 仓库启用标记，0未启用，1启用
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("仓库启用标记，0未启用，1启用")
    @Length(max= 1,message="编码长度不能超过1")
    private String depotFlag;
    /**
    * 客户启用标记，0未启用，1启用
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("客户启用标记，0未启用，1启用")
    @Length(max= 1,message="编码长度不能超过1")
    private String customerFlag;
    /**
    * 负库存启用标记，0未启用，1启用
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("负库存启用标记，0未启用，1启用")
    @Length(max= 1,message="编码长度不能超过1")
    private String minusStockFlag;
    /**
    * 以销定购启用标记，0未启用，1启用
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("以销定购启用标记，0未启用，1启用")
    @Length(max= 1,message="编码长度不能超过1")
    private String purchaseBySaleFlag;
    /**
    * 多级审核启用标记，0未启用，1启用
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("多级审核启用标记，0未启用，1启用")
    @Length(max= 1,message="编码长度不能超过1")
    private String multiLevelApprovalFlag;
    /**
    * 流程类型，可多选
    */
    @Size(max= 200,message="编码长度不能超过200")
    @ApiModelProperty("流程类型，可多选")
    @Length(max= 200,message="编码长度不能超过200")
    private String multiBillType;
    /**
    * 强审核启用标记，0未启用，1启用
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("强审核启用标记，0未启用，1启用")
    @Length(max= 1,message="编码长度不能超过1")
    private String forceApprovalFlag;
    /**
    * 更新单价启用标记，0未启用，1启用
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("更新单价启用标记，0未启用，1启用")
    @Length(max= 1,message="编码长度不能超过1")
    private String updateUnitPriceFlag;
    /**
    * 超出关联单据启用标记，0未启用，1启用
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("超出关联单据启用标记，0未启用，1启用")
    @Length(max= 1,message="编码长度不能超过1")
    private String overLinkBillFlag;
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
