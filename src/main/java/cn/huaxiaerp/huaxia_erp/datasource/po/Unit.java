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
* 多单位表
* @TableName jsh_unit* kjc
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Unit implements Serializable {

    /**
     * 主键
     */
    @NotNull(message = "[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
     * 名称，支持多单位
     */
    @Size(max = 50, message = "编码长度不能超过50")
    @ApiModelProperty("名称，支持多单位")
    @Length(max = 50, message = "编码长度不能超过50")
    private String name;
    /**
     * 基础单位
     */
    @Size(max = 50, message = "编码长度不能超过50")
    @ApiModelProperty("基础单位")
    @Length(max = 50, message = "编码长度不能超过50")
    private String basicUnit;
    /**
     * 副单位
     */
    @Size(max = 50, message = "编码长度不能超过50")
    @ApiModelProperty("副单位")
    @Length(max = 50, message = "编码长度不能超过50")
    private String otherUnit;
    /**
     * 副单位2
     */
    @Size(max = 50, message = "编码长度不能超过50")
    @ApiModelProperty("副单位2")
    @Length(max = 50, message = "编码长度不能超过50")
    private String otherUnitTwo;
    /**
     * 副单位3
     */
    @Size(max = 50, message = "编码长度不能超过50")
    @ApiModelProperty("副单位3")
    @Length(max = 50, message = "编码长度不能超过50")
    private String otherUnitThree;
    /**
     * 比例
     */
    @ApiModelProperty("比例")
    private BigDecimal ratio;
    /**
     * 比例2
     */
    @ApiModelProperty("比例2")
    private BigDecimal ratioTwo;
    /**
     * 比例3
     */
    @ApiModelProperty("比例3")
    private BigDecimal ratioThree;
    /**
     * 启用
     */
    @ApiModelProperty("启用")
    private Boolean enabled;
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
