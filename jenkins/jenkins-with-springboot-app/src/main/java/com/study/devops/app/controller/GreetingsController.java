package com.study.devops.app.controller;


import com.study.devops.app.response.GreetingResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greetings")
public class GreetingsController {

    @GetMapping("/hello")
    public ResponseEntity<GreetingResponse> greetings() {
        return new ResponseEntity<>(new GreetingResponse("Hello from DevOps Application - Jenkins!"), HttpStatus.OK);
    }
}
