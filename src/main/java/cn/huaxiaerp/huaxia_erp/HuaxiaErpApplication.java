package cn.huaxiaerp.huaxia_erp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * * kjc
 */
@SpringBootApplication
@MapperScan("cn.huaxiaerp.huaxia_erp.datasource.mappers")
@ComponentScan("cn.huaxiaerp")
public class HuaxiaErpApplication {

    public static void main(String[] args) {
        System.out.println("springboot!!!");
        SpringApplication.run(HuaxiaErpApplication.class, args);
    }

}
