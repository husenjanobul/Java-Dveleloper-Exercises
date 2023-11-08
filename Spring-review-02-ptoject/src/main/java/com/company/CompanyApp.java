package com.company;


import com.company.config.EmployeeConfig;
import com.company.repository.HoursRepository;
import com.company.service.SalaryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CompanyApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(EmployeeConfig.class);

        SalaryService salaryService = container.getBean(SalaryService.class);
        salaryService.calculateRegularSalary();

        HoursRepository hoursRepository = container.getBean(HoursRepository.class);
        System.out.println(hoursRepository.getHours());
    }

}
