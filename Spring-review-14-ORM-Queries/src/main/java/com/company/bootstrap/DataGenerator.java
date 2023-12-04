package com.company.bootstrap;

import com.company.repository.DepartmentRepository;
import com.company.repository.EmployeeRepository;
import com.company.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private  EmployeeRepository employeeRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("------------------- Region Start -----------------");
        System.out.println("regionRepository.findByCountry(\"Canada\") = " + regionRepository.findByCountry("Canada"));
        System.out.println("regionRepository.findDistinctByCountry(\"Canada\") = " + regionRepository.findDistinctByCountry("Canada"));
        System.out.println("regionRepository.findByCountryContaining(\"United\") = " + regionRepository.findByCountryContaining("United"));
        System.out.println("regionRepository.findByCountryContainingOrderByCountry(\"Asia\") = " + regionRepository.findByCountryContainingOrderByCountry("Asia"));
        System.out.println("regionRepository.findTop2ByCountry(\"Canada\") = " + regionRepository.findTop2ByCountry("Canada"));

        System.out.println("------------------- Region End -----------------");


        System.out.println("------------------- Department Start -----------------");

        System.out.println("departmentRepository.findByDepartment(\"Toys\") = " + departmentRepository.findByDepartment("Toys"));
        System.out.println("departmentRepository.findByDivision(\"Health\") = " + departmentRepository.findByDivision("Health"));
        System.out.println("departmentRepository.findDistinctTop3ByDivisionContaining(\"Hea\") = " + departmentRepository.findDistinctTop3ByDivisionContaining("Hea"));

        System.out.println("------------------- Department End -----------------");


        System.out.println("------------------- Employee Start -----------------");

        System.out.println("employeeRepository.findByEmail(\"jcolumj@pen.io\") = " + employeeRepository.findByEmail("amcnee1@google.es"));
        System.out.println("employeeRepository.findByFirstNameAndLastNameAndEmailNotNull(\"Zane\") = " + employeeRepository.findByFirstNameAndLastNameOrEmail("Zane","Breem","amcnee1@google.es"));

        System.out.println("------------------- Employee End -----------------");


    }
}