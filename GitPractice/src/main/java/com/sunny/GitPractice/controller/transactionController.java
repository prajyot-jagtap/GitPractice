package com.sunny.GitPractice.controller;

import com.sunny.GitPractice.model.transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class transactionController {

    @Autowired
    private transaction transaction1;

    @GetMapping("/home")
    public String welcomeApi(){

        return "Welcome to my transaction management application\nBy Sunny :)";
    }

    @PostMapping("/postTransaction")
    public transaction createTransaction(@RequestBody transaction transaction1){

        System.out.println("Business -> " + transaction1.getBusiness());
        System.out.println("Desc -> " + transaction1.getDesc());
        System.out.println("Date -> " + transaction1.getDate());
        System.out.println("Amount -> " + transaction1.getAmount());
        return transaction1;
    }
}
