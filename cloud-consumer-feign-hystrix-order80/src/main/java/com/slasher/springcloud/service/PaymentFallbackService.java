package com.slasher.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author jit
 * @date 2020/5/26
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "------PaymentFallbackService fall back paymentInfo_OK------";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "------PaymentFallbackService fall back paymentInfo_TimeOut ------";
    }
}
