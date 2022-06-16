package com.company;

import com.company.entity.Department;
import com.company.entity.Employee;
import com.company.enums.Gender;
import com.company.repository.DepartmentRepository;
import com.company.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringBoot19OrmMappingOneToOneApplication {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot19OrmMappingOneToOneApplication.class, args);
	}


}
