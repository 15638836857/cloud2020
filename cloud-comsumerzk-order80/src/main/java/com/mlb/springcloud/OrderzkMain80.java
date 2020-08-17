package com.mlb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @className OrderzkMain80
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/6/2 1:33
 * @Version 1.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//去掉数据源
@EnableDiscoveryClient
public class OrderzkMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderzkMain80.class,args);
    }
}
