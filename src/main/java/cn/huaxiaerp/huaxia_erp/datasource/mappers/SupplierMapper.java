package cn.huaxiaerp.huaxia_erp.datasource.mappers;


import cn.huaxiaerp.huaxia_erp.datasource.po.Supplier;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 供应商/客户信息表 Mapper 接口
 * </p>
 *
 * @author kjc
 * @since 2023-05-31
 */
public interface SupplierMapper extends BaseMapper<Supplier> {

    /**
     * 动态sql获取供应商信息
     * @param supplier 供应商名称
     * @param telephone 手机号码
     * @param phoneNum 联系电话
     * @param type 供应商/客户
     * @return
     */
    List<Supplier> getSupplierLikeSupplierOrTelephoneOrPhoneNumber(String type, String supplier, String telephone, String phoneNum);

    List<Supplier> getAll();

}
