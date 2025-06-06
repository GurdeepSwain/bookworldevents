package com.bookworld.event;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
    @GetMapping("/")
    public String home() {
        return "Event service running";
    }
}
