package com.example.Concroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class userConcroller {
    @RequestMapping("/hello")
    public String hello(){
        return "hello user";
    }
}
