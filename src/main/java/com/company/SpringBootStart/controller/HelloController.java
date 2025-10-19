package com.company.SpringBootStart.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController {

//    @RequestMapping(value = "/" , method = RequestMethod.GET)
    @GetMapping("/")
    public String helloWorld(){
        return "Welcome to the Hello World Program";
    }

}
