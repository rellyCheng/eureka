package com.relly.eurekaclient.controller;

import com.relly.eurekaclient.client.ActivitiClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/activiti/")
public class ActivitiController {
    @Resource
    private ActivitiClient activitiClient;
    @RequestMapping("test")
    public String getTest(){
        return activitiClient.getTest();
    }
}
