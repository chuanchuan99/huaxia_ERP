package cn.huaxiaerp.huaxia_erp.controller.TestController;

import cn.huaxiaerp.huaxia_erp.datasource.po.Depot;
import cn.huaxiaerp.huaxia_erp.datasource.po.Supplier;
import cn.huaxiaerp.huaxia_erp.service.DepotService;
import cn.huaxiaerp.huaxia_erp.service.SupplierService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class TestController {
    @Resource
    private SupplierService supplierService;
    @Autowired
    private DepotService depotService;

    @GetMapping("/getAll")
    public JSONArray getAll(){
        List<Supplier> supplierLikeSupplierOrTelephoneOrPhoneNumber = supplierService.getSupplierLikeSupplierOrTelephoneOrPhoneNumber("会员","", "", "");
        System.out.println("supplierLikeSupplierOrTelephoneOrPhoneNumber的结果");
        System.out.println(supplierLikeSupplierOrTelephoneOrPhoneNumber);
        JSONArray arr = new JSONArray();
        JSONArray dataArray = new JSONArray();
        if (null != supplierLikeSupplierOrTelephoneOrPhoneNumber) {
            for (Supplier supplier : supplierLikeSupplierOrTelephoneOrPhoneNumber) {
                JSONObject item = new JSONObject();
                item.put("id", supplier.getId());
                //供应商名称
                item.put("supplier", supplier.getSupplier());
                item.put("contacts",supplier.getContacts());
                item.put("telephone",supplier.getTelephone());
                item.put("phone_num",supplier.getPhoneNum());
                item.put("email",supplier.getEmail());
                item.put("begin_need_pay",supplier.getBeginNeedPay());
                item.put("all_need_pay",supplier.getAllNeedPay());
                item.put("tax_rate",supplier.getTaxRate());
                item.put("enabled",supplier.getEnabled());
                dataArray.add(item);
            }
        }

        arr = dataArray;
        System.out.println(arr);
        return arr;
    }

    @GetMapping("/getAll2")
    public List<Depot> getAllLikeNameOrLikeRemake(){
        return depotService.getAllLikeNameOrLikeRemake("仓库","");
    }

}
