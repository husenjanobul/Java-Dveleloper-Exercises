package com.company.controller;

import com.company.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","Husenjan");
        model.addAttribute("gender","male");

        int age = 33;
        model.addAttribute("age",age);

        int studentId = new Random().nextInt(1000);
        model.addAttribute("id",studentId);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);
        model.addAttribute("numbers",numbers);

        Student student = new Student(1,"Husenjan","Obul");
        model.addAttribute("student",student);



        return "student/welcome";
    }
}
