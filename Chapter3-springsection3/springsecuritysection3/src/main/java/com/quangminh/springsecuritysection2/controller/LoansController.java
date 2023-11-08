package com.quangminh.springsecuritysection2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    @GetMapping("/myLoans")
    public ResponseEntity<?> getLoanDetails(){
        return new ResponseEntity<>("Here are the loan details from DB", HttpStatus.OK);
    }
}
