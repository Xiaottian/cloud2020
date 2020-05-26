package com.slasher.springcloud.service;

import com.slasher.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author jit
 * @date 2020/5/13
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
