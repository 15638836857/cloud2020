package com.mlb.springcloud.service.impl;

import com.mlb.springcloud.dao.PaymentDao;
import com.mlb.springcloud.entities.Payment;
import com.mlb.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @className PaymentServiceImpl
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/5/25 23:46
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentByid(Long id) {
        return paymentDao.getPaymentByid(id);
    }
}
