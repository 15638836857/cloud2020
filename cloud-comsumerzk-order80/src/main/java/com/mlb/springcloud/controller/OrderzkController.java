package com.mlb.springcloud.controller;

import com.mlb.springcloud.entities.CommonResult;
import com.mlb.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @className OrderController
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/5/27 23:34
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderzkController {
//    private static  final  String PAYMENT_URL="http://localhost:8001";
    private static  final  String PAYMENT_URL="http://cloud-payment-service";
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/consumer/payment/zk")
    public String getPayment(){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/zk/",String.class);
    }
}
