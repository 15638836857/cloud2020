package com.mlb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @className Gatewaymain9527
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/7/13 22:28
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class Gatewaymain9527 {
    public static void main(String[] args) {
        SpringApplication.run(Gatewaymain9527.class,args);
    }
}
