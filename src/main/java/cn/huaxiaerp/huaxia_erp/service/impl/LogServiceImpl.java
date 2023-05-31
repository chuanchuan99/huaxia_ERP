package cn.huaxiaerp.huaxia_erp.service.impl;


import cn.huaxiaerp.huaxia_erp.datasource.mappers.LogMapper;
import cn.huaxiaerp.huaxia_erp.datasource.po.Log;
import cn.huaxiaerp.huaxia_erp.service.LogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志 服务实现类
 * </p>
 *
 * @author * kjc
 * @since 2023-05-31
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements LogService {

}
