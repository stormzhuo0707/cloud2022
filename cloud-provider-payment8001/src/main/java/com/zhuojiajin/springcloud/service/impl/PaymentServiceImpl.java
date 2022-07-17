package com.zhuojiajin.springcloud.service.impl;

import com.zhuojiajin.springcloud.dao.PaymentDao;
import com.zhuojiajin.springcloud.entities.Payment;
import com.zhuojiajin.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
