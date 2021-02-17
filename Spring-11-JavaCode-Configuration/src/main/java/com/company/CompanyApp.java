package com.company;

import com.company.configs.CompanyAppConfig;
import com.company.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(CompanyAppConfig.class);

        Course course = container.getBean("java",Course.class);
        course.getTeachingHours();



    }

}
