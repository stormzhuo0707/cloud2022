package com.zhuojiajin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerZkMain80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerZkMain80.class, args);
    }
}
