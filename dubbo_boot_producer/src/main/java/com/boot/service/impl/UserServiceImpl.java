package com.boot.service.impl;

import com.boot.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class UserServiceImpl implements UserService {

    @Override
    public String getName() {
        return "John Doe22";
    }
}
