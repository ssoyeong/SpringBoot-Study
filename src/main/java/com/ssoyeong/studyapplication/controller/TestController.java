package com.ssoyeong.studyapplication.controller;

import com.ssoyeong.studyapplication.dto.UserDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
    private static final String GREETING_MESSAGE = "Hello, %s!";
    private static final String AGE_MESSAGE = "You're %d years old";

    @GetMapping("/hello")
    public String getHello() {
        return "Hello world!";
    }

    @GetMapping("/greeting")
    public String getGreetingQueryString(@RequestParam String name) {
        return GREETING_MESSAGE.formatted(name);
    }

    @GetMapping("/greeting/{name}")
    public String getGreetingPathVariable(@PathVariable String name) {
        return GREETING_MESSAGE.formatted(name);
    }

    @PostMapping("/greeting")
    public String postGreetingRequestBody(@RequestBody UserDto userDto) {
        return GREETING_MESSAGE.formatted(userDto.name()) + " " + AGE_MESSAGE.formatted(userDto.age());
    }
}
