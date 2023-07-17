package com.boot.controller;


import com.boot.service.ComUserService;
import com.boot.service.impl.ComUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {


    @Autowired
    private ComUserService userServiceImpl;

    /**
     * http://localhost:8002/consumer/hello
     * @return
     */
    @GetMapping("/hello")
    public String Hello() {
        return userServiceImpl.getName();
    }
}
