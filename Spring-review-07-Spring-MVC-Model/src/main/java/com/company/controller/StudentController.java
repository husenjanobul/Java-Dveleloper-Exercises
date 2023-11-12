package com.company.controller;

import com.company.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","Husenjan");
        model.addAttribute("course","MVC");

        String subject = "Collections";
        model.addAttribute("subject",subject);

        int studentId = new Random().nextInt(1000);
        model.addAttribute("id",studentId);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(14);
        numbers.add(23);
        numbers.add(54);
        numbers.add(7);
        model.addAttribute("numbers",numbers);

        Student student = new Student(1,"Husenjan","Obul");
        model.addAttribute("student",student);

        return "/student/welcome";
    }

}
