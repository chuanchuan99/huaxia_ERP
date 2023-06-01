package cn.huaxiaerp.huaxia_erp.service;

import cn.huaxiaerp.huaxia_erp.datasource.po.Depot;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 仓库表 服务类
 * </p>
 *
 * @author * kjc
 * @since 2023-05-31
 */
public interface DepotService extends IService<Depot> {
    /**
     * 动态sql获取仓库信息
     * @param name 仓库名称
     * @param remark 备注
     * @return
     */
    List<Depot> getAllLikeNameOrLikeRemake(String name, String remark);

}
