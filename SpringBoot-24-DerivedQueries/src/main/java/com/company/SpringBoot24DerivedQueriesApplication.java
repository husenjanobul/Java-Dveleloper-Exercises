package com.company;

import com.company.repository.DepartmentRepository;
import com.company.repository.EmployeeRepository;
import com.company.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBoot24DerivedQueriesApplication {

    @Autowired
    RegionRepository regionRepository;
    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot24DerivedQueriesApplication.class, args);
    }

    @PostConstruct
    public void testRegions(){
        System.out.println("------------- Region start ----------");

        System.out.println("findByRegion = " + regionRepository.findByCountry("Canada"));
        System.out.println("findAllByCountry = " + regionRepository.findAllByCountry("Canada"));
        System.out.println("findDistinctByCountry = " + regionRepository.findDistinctByCountry("Canada"));
        System.out.println("findByCountryContaining = " + regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryContainingAndOrderByRegion = " + regionRepository.findByCountryContainingOrderByRegion("Canada"));
        System.out.println("findTop2ByCountry = " + regionRepository.findTop2ByCountry("Canada"));

        System.out.println("------------- Region end ----------");
    }

    @PostConstruct
    public void testDepartments(){

        System.out.println("---------Department start------------");

        System.out.println("findByDepartment: " + departmentRepository.findByDepartment("Toys"));
        System.out.println("findByDivision: " + departmentRepository.findByDivision("Outdoors"));
        System.out.println("findByDivisionEndingWith: " + departmentRepository.findByDivisionEndingWith("ics"));
        System.out.println("findDistinctTop3ByDivisionContains: " + departmentRepository.findDistinctTop3ByDivisionContains("Hea"));

        System.out.println("---------Department End------------");

    }

    @PostConstruct
    public void testEmployees(){

        System.out.println("---------Employee start------------");

        System.out.println(employeeRepository.findByEmailIsNull());


        System.out.println("---------Employee End------------");

    }


}
