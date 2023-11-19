package com.compny.controller;

import com.compny.bootstrap.DataGenerator;
import com.compny.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String createEmployee(Model model){

        model.addAttribute("employee",new Employee());
        model.addAttribute("states", DataGenerator.getStateList());

        return "employee/employee-create";
    }

}
