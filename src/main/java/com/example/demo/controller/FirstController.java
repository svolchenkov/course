package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    //cf map-route RegieSergey cfapps.io --hostname regiesergeyblue

    @GetMapping("/test")
    public  ResponseEntity<String> test() {



        return ResponseEntity.status(HttpStatus.OK)
                .body("test-blue");
    }

}
