package com.interfacexml.consumer;

import com.interfacexml.api.entity.User;
import com.interfacexml.api.service.IUserService;
import com.interfacexml.consumer.service.ConsumerService;
import com.interfacexml.consumer.service.impl.ConsumerServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

//在client项目中通过Spring配置引用远程服务，加载spring配置，创建client启动类，并实现客户端的远程调用
public class ClientApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();
//        IUserService userService = (IUserService)context.getBean("userService");
//        User user = userService.selectUserById(1L);
        ConsumerServiceImpl consumerServiceImpl = context.getBean(ConsumerServiceImpl.class);
        User user = consumerServiceImpl.selectUserById(1L);
        System.out.println(user);
    }
}
