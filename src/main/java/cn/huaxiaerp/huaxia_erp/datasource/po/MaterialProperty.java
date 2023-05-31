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
* 产品扩展字段表
* @TableName jsh_material_property* kjc
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MaterialProperty implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 原始名称
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("原始名称")
    @Length(max= 50,message="编码长度不能超过50")
    private String nativeName;
    /**
    * 是否启用
    */
    @ApiModelProperty("是否启用")
    private Boolean enabled;
    /**
    * 排序
    */
    @Size(max= 10,message="编码长度不能超过10")
    @ApiModelProperty("排序")
    @Length(max= 10,message="编码长度不能超过10")
    private String sort;
    /**
    * 别名
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("别名")
    @Length(max= 50,message="编码长度不能超过50")
    private String anotherName;
    /**
    * 删除标记，0未删除，1删除
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("删除标记，0未删除，1删除")
    @Length(max= 1,message="编码长度不能超过1")
    private String deleteFlag;



}
