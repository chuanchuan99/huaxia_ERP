package cn.huaxiaerp.huaxia_erp.service.impl;


import cn.huaxiaerp.huaxia_erp.datasource.mappers.UserBusinessMapper;
import cn.huaxiaerp.huaxia_erp.datasource.po.UserBusiness;
import cn.huaxiaerp.huaxia_erp.service.UserBusinessService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户/角色/模块关系表 服务实现类
 * </p>
 *
 * @author* kjc
 * @since 2023-05-31
 */
@Service
public class UserBusinessServiceImpl extends ServiceImpl<UserBusinessMapper, UserBusiness> implements UserBusinessService {

}
