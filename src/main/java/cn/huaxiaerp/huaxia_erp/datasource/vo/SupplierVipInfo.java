package cn.huaxiaerp.huaxia_erp.datasource.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierVipInfo {

    /**
     * 会员卡号
     */
    private String accountNumber;
    /**
     * 联系人
     */
    private String Contacts;
    /**
     * 手机号码
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
     * 预付款
     */
    private BigDecimal beginNeedGet;
    /**
     * 排序
     */
    private String sort;
    /**
     * 状态
     */
    private String enabled;



}
