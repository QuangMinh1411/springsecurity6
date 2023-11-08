package com.quangminh.springsecuritybasic.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WelcomeController {
    @GetMapping("/welcome")
    public ResponseEntity<?> sayWelcome(){
        return new ResponseEntity<>("Welcome to spring boot with security", HttpStatus.OK);
    }
}
