package com.nfsq.yqf.testdubbo.service;

import api.friendservice.FriendService;
import bean.Friend;
import bean.NFResult;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class FriendConsumerService {
    @Reference
    FriendService friendService;
    public NFResult<Friend> getFriend(String friendName){
        return friendService.selectFriend(friendName);
    }
}
