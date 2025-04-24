package com.hamzath.Library_Management_System.controller;

import com.hamzath.Library_Management_System.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("booking")
public class BookingController {
    @Autowired
    BookingService bookingService;

    @PostMapping("/rent")
    public ResponseEntity<String> rentABook(@RequestParam Integer userId, @RequestParam Integer bookId) {
        return bookingService.rentABook(userId, bookId);
    }
}
