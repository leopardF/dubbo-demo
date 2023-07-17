package com.interfaceboot.producer.service.impl;

import com.interfaceboot.api.entity.User;
import com.interfaceboot.api.service.IUserService;
import com.interfaceboot.producer.mapper.UserMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

@DubboService
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public User selectUserById(Long id) {
        User user = userMapper.selectUserById(id);
        return user;
    }
}
