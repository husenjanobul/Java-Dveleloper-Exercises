package com.company.configs;

import com.company.interfaces.ExtraSessions;
import com.company.services.Java;
import com.company.services.OfficeHours;
import com.company.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.company")
@PropertySource(("classpath:application.properties"))
public class CompanyAppConfig {

    @Bean
    public Java java(){
//        return new Java(officeHours());
        return new Java(extraSessions());
    }

    @Bean
    public Selenium selenium(){
        return new Selenium();
    }

//    @Bean
//    public OfficeHours officeHours(){
//        return new OfficeHours();
//    }

//    @Bean
    public ExtraSessions extraSessions(){
        return new OfficeHours();
    }
}
