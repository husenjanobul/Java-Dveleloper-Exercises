package com.company.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.company")
//or
@ComponentScan("com.company")
public class EmployeeConfig {
}
