package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

//    @RequestMapping
    //or
    @RequestMapping("/")
    public String getRequestMapping(){
        return "home";
    }

    @RequestMapping("/husenjan")
    public String getRequestMapping2(){
        return "person";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/husenjan")
    public String getRequestMapping3(){
        return "person";
    }

    @GetMapping( "/husenjan")
    public String getRequestMapping4(){
        return "person";
    }

    @PostMapping( "/husenjan")
    public String postRequestMapping(){
        return "person";
    }


}
