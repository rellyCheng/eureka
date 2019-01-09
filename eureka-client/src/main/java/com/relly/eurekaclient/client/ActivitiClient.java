package com.relly.eurekaclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "activiti-client")
public interface ActivitiClient {
    @RequestMapping(
            value = "/test/test",
            method = RequestMethod.GET
    )
    String getTest();
}
