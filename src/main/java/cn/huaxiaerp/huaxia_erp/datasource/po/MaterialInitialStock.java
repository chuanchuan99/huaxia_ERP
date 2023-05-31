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
* 产品初始库存
* @TableName jsh_material_initial_stock* kjc
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MaterialInitialStock implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 产品id
    */
    @ApiModelProperty("产品id")
    private Long materialId;
    /**
    * 仓库id
    */
    @ApiModelProperty("仓库id")
    private Long depotId;
    /**
    * 初始库存数量
    */
    @ApiModelProperty("初始库存数量")
    private BigDecimal number;
    /**
    * 最低库存数量
    */
    @ApiModelProperty("最低库存数量")
    private BigDecimal lowSafeStock;
    /**
    * 最高库存数量
    */
    @ApiModelProperty("最高库存数量")
    private BigDecimal highSafeStock;
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
