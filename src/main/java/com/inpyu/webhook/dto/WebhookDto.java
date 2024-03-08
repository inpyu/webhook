package com.inpyu.webhook.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class WebhookDto {
    @JsonProperty("pull_request")
    private PullRequest pullRequest;

    @JsonProperty("repository")
    private Repository repository;

    @Getter
    public static class PullRequest{
        private Head head;

        @Getter
        public static class Head{
            private String ref;

        }
    }


    @Getter
    public static class Repository{

        private String name;

        private Owner owner;

        @Getter
        public static class Owner{
            @JsonProperty("repos_url")
            private String repoUrl;

            @JsonProperty("login")
            private String user;
        }
    }



}
