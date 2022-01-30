package com.example.cookieservice.controller;

import com.example.Message;
import com.example.cookieservice.controller.openfeign.ActivityClient;
import com.example.cookieservice.controller.openfeign.DecisionClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class CookieController {

    private final ActivityClient activityClient;
    private final DecisionClient decisionClient;

    public CookieController(ActivityClient activityClient, DecisionClient decisionClient) {
        this.activityClient = activityClient;
        this.decisionClient = decisionClient;
    }

    @Value("${spring.application.name}")
    private String serviceName;

    @GetMapping("/fortune")
    public Message getMessage() {
        return getfortune();
    }


    private Message getfortune() {
        var decision = decisionClient.getMsg().getMessage();
        var activity = activityClient.getMsg().getMessage();

        return new Message(serviceName, decision+" "+activity);
    }
}