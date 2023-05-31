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
* 单据子表
* @TableName jsh_depot_item* kjc
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepotItem implements Serializable {

    /**
     * 主键
     */
    @NotNull(message = "[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
     * 表头Id
     */
    @NotNull(message = "[表头Id]不能为空")
    @ApiModelProperty("表头Id")
    private Long headerId;
    /**
     * 商品Id
     */
    @NotNull(message = "[商品Id]不能为空")
    @ApiModelProperty("商品Id")
    private Long materialId;
    /**
     * 商品扩展id
     */
    @ApiModelProperty("商品扩展id")
    private Long materialExtendId;
    /**
     * 商品计量单位
     */
    @Size(max = 20, message = "编码长度不能超过20")
    @ApiModelProperty("商品计量单位")
    @Length(max = 20, message = "编码长度不能超过20")
    private String materialUnit;
    /**
     * 多属性
     */
    @Size(max = 50, message = "编码长度不能超过50")
    @ApiModelProperty("多属性")
    @Length(max = 50, message = "编码长度不能超过50")
    private String sku;
    /**
     * 数量
     */
    @ApiModelProperty("数量")
    private BigDecimal operNumber;
    /**
     * 基础数量，如kg、瓶
     */
    @ApiModelProperty("基础数量，如kg、瓶")
    private BigDecimal basicNumber;
    /**
     * 单价
     */
    @ApiModelProperty("单价")
    private BigDecimal unitPrice;
    /**
     * 采购单价
     */
    @ApiModelProperty("采购单价")
    private BigDecimal purchaseUnitPrice;
    /**
     * 含税单价
     */
    @ApiModelProperty("含税单价")
    private BigDecimal taxUnitPrice;
    /**
     * 金额
     */
    @ApiModelProperty("金额")
    private BigDecimal allPrice;
    /**
     * 备注
     */
    @Size(max = 200, message = "编码长度不能超过200")
    @ApiModelProperty("备注")
    @Length(max = 200, message = "编码长度不能超过200")
    private String remark;
    /**
     * 仓库ID
     */
    @ApiModelProperty("仓库ID")
    private Long depotId;
    /**
     * 调拨时，对方仓库Id
     */
    @ApiModelProperty("调拨时，对方仓库Id")
    private Long anotherDepotId;
    /**
     * 税率
     */
    @ApiModelProperty("税率")
    private BigDecimal taxRate;
    /**
     * 税额
     */
    @ApiModelProperty("税额")
    private BigDecimal taxMoney;
    /**
     * 价税合计
     */
    @ApiModelProperty("价税合计")
    private BigDecimal taxLastMoney;
    /**
     * 商品类型
     */
    @Size(max = 20, message = "编码长度不能超过20")
    @ApiModelProperty("商品类型")
    @Length(max = 20, message = "编码长度不能超过20")
    private String materialType;
    /**
     * 序列号列表
     */
    @Size(max = 2000, message = "编码长度不能超过2000")
    @ApiModelProperty("序列号列表")
    @Length(max = 2000, message = "编码长度不能超过2,000")
    private String snList;
    /**
     * 批号
     */
    @Size(max = 100, message = "编码长度不能超过100")
    @ApiModelProperty("批号")
    @Length(max = 100, message = "编码长度不能超过100")
    private String batchNumber;
    /**
     * 有效日期
     */
    @ApiModelProperty("有效日期")
    private Date expirationDate;
    /**
     * 关联明细id
     */
    @ApiModelProperty("关联明细id")
    private Long linkId;
    /**
     * 租户id
     */
    @ApiModelProperty("租户id")
    private Long tenantId;
    /**
     * 删除标记，0未删除，1删除
     */
    @Size(max = 1, message = "编码长度不能超过1")
    @ApiModelProperty("删除标记，0未删除，1删除")
    @Length(max = 1, message = "编码长度不能超过1")
    private String deleteFlag;
}
