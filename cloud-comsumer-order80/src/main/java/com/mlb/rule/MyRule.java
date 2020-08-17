package com.mlb.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className MyRule
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/6/5 0:28
 * @Version 1.0
 */
@Configuration
public class MyRule {
    @Bean
    public IRule getRule(){
        return new RandomRule();//随机
    }
}
