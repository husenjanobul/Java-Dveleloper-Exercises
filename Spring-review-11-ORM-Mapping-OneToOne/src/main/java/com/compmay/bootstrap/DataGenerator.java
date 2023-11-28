package com.compmay.bootstrap;

import com.compmay.repository.DepartmentRepository;
import com.compmay.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    DepartmentRepository departmentRepository;
    EmployeeRepository employeeRepository;

    public DataGenerator(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
