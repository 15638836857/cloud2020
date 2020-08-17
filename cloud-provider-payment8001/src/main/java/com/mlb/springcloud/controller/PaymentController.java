package com.mlb.springcloud.controller;

import com.mlb.springcloud.entities.CommonResult;
import com.mlb.springcloud.entities.Payment;
import com.mlb.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @className PaymentController
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/5/25 23:49
 * @Version 1.0
 */
@RestController
@Slf4j
@RequestMapping("payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;
    @Resource
    private DiscoveryClient discoveryClient;
    @PostMapping("create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        try {
            int result=paymentService.create(payment);
            if (result>0){
                return new CommonResult<Payment>(200,"添加成功"+serverPort,null);
            }else{
                return new CommonResult<Payment>(400,"添加失败",null);
            }

        }catch (Exception e){
            log.error(e.getMessage());
        }
        return null;
    }
    @GetMapping("get/{id}")
    public CommonResult<Payment> getId(@PathVariable("id") Long id){
        try {
            Payment result=paymentService.getPaymentByid(id);
             return new CommonResult<Payment>(200,"获取数据"+serverPort,result);

        }catch (Exception e){
            e.printStackTrace();
            log.error(e.getMessage());
        }
        return null;
    }
    @GetMapping("discovery")
    public Object getDiscoverClient(){
        List<String> services = discoveryClient.getServices();
        services.forEach(e->{
            log.info("element***=="+e);
        });
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        instances.forEach(e->{
            log.info(e.getServiceId()+"\t"+e.getHost()+"\t"+e.getPort()+"\t"+e.getUri());
        });
        return discoveryClient;
    }
    @GetMapping("/lb")
    public String getlb(){

        return serverPort;
    }
    @GetMapping("feign/timeout")
    public String timeout(){
        try {
            //openfign 默认等待1秒钟设置超时时间3
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }

}
