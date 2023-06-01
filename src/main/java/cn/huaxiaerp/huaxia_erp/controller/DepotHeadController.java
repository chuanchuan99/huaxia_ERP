package cn.huaxiaerp.huaxia_erp.controller;


import cn.huaxiaerp.huaxia_erp.datasource.vo.DepotHeadVo4;
import cn.huaxiaerp.huaxia_erp.service.impl.DepotHeadServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 单据主表 前端控制器
 * </p>
 *
 * @author kjc
 * @since 2023-05-31
 */
@RestController
@RequestMapping("/depot-head")
public class DepotHeadController {
    @Resource
    private DepotHeadServiceImpl depotHeadServiceImpl;

    @RequestMapping("/getAll")
    public List<DepotHeadVo4> getAll(){
        return depotHeadServiceImpl.getAll();
    }
}
