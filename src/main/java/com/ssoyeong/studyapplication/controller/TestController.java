package com.ssoyeong.studyapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test/hello")
    public String getHello() {
        return "Hello world!";
    }

    @GetMapping("/test/greeting")
    public String getGreetingQueryString(@RequestParam String name) {
        return String.format("Hello, %s!", name);
    }

    @GetMapping("/test/greeting/{name}")
    public String getGreetingPathVariable(@PathVariable String name) {
        return String.format("Hello, %s!", name);
    }
}
