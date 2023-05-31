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
* 机构用户关系表
* @TableName jsh_orga_user_rel* kjc
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrgaUserRel implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 机构id
    */
    @NotNull(message="[机构id]不能为空")
    @ApiModelProperty("机构id")
    private Long orgaId;
    /**
    * 用户id
    */
    @NotNull(message="[用户id]不能为空")
    @ApiModelProperty("用户id")
    private Long userId;
    /**
    * 用户在所属机构中显示顺序
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("用户在所属机构中显示顺序")
    @Length(max= 20,message="编码长度不能超过20")
    private String userBlngOrgaDsplSeq;
    /**
    * 删除标记，0未删除，1删除
    */
    @ApiModelProperty("删除标记，0未删除，1删除")
    private String deleteFlag;
    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private Date createTime;
    /**
    * 创建人
    */
    @ApiModelProperty("创建人")
    private Long creator;
    /**
    * 更新时间
    */
    @ApiModelProperty("更新时间")
    private Date updateTime;
    /**
    * 更新人
    */
    @ApiModelProperty("更新人")
    private Long updater;
    /**
    * 租户id
    */
    @ApiModelProperty("租户id")
    private Long tenantId;


}
