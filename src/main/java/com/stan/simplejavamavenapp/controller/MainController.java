package com.stan.simplejavamavenapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {

    @GetMapping("index")
    public String index() {
        System.out.println("这是最近更改了@");
        return "Index";
    }
}
