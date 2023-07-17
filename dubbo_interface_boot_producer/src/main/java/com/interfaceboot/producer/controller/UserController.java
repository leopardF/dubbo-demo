package com.interfaceboot.producer.controller;

import com.interfaceboot.api.entity.User;
import com.interfaceboot.api.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
@AllArgsConstructor
public class UserController {

    //    @Autowired
//    private IUserService userService;
    private final IUserService userService;

    /**
     * http://localhost:8011/provider/selectUserById/1
     * @param id
     * @return
     */
    @RequestMapping("/selectUserById/{id}")
    public User selectUserById(@PathVariable("id")Long id){
        return userService.selectUserById(id);
    }
}