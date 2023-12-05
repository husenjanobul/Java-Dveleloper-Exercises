package com.company.bootstrap;

import com.company.repository.CourseRepository;
import com.company.repository.DepartmentRepository;
import com.company.repository.EmployeeRepository;
import com.company.repository.RegionRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private  final EmployeeRepository employeeRepository;

    private final CourseRepository courseRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, CourseRepository courseRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.courseRepository = courseRepository;
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

        System.out.println("employeeRepository.getEmployeeDetail() = " + employeeRepository.getEmployeeDetail());
        System.out.println("employeeRepository.getEmployeeSalary() = " + employeeRepository.getEmployeeSalary());
        System.out.println("employeeRepository.findByEmail(\"jcolumj@pen.io\") = " + employeeRepository.findByEmail("amcnee1@google.es").toString());
        System.out.println("employeeRepository.findByFirstNameAndLastNameAndEmailNotNull(\"Zane\") = " + employeeRepository.findByFirstNameAndLastNameOrEmail("Zane","Breem","amcnee1@google.es").toString());

        System.out.println("------------------- Employee End -----------------");


        System.out.println("------------------- Course Start -----------------");

        System.out.println("courseRepository.findByCategory(\"Spring\") = " + courseRepository.findByCategory("Spring")); //or
        courseRepository.findByCategory("Spring").forEach(System.out::println);
        System.out.println("===============================");
        courseRepository.findByCategoryOrderByName("Spring").forEach(System.out::println);
        System.out.println("courseRepository.existsByName(\"MVC\") = " + courseRepository.existsByName("MVC"));
        System.out.println("courseRepository.countByCategory(\"Spring\") = " + courseRepository.countByCategory("Spring"));
        System.out.println("courseRepository.findByNameStartsWith(\"Getting\") = " + courseRepository.findByNameStartsWith("Getting"));
        System.out.println("===============================");
        courseRepository.streamByCategory("Spring").forEach(System.out::println);

        System.out.println("------------------- Course End -----------------");


    }
}
