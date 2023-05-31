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
* 机构表
* @TableName jsh_organization* kjc
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Organization implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 机构编号
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("机构编号")
    @Length(max= 20,message="编码长度不能超过20")
    private String orgNo;
    /**
    * 机构简称
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("机构简称")
    @Length(max= 20,message="编码长度不能超过20")
    private String orgAbr;
    /**
    * 父机构id
    */
    @ApiModelProperty("父机构id")
    private Long parentId;
    /**
    * 机构显示顺序
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("机构显示顺序")
    @Length(max= 20,message="编码长度不能超过20")
    private String sort;
    /**
    * 备注
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("备注")
    @Length(max= 500,message="编码长度不能超过500")
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
