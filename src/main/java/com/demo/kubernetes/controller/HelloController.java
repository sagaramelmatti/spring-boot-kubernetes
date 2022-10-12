package com.demo.kubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/")
    public String displayMessage(){
        return "Congratulation you successfully deployed your application to kubernetes !!";
    }
}
