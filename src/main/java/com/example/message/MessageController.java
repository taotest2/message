package com.example.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@Slf4j
public class MessageController {
    private static final ArrayList<String> messages = new ArrayList<>();

    @GetMapping("/")
    public String getMessage() {
        log.info(messages.toString());
        return messages.toString();
    }

    @GetMapping("/message/{message}")
    public String getMessage(@PathVariable String message) {
        log.info(message);
        messages.add(message);
        return message;
    }
}
