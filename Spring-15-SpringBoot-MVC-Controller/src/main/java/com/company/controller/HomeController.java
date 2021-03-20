package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

//    @RequestMapping
    //or
    @RequestMapping("/")
    public String getRequestMapping(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/husenjan")
    public String getRequestMapping1(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.POST,value = "/obul")
    public String getRequestMapping2(){
        return "home";
    }

//    @GetMapping("/spring")
//    public String getMapping(){
//        return "home";
//    }

    @PostMapping("/spring")
    public String postMapping(){
        return "home";
    }

    @GetMapping("/home/{name}")
    public String pathVariable(@PathVariable String name){
        System.out.println("name = " + name);
        return "home";
    }

    @GetMapping("/home/{name}/{email}")
    public String pathVariable(@PathVariable String name,@PathVariable String email){
        System.out.println("name = " + name);
        System.out.println("email = " + email);
        return "home";
    }

}
