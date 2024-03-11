package com.inpyu.webhook.controller;

import com.inpyu.webhook.dto.WebhookDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

    @PostMapping("/webhook/githubApp")
    public void parseGithubWebhook(@RequestBody String data){
        System.out.println("data : " + data);
    }

    @PostMapping("/webhook")
    public void parseWebhook(@RequestBody WebhookDto response){
        System.out.println("ref : " + response.getPullRequest().getHead().getRef());
        System.out.println("user name : " + response.getRepository().getOwner().getUser());
        System.out.println("repository name : " + response.getRepository().getName());
    }
}
