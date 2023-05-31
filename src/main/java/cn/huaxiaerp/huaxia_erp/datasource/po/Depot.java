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
* 仓库表
* @TableName jsh_depot* kjc
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Depot implements Serializable {

    /**
     * 主键
     */
    @NotNull(message = "[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
     * 仓库名称
     */
    @Size(max = 20, message = "编码长度不能超过20")
    @ApiModelProperty("仓库名称")
    @Length(max = 20, message = "编码长度不能超过20")
    private String name;
    /**
     * 仓库地址
     */
    @Size(max = 50, message = "编码长度不能超过50")
    @ApiModelProperty("仓库地址")
    @Length(max = 50, message = "编码长度不能超过50")
    private String address;
    /**
     * 仓储费
     */
    @ApiModelProperty("仓储费")
    private BigDecimal warehousing;
    /**
     * 搬运费
     */
    @ApiModelProperty("搬运费")
    private BigDecimal truckage;
    /**
     * 类型
     */
    @ApiModelProperty("类型")
    private Integer type;
    /**
     * 排序
     */
    @Size(max = 10, message = "编码长度不能超过10")
    @ApiModelProperty("排序")
    @Length(max = 10, message = "编码长度不能超过10")
    private String sort;
    /**
     * 描述
     */
    @Size(max = 100, message = "编码长度不能超过100")
    @ApiModelProperty("描述")
    @Length(max = 100, message = "编码长度不能超过100")
    private String remark;
    /**
     * 负责人
     */
    @ApiModelProperty("负责人")
    private Long principal;
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
    /**
     * 是否默认
     */
    @ApiModelProperty("是否默认")
    private Boolean isDefault;

}
