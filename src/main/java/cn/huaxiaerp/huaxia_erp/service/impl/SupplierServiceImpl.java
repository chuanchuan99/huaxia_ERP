package cn.huaxiaerp.huaxia_erp.service.impl;


import cn.huaxiaerp.huaxia_erp.datasource.mappers.SupplierMapper;
import cn.huaxiaerp.huaxia_erp.datasource.po.Supplier;
import cn.huaxiaerp.huaxia_erp.service.SupplierService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 供应商/客户信息表 服务实现类
 * </p>
 *
 * @author * kjc
 * @since 2023-05-31
 */
@Service
public class SupplierServiceImpl extends ServiceImpl<SupplierMapper, Supplier> implements SupplierService {
    @Resource
    private SupplierMapper supplierMapper;

    /**
     * 查询所有会员
     * @return
     */
    @Override
    public List<Supplier> findBySelectRetail() {
        QueryWrapper<Supplier> query = new QueryWrapper();
        query.eq("type","会员");
        List<Supplier> suppliers = baseMapper.selectList(query);
        return suppliers;
    }

    @Override
    public List<Supplier> getSupplierLikeSupplierOrTelephoneOrPhoneNumber(String type,String supplier, String telephone, String phoneNum) {
        return supplierMapper.getSupplierLikeSupplierOrTelephoneOrPhoneNumber(type,supplier,telephone,phoneNum);
    }

    @Override
    public void batchUpdateEnable(List<Integer> ids, boolean enabled) {
        Map<String, Object> params = new HashMap<>();
        params.put("ids", ids);
        params.put("enabled", enabled);
        supplierMapper.batchUpdateEnable(params);
    }

}
