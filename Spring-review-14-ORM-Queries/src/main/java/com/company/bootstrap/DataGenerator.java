package com.company.bootstrap;

import com.company.repository.DepartmentRepository;
import com.company.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
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


    }
}
