package com.mlb.springcloud.dao;

import com.mlb.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @className PaymentDao
 * @Description TODO
 * @Autor 马凌冰
 * @Date 2020/5/25 23:29
 * @Version 1.0
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);
    Payment getPaymentByid(@Param("id") Long id);
}
