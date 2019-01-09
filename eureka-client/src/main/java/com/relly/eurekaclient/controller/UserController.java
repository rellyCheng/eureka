package com.relly.eurekaclient.controller;

import com.relly.eurekaclient.client.UserClient;
import com.relly.eurekaclient.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user/")
public class UserController {

    @Resource
    private UserClient userClient;

    @RequestMapping(value = "/getuserinfo", method = RequestMethod.GET)
    public User getuserinfo() {
        return userClient.getuserinfo();
    }

    @RequestMapping(value = "/getuserinfostr", method = RequestMethod.GET)
    public String getuserinfostr() {
        return userClient.getuserinfostr();
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String info() {
        return userClient.info();
    }
}
