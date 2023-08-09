package com.luve2code.springboot.thymeleafdemo.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {
    @GetMapping("/api")
    public String sayHello(Model theModel){
        theModel.addAttribute("theDate", new java.util.Date());
        return "helloworld";
    }
}
