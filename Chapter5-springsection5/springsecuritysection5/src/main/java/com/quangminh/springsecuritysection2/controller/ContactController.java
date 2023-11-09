package com.quangminh.springsecuritysection2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @GetMapping("/contact")
    public ResponseEntity<?> saveContactInquiryDetails(){
        return new ResponseEntity<>("Inquiry details are saved to the DB", HttpStatus.OK);
    }
}
