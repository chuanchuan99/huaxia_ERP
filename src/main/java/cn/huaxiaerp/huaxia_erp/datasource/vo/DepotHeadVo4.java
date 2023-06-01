package cn.huaxiaerp.huaxia_erp.datasource.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepotHeadVo4 {
    /**
     * 供应商
     */
    private String supplier;

    /**
     * 初始票据号
     */
    private String defaultNumber;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品规格
     */
    private String standard;

    /**
     * 商品型号
     */
    private String model;

    /**
     * 出入库时间
     */
    private Date operTime;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 数量
     */
    private BigDecimal operNumber;

    /**
     * 总金额
     */
    private BigDecimal allPrice;


}
