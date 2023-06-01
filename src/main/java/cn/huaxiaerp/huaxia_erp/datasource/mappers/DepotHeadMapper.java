package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.DepotHead;
import cn.huaxiaerp.huaxia_erp.datasource.vo.DepotHeadVo4;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 单据主表 Mapper 接口
 * </p>
 *
 * @author kjc
 * @since 2023-05-31
 */
@Mapper
public interface DepotHeadMapper extends BaseMapper<DepotHead> {

    @Select("select js.supplier,default_number,jm.`name`,jm.standard,jm.model,jdh.oper_time,ju.username,jdi.oper_number,jdi.all_price from jsh_depot_head as jdh\n" +
            "JOIN jsh_depot_item as jdi on jdh.id = jdi.header_id\n" +
            "LEFT JOIN jsh_supplier AS js ON js.id = jdh.organ_id\n" +
            "join jsh_material as jm on jdi.material_id = jm.id\n" +
            "join jsh_user as ju on ju.id = jdh.creator\n" +
            "where sub_type = '零售' and jdh.type = '出库'")
    public List<DepotHeadVo4> getAll();
}
