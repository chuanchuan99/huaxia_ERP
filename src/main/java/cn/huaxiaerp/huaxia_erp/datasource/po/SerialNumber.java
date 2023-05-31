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
* 序列号表
* @TableName jsh_serial_number* kjc
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SerialNumber implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 产品表id
    */
    @ApiModelProperty("产品表id")
    private Long materialId;
    /**
    * 仓库id
    */
    @ApiModelProperty("仓库id")
    private Long depotId;
    /**
    * 序列号
    */
    @Size(max= 64,message="编码长度不能超过64")
    @ApiModelProperty("序列号")
    @Length(max= 64,message="编码长度不能超过64")
    private String serialNumber;
    /**
    * 是否卖出，0未卖出，1卖出
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("是否卖出，0未卖出，1卖出")
    @Length(max= 1,message="编码长度不能超过1")
    private String isSell;
    /**
    * 备注
    */
    @Size(max= 1024,message="编码长度不能超过1024")
    @ApiModelProperty("备注")
    @Length(max= 1024,message="编码长度不能超过1,024")
    private String remark;
    /**
    * 删除标记，0未删除，1删除
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("删除标记，0未删除，1删除")
    @Length(max= 1,message="编码长度不能超过1")
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
    * 入库单号
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("入库单号")
    @Length(max= 50,message="编码长度不能超过50")
    private String inBillNo;
    /**
    * 出库单号
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("出库单号")
    @Length(max= 50,message="编码长度不能超过50")
    private String outBillNo;
    /**
    * 租户id
    */
    @ApiModelProperty("租户id")
    private Long tenantId;


}
