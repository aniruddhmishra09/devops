package com.study.devops.app.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(GreetingsController.class)
class GreetingsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void greetings_ReturnsGreetingResponse() throws Exception {
        mockMvc.perform(get("/api/greetings/hello"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Hello from DevOps Application - Jenkins!"));
    }
}