package com.mlb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @className HystrixdashboardMain
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/6/28 22:22
 * @Version 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixdashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixdashboardMain9001.class,args);
    }
}
