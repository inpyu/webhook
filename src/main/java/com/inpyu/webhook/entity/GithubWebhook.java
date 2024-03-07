package com.inpyu.webhook.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity(name = "webhook")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GithubWebhook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "webhook_id")
    private Long id;

}
