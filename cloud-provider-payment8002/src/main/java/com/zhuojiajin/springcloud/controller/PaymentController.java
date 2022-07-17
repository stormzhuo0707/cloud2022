package com.zhuojiajin.springcloud.controller;

import com.zhuojiajin.springcloud.entities.CommonResult;
import com.zhuojiajin.springcloud.entities.Payment;
import com.zhuojiajin.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    public String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int i = paymentService.create(payment);
        log.info("****插入结果 : " + i);
        if (i > 0) {
            return new CommonResult(200, "插入数据库成功,serverPort:" + serverPort, i);
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("****获取的数据: " + paymentById);
        if (paymentById != null) {
            return new CommonResult(200, "查询成功,serverPort:" + serverPort, paymentById);
        } else {
            return new CommonResult(444, "查询失败，id=" + id, null);
        }
    }

}
