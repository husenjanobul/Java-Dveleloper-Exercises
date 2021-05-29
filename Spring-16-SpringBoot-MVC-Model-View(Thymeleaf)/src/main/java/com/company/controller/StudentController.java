package com.company.controller;

import com.company.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","husenjan");
        model.addAttribute("course","dev");

        String subject = "MVC";
        model.addAttribute("subject",subject);

        Random random = new Random();
        int num1 =random.nextInt(1000);
        model.addAttribute("id",num1);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        model.addAttribute("num",numbers);

//        print birthday
        LocalDate birthday = LocalDate.now().minusYears(33);
        model.addAttribute("birthday",birthday);


        Student student = new Student(1,"husenjan","obul");
        model.addAttribute("student",student);


        return "student/welcome";
    }


    @GetMapping("/register")
    public String homePage2(){
        return "student/register";
    }


}
