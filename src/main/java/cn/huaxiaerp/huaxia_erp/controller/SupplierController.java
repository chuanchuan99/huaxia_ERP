package cn.huaxiaerp.huaxia_erp.controller;


import cn.huaxiaerp.huaxia_erp.datasource.po.Supplier;
import cn.huaxiaerp.huaxia_erp.service.impl.SupplierServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 * 供应商/客户信息表 前端控制器
 * </p>
 *
 * @author kjc
 * @since 2023-05-31
 */
@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Resource
    private SupplierServiceImpl supplierServiceImpl;

    /**
     * 查询所有会员信息返回给前端
     * @param request
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/findBySelect_retail")
    @ApiOperation(value = "查找会员信息")
    public List<Supplier> findBySelectRetail(HttpServletRequest request)throws Exception {
        return supplierServiceImpl.findBySelectRetail();
    }
}
