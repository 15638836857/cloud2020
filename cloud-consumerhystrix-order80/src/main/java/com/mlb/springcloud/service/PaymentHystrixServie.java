package com.mlb.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @className PaymentHystrixServie
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/6/12 23:02
 * @Version 1.0
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-SERVICE",fallback = Follbackservice.class)
public interface PaymentHystrixServie {
    @GetMapping("payment/hystrix/ok/{id}")
    public String PaymentInfo_ok(@PathVariable("id")Integer id);
    @GetMapping("payment/hystrix/timeout/{id}")
    public String PaymentInfo_timeout(@PathVariable("id")Integer id);

}
