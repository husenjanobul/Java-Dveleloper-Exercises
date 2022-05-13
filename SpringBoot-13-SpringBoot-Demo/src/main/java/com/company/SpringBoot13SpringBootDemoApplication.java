package com.company;

import com.company.interfaces.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot13SpringBootDemoApplication {

    public static void main(String[] args) {

       ApplicationContext container = SpringApplication.run(SpringBoot13SpringBootDemoApplication.class, args);

        Course course = container.getBean("java",Course.class);
        course.getTeachingHours();
    }

}
