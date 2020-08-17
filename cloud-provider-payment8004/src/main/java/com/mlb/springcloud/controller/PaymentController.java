package com.mlb.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @className PaymentController
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/6/1 23:34
 * @Version 1.0
 *
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/zk")
    public String paymentZk() {
            return "springcloud with zookeeper:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
