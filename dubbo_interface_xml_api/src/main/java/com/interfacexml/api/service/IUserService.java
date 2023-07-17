package com.interfacexml.api.service;

import com.interfacexml.api.entity.User;

public interface IUserService {

    User selectUserById(Long id);
}
