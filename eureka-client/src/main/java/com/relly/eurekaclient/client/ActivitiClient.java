package com.relly.eurekaclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "activiti-client")
public interface ActivitiClient {

    @RequestMapping(value = "/test/test")
    String getTest();
}
