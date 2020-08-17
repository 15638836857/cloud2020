package com.mlb.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @className Follbackservice
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/6/16 22:22
 * @Version 1.0
 */
@Component
public class Follbackservice implements PaymentHystrixServie{
    @Override
    public String PaymentInfo_ok(Integer id) {
        return "follback----------PaymentInfo_ok 异常";
}

    @Override
    public String PaymentInfo_timeout(Integer id) {
        return "follback----------PaymentInfo_timeout 异常";
    }
}
