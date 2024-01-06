package com.surya.springboot.demo.myinitialapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String hello(){
        return "Hello World!";
    }
}
