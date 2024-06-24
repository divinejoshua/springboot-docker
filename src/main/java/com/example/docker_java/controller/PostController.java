package com.example.docker_java.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class PostController {


    public PostController() {
    }

    @GetMapping("/user")
    public ResponseEntity<HashMap<String, String>> getUserDetails() {
        HashMap<String, String> userDetails = new HashMap<>();
        userDetails.put("name", "Alice");
        userDetails.put("email", "alice@example.com");
        userDetails.put("age", "28");
        System.out.println("Worked");

        return new ResponseEntity<>(userDetails, HttpStatus.OK);
    }

}