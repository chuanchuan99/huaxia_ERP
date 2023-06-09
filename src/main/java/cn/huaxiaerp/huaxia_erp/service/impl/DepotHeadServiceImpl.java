package cn.huaxiaerp.huaxia_erp.service.impl;

import cn.huaxiaerp.huaxia_erp.datasource.mappers.DepotHeadMapper;
import cn.huaxiaerp.huaxia_erp.datasource.po.DepotHead;
import cn.huaxiaerp.huaxia_erp.datasource.vo.DepotHeadVo4;
import cn.huaxiaerp.huaxia_erp.service.DepotHeadService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 单据主表 服务实现类
 * </p>
 *
 * @author* kjc
 * @since 2023-05-31
 */
@Service
public class DepotHeadServiceImpl extends ServiceImpl<DepotHeadMapper, DepotHead> implements DepotHeadService {

    @Resource
    DepotHeadMapper depotHeadMapper;

    @Override
    public List<DepotHeadVo4> getAll() {
        return depotHeadMapper.getAll();
    }
}
