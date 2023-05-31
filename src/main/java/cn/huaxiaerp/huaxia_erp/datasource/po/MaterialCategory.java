package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

/**
* 产品类型表
* @TableName jsh_material_category* kjc
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MaterialCategory implements Serializable {

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
    * 等级
    */
    @ApiModelProperty("等级")
    private Integer categoryLevel;
    /**
    * 上级id
    */
    @ApiModelProperty("上级id")
    private Long parentId;
    /**
    * 显示顺序
    */
    @Size(max= 10,message="编码长度不能超过10")
    @ApiModelProperty("显示顺序")
    @Length(max= 10,message="编码长度不能超过10")
    private String sort;
    /**
    * 编号
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("编号")
    @Length(max= 100,message="编码长度不能超过100")
    private String serialNo;
    /**
    * 备注
    */
    @Size(max= 1024,message="编码长度不能超过1024")
    @ApiModelProperty("备注")
    @Length(max= 1024,message="编码长度不能超过1,024")
    private String remark;
    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private Date createTime;
    /**
    * 更新时间
    */
    @ApiModelProperty("更新时间")
    private Date updateTime;
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
