package com.boot.service.impl;

import com.boot.service.ComUserService;
import com.boot.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class ComUserServiceImpl implements ComUserService {

    @DubboReference
    private UserService userService;

    @Override
    public String getName() {
        String name = userService.getName();
        System.out.println("Name: " + name);
        return name;
    }
}

