package com.compny.controller;

import com.compny.bootstrap.DataGenerator;
import com.compny.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String createEmployee(Model model){

        model.addAttribute("employee",new Employee());
        model.addAttribute("states", DataGenerator.getStateList());

        return "employee/employee-create";
    }

    @PostMapping("/list")
    public String registerEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult, Model model){

        if (bindingResult.hasErrors()){
            model.addAttribute("states", DataGenerator.getStateList());

            return "employee/employee-create";
        }

        DataGenerator.saveEmployee(employee);

        model.addAttribute("employees",DataGenerator.readAllEmployee());


        return "employee/employee-list";
    }

}
