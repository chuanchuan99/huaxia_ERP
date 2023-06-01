package cn.huaxiaerp.huaxia_erp.service;

import cn.huaxiaerp.huaxia_erp.datasource.mappers.DepotHeadMapper;
import cn.huaxiaerp.huaxia_erp.datasource.po.DepotHead;
import cn.huaxiaerp.huaxia_erp.datasource.vo.DepotHeadVo4;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 单据主表 服务类
 * </p>
 *
 * @author * kjc
 * @since 2023-05-31
 */
public interface DepotHeadService extends IService<DepotHead> {
    public List<DepotHeadVo4> getAll();
}
