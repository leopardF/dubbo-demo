package com.interfacexml.consumer.service.impl;

import com.interfacexml.api.entity.User;
import com.interfacexml.api.service.IUserService;
import com.interfacexml.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsumerServiceImpl {

    @Autowired
    private IUserService userService;

    public User selectUserById(Long id) {
        return userService.selectUserById(id);
    }
}
