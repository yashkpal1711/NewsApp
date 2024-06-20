package com.NightShow.NewsApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("")
    public  String HealthCheckController(){
        return "Hello from the Night Show";
    }
}
