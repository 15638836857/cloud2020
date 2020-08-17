package com.mlb.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className feignConfig
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/6/10 23:39
 * @Version 1.0
 */
@Configuration
public class feignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
