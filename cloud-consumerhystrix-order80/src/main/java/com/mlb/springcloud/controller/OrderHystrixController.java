package com.mlb.springcloud.controller;

import com.mlb.springcloud.service.PaymentHystrixServie;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className PaymentHystrixController
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/6/12 23:06
 * @Version 1.0
 */
@RestController
@Slf4j
@RequestMapping
@DefaultProperties(defaultFallback = "paymen_gload_fallback")
public class OrderHystrixController {
    @Autowired
    private PaymentHystrixServie paymentHystrixServie;
    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String PaymentInfo_ok(@PathVariable("id")Integer id){
        return paymentHystrixServie.PaymentInfo_ok(id);
    }
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
//    @HystrixCommand(fallbackMethod = "paymentInfo_timeoutHandler",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value ="5000")})
   @HystrixCommand
    public String PaymentInfo_timeout(@PathVariable("id")Integer id){
        return paymentHystrixServie.PaymentInfo_timeout(id);
    }
    public String paymentInfo_timeoutHandler(Integer id){
        return "线程池 "+Thread.currentThread().getName()+" paymentInfo_timeout,Id  系统繁忙，稍后重试超时了"+id;
    }
    public String paymen_gload_fallback(){
        return "全局异常返回";
    }
}
