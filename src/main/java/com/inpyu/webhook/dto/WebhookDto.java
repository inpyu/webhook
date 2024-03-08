package com.inpyu.webhook.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class WebhookDto {
    private Head head;

    private Repository repository;

    @Getter
    public static class Head{
        private String ref;
    }


    @Getter
    public static class Repository{

        private Owner owner;

        @Getter
        public static class Owner{
            @JsonProperty("repos_url")
            private String repoUrl;

            public Owner(String repoUrl){
                this.repoUrl = repoUrl;
            }
        }
    }



}
