package com.mlb.springcloud;

import org.apache.ibatis.annotations.Param;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @className PaymentMain8004
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/6/1 23:32
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class,args);
    }
}
