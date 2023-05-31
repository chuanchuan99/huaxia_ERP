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
* 产品价格扩展
* @TableName jsh_material_extend* kjc
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MaterialExtend implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 商品id
    */
    @ApiModelProperty("商品id")
    private Long materialId;
    /**
    * 商品条码
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("商品条码")
    @Length(max= 50,message="编码长度不能超过50")
    private String barCode;
    /**
    * 商品单位
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("商品单位")
    @Length(max= 50,message="编码长度不能超过50")
    private String commodityUnit;
    /**
    * 多属性
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("多属性")
    @Length(max= 50,message="编码长度不能超过50")
    private String sku;
    /**
    * 采购价格
    */
    @ApiModelProperty("采购价格")
    private BigDecimal purchaseDecimal;
    /**
    * 零售价格
    */
    @ApiModelProperty("零售价格")
    private BigDecimal commodityDecimal;
    /**
    * 销售价格
    */
    @ApiModelProperty("销售价格")
    private BigDecimal wholesaleDecimal;
    /**
    * 最低售价
    */
    @ApiModelProperty("最低售价")
    private BigDecimal lowDecimal;
    /**
    * 是否为默认单位，1是，0否
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("是否为默认单位，1是，0否")
    @Length(max= 1,message="编码长度不能超过1")
    private String defaultFlag;
    /**
    * 创建日期
    */
    @ApiModelProperty("创建日期")
    private Date createTime;
    /**
    * 创建人编码
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("创建人编码")
    @Length(max= 50,message="编码长度不能超过50")
    private String createSerial;
    /**
    * 更新人编码
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("更新人编码")
    @Length(max= 50,message="编码长度不能超过50")
    private String updateSerial;
    /**
    * 更新时间戳
    */
    @ApiModelProperty("更新时间戳")
    private Long updateTime;
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
