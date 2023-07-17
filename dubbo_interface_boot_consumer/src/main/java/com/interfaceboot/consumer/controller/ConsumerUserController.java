package com.interfaceboot.consumer.controller;

import com.interfaceboot.api.entity.User;
import com.interfaceboot.api.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
@Slf4j
public class ConsumerUserController {

    @DubboReference
    private IUserService userService;

    /**
     * http://localhost:8012/consumer/selectUserById/1
     * @param id
     * @return
     */
    @RequestMapping("/selectUserById/{id}")
    public User getUser(@PathVariable("id") Long id) {
        User user = userService.selectUserById(id);
        log.info("response from provider: {}", user);
        return user;
    }
}
