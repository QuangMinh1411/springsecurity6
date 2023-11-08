package com.quangminh.springsecuritysection2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/myAccount")
    public ResponseEntity<?> getAccountDetails(){
        return new ResponseEntity<>("Here are account details", HttpStatus.OK);
    }
}
