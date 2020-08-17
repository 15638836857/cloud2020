package com.mlb.springcloud.controller;

import cn.hutool.core.util.IdUtil;
import com.mlb.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @className PaymentController
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/6/11 23:02
 * @Version 1.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
  private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;
    @GetMapping("payment/hystrix/ok/{id}")
    public String PaymentInfo_ok(@PathVariable("id")Integer id) {
        String result = paymentService.paymentInfo_ok(id);
        log.info("******result**" + result);
        return result;
    }
    @GetMapping("payment/hystrix/timeout/{id}")
    public String PaymentInfo_timeout(@PathVariable("id")Integer id) {
        String result = paymentService.paymentInfo_timeout(id);
        log.info("******result**" + result);
        return result;
    }
    @GetMapping("payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id")Integer id) {
        String result = paymentService.paymentCircuitBreaker(id);
        log.info("******result**" + result);
        return result;
    }
}

