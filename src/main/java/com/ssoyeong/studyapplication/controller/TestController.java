package com.ssoyeong.studyapplication.controller;

import com.ssoyeong.studyapplication.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
    private static final String GREETING_MESSAGE = "Hello, %s!";

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
    public ResponseEntity<UserDto> postGreetingRequestBody(@RequestBody UserDto requestUserDto) {
        UserDto responseUserDto = new UserDto(requestUserDto.name(), requestUserDto.age());
        return ResponseEntity.ok(responseUserDto);
    }
}
