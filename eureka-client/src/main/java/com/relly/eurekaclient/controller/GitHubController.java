package com.relly.eurekaclient.controller;

import com.relly.eurekaclient.client.GitHubClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/github")
public class GitHubController {
    @Resource
    private GitHubClient gitHubClient;

    @RequestMapping(
            value = "/search/repositories",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    public String searchRepo(@RequestParam("q") String q) {
        return gitHubClient.searchRepo(q);
    }

}
