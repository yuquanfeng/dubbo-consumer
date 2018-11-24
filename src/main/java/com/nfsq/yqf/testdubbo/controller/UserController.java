package com.nfsq.yqf.testdubbo.controller;

import bean.NFResult;
import bean.User;
import com.nfsq.yqf.testdubbo.service.UserConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserConsumerService userConsumerService;
    @RequestMapping("/user")
    public NFResult<User> getUser(String userName){
        return userConsumerService.getUser(userName);
    }
}
