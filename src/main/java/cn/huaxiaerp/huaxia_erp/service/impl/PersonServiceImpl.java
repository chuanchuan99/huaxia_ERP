package cn.huaxiaerp.huaxia_erp.service.impl;


import cn.huaxiaerp.huaxia_erp.datasource.mappers.PersonMapper;
import cn.huaxiaerp.huaxia_erp.datasource.po.Person;
import cn.huaxiaerp.huaxia_erp.service.PersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 经手人表 服务实现类
 * </p>
 *
 * @author * kjc
 * @since 2023-05-31
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements PersonService {

}
