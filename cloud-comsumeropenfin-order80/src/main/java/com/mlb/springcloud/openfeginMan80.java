package com.mlb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @className openfeginMan80
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/6/10 22:26
 * @Version 1.0
 */
@SpringBootApplication
@EnableFeignClients
public class openfeginMan80 {
    public static void main(String[] args) {
        SpringApplication.run(openfeginMan80.class,args);
    }
}
