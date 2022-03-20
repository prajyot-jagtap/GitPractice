package com.sunny.GitPractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class transactionController {

    @GetMapping("/home")
    public String welcomeApi(){

        return "Welcome to my website";
    }
}
