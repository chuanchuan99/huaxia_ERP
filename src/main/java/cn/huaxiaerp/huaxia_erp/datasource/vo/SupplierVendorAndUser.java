package cn.huaxiaerp.huaxia_erp.datasource.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierVendorAndUser {
    /**
     * id
     */
    private String id;
    /**
     * 名称
     */
    private String Supplier;
    /**
     * 联系人
     */
    private String Contacts;
    /**
     * 手机号
     */
    private String Telephone;
    /**
     * 联系电话
     */
    private String PhoneNum;
    /**
     *邮箱
     */
    private String email;
    /**
     * 期初应收
     */
    private BigDecimal beginNeedGet;
    /**
     * 末期应收（累计应收-初期应收）
     */
    private BigDecimal endNeedGet;
    /**
     * 税率
     */
    private BigDecimal taxRate;
    /**
     * 排序
     */
    private String sort;
    /**
     * 状态
     */
    private String enabled;



}
