package com.company.repository;

import com.company.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class DBEmployeeRepository implements EmployeeRepository {


    @Override
    public int getHourlyRate() {
        Employee employee = new Employee("Husenjan", "IT", 65);
        return employee.getHourlyRate();
    }
}
