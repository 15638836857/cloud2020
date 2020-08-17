package com.mlb.springcloud.service;

import com.mlb.springcloud.entities.Payment;

/**
 *
 */
public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentByid(Long id);
}
