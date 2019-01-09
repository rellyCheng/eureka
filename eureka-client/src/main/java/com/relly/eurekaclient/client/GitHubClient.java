package com.relly.eurekaclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "github-client", url = "https://api.github.com")
public interface GitHubClient {
    @RequestMapping(
            value = "/search/repositories",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    String searchRepo(@RequestParam("q") String q);

}
