package com.quangminh.springsecuritysection2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {
    @GetMapping("/notices")
    public ResponseEntity<?> getNotices(){
        return new ResponseEntity<>("Notices details from DB", HttpStatus.OK);
    }
}
