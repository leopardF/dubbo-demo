package com.interfacexml.consumer.service;

import com.interfacexml.api.entity.User;

public interface ConsumerService {

    User selectUserById(Long id);
}
