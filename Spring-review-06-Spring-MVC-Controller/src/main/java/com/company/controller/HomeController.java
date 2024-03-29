package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        return "home.html";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome.html";
    }

    @RequestMapping("/") //or
//    @RequestMapping
    public String defaultPage(){
        return "welcome.html";
    }

}
