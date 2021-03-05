package com.company;

import com.company.calculator.Calculator;
import com.company.enums.City;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CompanyLabApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext container = SpringApplication.run(CompanyLabApplication.class, args);

		Calculator calculator = container.getBean("calculator",Calculator.class);
		System.out.println(calculator.getTotalCarpetCost(City.DULLES));


	}

}
