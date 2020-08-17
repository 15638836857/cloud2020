package com.mlb.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @className AppcationContextConfig
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/5/27 23:33
 * @Version 1.0
 */
@Component
public class AppcationContextConfig {
    @Bean
//    @LoadBalanced //负载均衡
    public RestTemplate getRestTempate(){
        return new RestTemplate();
    }
}
