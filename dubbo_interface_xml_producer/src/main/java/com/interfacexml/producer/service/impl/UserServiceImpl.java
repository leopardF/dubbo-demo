package com.interfacexml.producer.service.impl;

import com.interfacexml.api.entity.User;
import com.interfacexml.api.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

//在server项目中实现该远程服务接口
public class UserServiceImpl implements IUserService {

    public User selectUserById(Long id) {
        User user = new User();
        user.setId(id);
        user.setUsername("test user-" + id);
        return user;
    }
}
