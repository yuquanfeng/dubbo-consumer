package com.nfsq.yqf.testdubbo.service;

import api.userservice.UserService;
import bean.NFResult;
import bean.User;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class UserConsumerService {
    @Reference
    UserService userService;
    public NFResult<User> getUser(String userName){
        return userService.selectUser(userName);
    }
}
