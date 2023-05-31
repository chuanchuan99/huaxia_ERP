package cn.huaxiaerp.huaxia_erp.service;

import cn.huaxiaerp.huaxia_erp.datasource.po.Supplier;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 供应商/客户信息表 服务类
 * </p>
 *
 * @author * kjc
 * @since 2023-05-31
 */
public interface SupplierService extends IService<Supplier> {

    /**
     * 查询所有会员
     * @return
     */
    public List<Supplier> findBySelectRetail();
}
