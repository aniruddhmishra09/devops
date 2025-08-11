package com.study.devops.app.controller;

import com.study.devops.app.response.GreetingResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoRestController {

    @GetMapping("/greet")
    public GreetingResponse greet() {
        // Dummy data for demonstration
        return new GreetingResponse("Greeting from DevOps Application!");
    }
}
