package com.interfaceboot.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class InterfaceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterfaceConsumerApplication.class, args);
        System.out.println("消费者启动完毕!");
    }
}