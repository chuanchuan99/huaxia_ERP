package cn.huaxiaerp.huaxia_erp.controller.TestController;

import cn.huaxiaerp.huaxia_erp.common.response.Result;
import cn.huaxiaerp.huaxia_erp.datasource.dto.supplierParme;
import cn.huaxiaerp.huaxia_erp.datasource.po.Depot;
import cn.huaxiaerp.huaxia_erp.datasource.po.Supplier;
import cn.huaxiaerp.huaxia_erp.datasource.vo.SupplierVendorAndUser;
import cn.huaxiaerp.huaxia_erp.service.DepotService;
import cn.huaxiaerp.huaxia_erp.service.SupplierService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class TestController {
    @Resource
    private SupplierService supplierService;
    @Autowired
    private DepotService depotService;

    @GetMapping("/getAll")
    public List<SupplierVendorAndUser> getAll(supplierParme supplierVendorAndUser){
        List<Supplier> supplierLikeSupplierOrTelephoneOrPhoneNumber = supplierService.getSupplierLikeSupplierOrTelephoneOrPhoneNumber("供应商",supplierVendorAndUser.getSupplier(), supplierVendorAndUser.getTelephone(), supplierVendorAndUser.getPhoneNum());
        System.out.println("supplierLikeSupplierOrTelephoneOrPhoneNumber的结果");
        System.out.println(supplierLikeSupplierOrTelephoneOrPhoneNumber);

        List<SupplierVendorAndUser> supplierVendorAndUserList = new ArrayList<>();
        if (null != supplierLikeSupplierOrTelephoneOrPhoneNumber) {
            for (Supplier supplier : supplierLikeSupplierOrTelephoneOrPhoneNumber) {
                SupplierVendorAndUser item = new SupplierVendorAndUser();
                item.setId(supplier.getId().toString());
                //供应商名称
                item.setSupplier(supplier.getSupplier());
                item.setContacts(supplier.getContacts());
                item.setTelephone(supplier.getTelephone());
                item.setPhoneNum(supplier.getPhoneNum());
                item.setEmail(supplier.getEmail());
                item.setBeginNeedGet(supplier.getBeginNeedPay());
                item.setEndNeedGet((supplier.getAllNeedPay().add(supplier.getBeginNeedPay())));
                item.setTaxRate(supplier.getTaxRate());
                item.setEnabled(supplier.getEnabled());
                System.out.println("添加完成的值：");
                System.out.println(item);
                supplierVendorAndUserList.add(item);
            }
        }
        return supplierVendorAndUserList;
    }

    @GetMapping("/getAll2")
    public List<Depot> getAllLikeNameOrLikeRemake(){
        return depotService.getAllLikeNameOrLikeRemake("仓库","");
    }

    /**
     * 根据id批量设置enable
     */

    @GetMapping("/batchUpdateEnable")
    public boolean batchUpdateEnable(@RequestParam("ids") List<Integer> ids, @RequestParam("enable") Boolean enabled) {

        System.out.println("ids结果：");
        System.out.println(ids);
        try {
            supplierService.batchUpdateEnable(ids, enabled);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
