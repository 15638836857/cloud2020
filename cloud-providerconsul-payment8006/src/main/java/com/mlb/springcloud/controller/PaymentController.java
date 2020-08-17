package com.mlb.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @className PaymentController
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/6/4 22:49
 * @Version 1.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/consul")
    public String paymentConsul() {
        return "springcloud with consul:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
