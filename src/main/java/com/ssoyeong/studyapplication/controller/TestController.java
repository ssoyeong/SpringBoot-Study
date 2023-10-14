package com.ssoyeong.studyapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test/hello")
    public String getHello() {
        return "Hello world!";
    }

    @GetMapping("/test/greeting")
    public String getGreeting(@RequestParam String name) {
        return "Hello, " + name + "!";
    }
}
