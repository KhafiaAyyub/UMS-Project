package com.ums.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello-ums")
    public String hello() {
        return "UMS project is running successfully!";
    }
}