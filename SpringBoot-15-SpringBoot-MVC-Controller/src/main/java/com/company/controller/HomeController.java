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

    @RequestMapping("/husenjan")
    public String getRequestMapping2(){
        return "person";
    }

//    @RequestMapping(method = RequestMethod.GET,value = "/husenjan")
//    public String getRequestMapping3(){
//        return "person";
//    }

    @GetMapping( "/husenjan")
    public String getRequestMapping4(){
        return "person";
    }

//    @PostMapping( "/husenjan")
//    public String postRequestMapping(){
//        return "person";
//    }

    @GetMapping("/home/{name}")
    public String pathVariable(@PathVariable("name") String name){
        System.out.println("name is: " + name);
        return "home";
    }

    @GetMapping("/home/{name}/{email}")
    public String pathVariable2(@PathVariable("name") String name,@PathVariable("email") String email){
        System.out.println("name is: " + name);
        System.out.println("email is: " + email);
        return "home";
    }

    @GetMapping("/home/course")
    public String requestMapping(@RequestParam("course") String name){
        System.out.println("name is: " +name);
        return "home";
    }
    @GetMapping("/course")
    public String requestMapping2(@RequestParam(value = "course",required = false,defaultValue = "company") String name){
        System.out.println("name is: " +name);
        return "home";
    }


}
