package com.mlb.springcloud;

import com.mlb.rule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @className OrderMain80
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/5/27 23:30
 * @Version 1.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//去掉数据源
@EnableEurekaClient
//@RibbonClient(name="CLOUD-PAYMENT-SERVICE",configuration = MyRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
