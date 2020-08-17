package com.mlb.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @className GatewayConfig
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/7/13 22:57
 * @Version 1.0
 */
@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator getRouteLateor(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder builder=routeLocatorBuilder.routes();
        builder.route("path_mlb1",r->r.path("/guonei")
                .uri("http://news.baidu.com/guonei")).build();
        builder.route("path_mlb1",r->r.path("/guoji")
                .uri("http://news.baidu.com/guoji")).build();
        return builder.build();
    }


}
