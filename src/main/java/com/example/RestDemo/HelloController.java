package com.example.RestDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @RequestMapping("/")
    public String greet(){
        return "Hello World";
    }
    @RequestMapping("/message")
    public String message()
    {
        return "Develop Skills and improve knowledge by building projects";
    }

    public String function()
    {
        return "Talkative and improve speaking skills";
    }



}
