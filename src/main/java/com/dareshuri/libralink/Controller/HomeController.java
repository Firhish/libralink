package com.dareshuri.libralink.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HomeController {

    @GetMapping
    public String displayGreeting(){
        return "Hello and welcome to LibraLink";
    }
    
}
