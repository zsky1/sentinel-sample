package com.fb.org.controller;

import com.fb.org.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/app")
public class AppController {


    @Autowired
    private IUserService userService;

    /**
     * 查询用户
     * @param id
     * @return
     */
    @GetMapping("/user")
    public Object test1(BigInteger id) {
        return userService.findById(id);
    }
}
