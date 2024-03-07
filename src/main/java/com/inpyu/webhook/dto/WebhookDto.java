package com.inpyu.webhook.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WebhookDto {

    @Getter
    public static class Repository{

        @JsonProperty("login")
        private String id;

        @JsonProperty("name")
        private String repoName;

        @JsonProperty("clone_url")
        private String cloneUrl;

        public Repository(String id, String repoName, String cloneUrl){
            this.id = id;
            this.repoName = repoName;
            this.cloneUrl = cloneUrl;
        }
    }



}
