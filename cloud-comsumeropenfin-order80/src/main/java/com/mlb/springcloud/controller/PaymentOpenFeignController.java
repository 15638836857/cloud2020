package com.mlb.springcloud.controller;

import com.mlb.springcloud.service.PaymentOpenFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className PaymentOpenFeignController
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/6/10 22:29
 * @Version 1.0
 */
@RestController
@RequestMapping
@Slf4j
public class PaymentOpenFeignController {
    @Autowired
    private PaymentOpenFeignService paymentOpenFeignService;
    @GetMapping("comsumer/openfeign/payment/{id}")
    public Object getid(@PathVariable("id")Long id){
        return paymentOpenFeignService.getId(id);

    }
    @GetMapping("comsumer/openfeign/timeout")
    public String timeout(){
        return paymentOpenFeignService.timeout();

    }
}
