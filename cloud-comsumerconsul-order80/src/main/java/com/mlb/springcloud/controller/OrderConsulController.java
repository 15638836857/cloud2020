package com.mlb.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @className OrderConsulController
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/6/4 23:04
 * @Version 1.0
 */
@RestController
public class OrderConsulController {
    private static  final  String PAYMENT_URL="http://consul-provider-payment";
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/consumer/payment/consul")
    public String getPayment(){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/consul/",String.class);
    }
}
