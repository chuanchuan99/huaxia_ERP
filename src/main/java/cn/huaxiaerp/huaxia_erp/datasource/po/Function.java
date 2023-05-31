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
* 功能模块表
* @TableName jsh_function* kjc
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Function implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 编号
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("编号")
    @Length(max= 50,message="编码长度不能超过50")
    private String number;
    /**
    * 名称
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("名称")
    @Length(max= 50,message="编码长度不能超过50")
    private String name;
    /**
    * 上级编号
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("上级编号")
    @Length(max= 50,message="编码长度不能超过50")
    private String parentNumber;
    /**
    * 链接
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("链接")
    @Length(max= 100,message="编码长度不能超过100")
    private String url;
    /**
    * 组件
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("组件")
    @Length(max= 100,message="编码长度不能超过100")
    private String component;
    /**
    * 收缩
    */
    @ApiModelProperty("收缩")
    private Boolean state;
    /**
    * 排序
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("排序")
    @Length(max= 50,message="编码长度不能超过50")
    private String sort;
    /**
    * 启用
    */
    @ApiModelProperty("启用")
    private Boolean enabled;
    /**
    * 类型
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("类型")
    @Length(max= 50,message="编码长度不能超过50")
    private String type;
    /**
    * 功能按钮
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("功能按钮")
    @Length(max= 50,message="编码长度不能超过50")
    private String pushBtn;
    /**
    * 图标
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("图标")
    @Length(max= 50,message="编码长度不能超过50")
    private String icon;
    /**
    * 删除标记，0未删除，1删除
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("删除标记，0未删除，1删除")
    @Length(max= 1,message="编码长度不能超过1")
    private String deleteFlag;


}
