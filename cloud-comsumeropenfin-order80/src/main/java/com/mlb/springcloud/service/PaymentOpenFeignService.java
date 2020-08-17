package com.mlb.springcloud.service;

import com.mlb.springcloud.entities.CommonResult;
import com.mlb.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "cloud-payment-service")
public interface PaymentOpenFeignService {
    @GetMapping("payment/get/{id}")
    public CommonResult<Payment> getId(@PathVariable("id") Long id);
    @GetMapping("payment/feign/timeout")
    public String timeout();
}
