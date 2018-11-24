package com.nfsq.yqf.testdubbo.controller;

import bean.Friend;
import bean.NFResult;
import com.nfsq.yqf.testdubbo.service.FriendConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendController {
    @Autowired
    FriendConsumerService friendConsumerService;
    @RequestMapping("/friend")
    public NFResult<Friend> friend(String friendName){
        return friendConsumerService.getFriend(friendName);
    }
}
