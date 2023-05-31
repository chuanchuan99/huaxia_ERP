package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.Depot;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 仓库表 Mapper 接口
 * </p>
 *
 * @author kjc
 * @since 2023-05-31
 */
public interface DepotMapper extends BaseMapper<Depot> {
    /**
     * 动态sql获取仓库信息
     * @param name 仓库名称
     * @param remark 备注
     * @return
     */
    List<Depot> getAllLikeNameOrLikeRemake(String name, String remark);
}
