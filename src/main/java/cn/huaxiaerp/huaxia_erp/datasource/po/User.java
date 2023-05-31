package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

/**
* 用户表
* @TableName jsh_user* kjc
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 用户姓名--例如张三
    */
    @NotBlank(message="[用户姓名--例如张三]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("用户姓名--例如张三")
    @Length(max= 255,message="编码长度不能超过255")
    private String username;
    /**
    * 登录用户名
    */
    @NotBlank(message="[登录用户名]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("登录用户名")
    @Length(max= 255,message="编码长度不能超过255")
    private String loginName;
    /**
    * 登陆密码
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("登陆密码")
    @Length(max= 50,message="编码长度不能超过50")
    private String password;
    /**
    * 是否经理，0否，1是
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("是否经理，0否，1是")
    @Length(max= 1,message="编码长度不能超过1")
    private String leaderFlag;
    /**
    * 职位
    */
    @Size(max= 200,message="编码长度不能超过200")
    @ApiModelProperty("职位")
    @Length(max= 200,message="编码长度不能超过200")
    private String position;
    /**
    * 所属部门
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("所属部门")
    @Length(max= 255,message="编码长度不能超过255")
    private String department;
    /**
    * 电子邮箱
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("电子邮箱")
    @Length(max= 100,message="编码长度不能超过100")
    private String email;
    /**
    * 手机号码
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("手机号码")
    @Length(max= 100,message="编码长度不能超过100")
    private String phonenum;
    /**
    * 是否为管理者 0==管理者 1==员工
    */
    @NotNull(message="[是否为管理者 0==管理者 1==员工]不能为空")
    @ApiModelProperty("是否为管理者 0==管理者 1==员工")
    private Integer ismanager;
    /**
    * 是否系统自带数据
    */
    @NotNull(message="[是否系统自带数据 ]不能为空")
    @ApiModelProperty("是否系统自带数据 ")
    private Integer isystem;
    /**
    * 状态，0：正常，1：删除，2封禁
    */
    @ApiModelProperty("状态，0：正常，1：删除，2封禁")
    private Integer status;
    /**
    * 用户描述信息
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("用户描述信息")
    @Length(max= 500,message="编码长度不能超过500")
    private String description;
    /**
    * 备注
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("备注")
    @Length(max= 500,message="编码长度不能超过500")
    private String remark;
    /**
    * 微信绑定
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("微信绑定")
    @Length(max= 100,message="编码长度不能超过100")
    private String weixinOpenId;
    /**
    * 租户id
    */
    @ApiModelProperty("租户id")
    private Long tenantId;

}
