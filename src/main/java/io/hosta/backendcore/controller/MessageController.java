package io.hosta.backendcore.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/message")
public class MessageController {

    private String content = "hello";

    @GetMapping("/get")
    public String getMessage() {
        return content + "\n";
    }

    @PostMapping("/post")
    public String changeMessage(@RequestBody String newContent) {
        content = newContent;
        return content + "\n";
    }
}