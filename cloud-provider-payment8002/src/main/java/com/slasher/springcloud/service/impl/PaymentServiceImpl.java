package com.slasher.springcloud.service.impl;

import com.slasher.springcloud.dao.PaymentDao;
import com.slasher.springcloud.entities.Payment;
import com.slasher.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jit
 * @date 2020/5/13
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
