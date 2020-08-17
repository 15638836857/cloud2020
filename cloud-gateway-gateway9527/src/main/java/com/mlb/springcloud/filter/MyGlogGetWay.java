package com.mlb.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @className MyGlogGetWay
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/7/28 21:30
 * @Version 1.0
 */
@Component
@Slf4j
public class MyGlogGetWay implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("************欢迎进入****************");
        String uname=exchange.getRequest().getQueryParams().getFirst("uname");
        if(!StringUtils.isNotEmpty(uname)){
            log.info("************用户名不能为空****************");

            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return  exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
