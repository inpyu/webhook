package com.inpyu.webhook.controller;

import com.inpyu.webhook.dto.WebhookDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

    @PostMapping("/webhook")
    public void parseWebhook(@RequestBody WebhookDto.Repository response){
        System.out.println("Github id : " + response.getId());
        System.out.println("repository name : " + response.getRepoName());
        System.out.println("repository clone url: " + response.getCloneUrl());
    }

}
