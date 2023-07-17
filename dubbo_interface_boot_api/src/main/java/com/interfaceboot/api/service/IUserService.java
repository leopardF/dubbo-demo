package com.interfaceboot.api.service;

import com.interfaceboot.api.entity.User;

public interface IUserService {

    User selectUserById(Long id);
}
