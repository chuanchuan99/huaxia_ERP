package cn.huaxiaerp.huaxia_erp.service.impl;


import cn.huaxiaerp.huaxia_erp.datasource.mappers.DepotMapper;
import cn.huaxiaerp.huaxia_erp.datasource.po.Depot;
import cn.huaxiaerp.huaxia_erp.service.DepotService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 仓库表 服务实现类
 * </p>
 *
 * @author * kjc
 * @since 2023-05-31
 */
@Service
public class DepotServiceImpl extends ServiceImpl<DepotMapper, Depot> implements DepotService {
    @Resource
    private DepotMapper depotMapper;

    public List<Depot> getAllLikeNameOrLikeRemake(String name, String remark){
        return depotMapper.getAllLikeNameOrLikeRemake(name, remark);
    }
}
