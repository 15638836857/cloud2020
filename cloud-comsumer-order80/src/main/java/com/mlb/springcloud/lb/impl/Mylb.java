package com.mlb.springcloud.lb.impl;

import com.mlb.springcloud.lb.LoadBalanced;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @className Mylb
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/6/6 0:19
 * @Version 1.0
 */
@Component
public class Mylb implements LoadBalanced {
    private AtomicInteger atomicInteger=new AtomicInteger(0);
    public final int getAndIncrement(){
        int current;
        int next;
            do {
                current=this.atomicInteger.get();
                next=current>=2147483647?0:current+1;

        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("*******第几次访问next="+next);
  return next;
    }
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstanceList) {
        int index =getAndIncrement()%serviceInstanceList.size();
        return serviceInstanceList.get(index);
    }
}
