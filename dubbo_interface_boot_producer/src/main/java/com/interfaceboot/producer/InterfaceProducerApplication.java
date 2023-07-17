package com.interfaceboot.producer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
@MapperScan("com.interfaceboot.producer.mapper")
public class InterfaceProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterfaceProducerApplication.class,args);
        System.out.println("生产者启动完毕");
    }
}
