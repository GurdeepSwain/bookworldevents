package com.bookworld.booking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {
    @GetMapping("/")
    public String home() {
        return "Booking service running";
    }
}
