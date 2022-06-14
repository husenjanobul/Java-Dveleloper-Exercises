package com.company;

import com.company.entity.Car;
import com.company.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBoot18OrmTableCreationApplication {

	@Autowired
	CarRepository carRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot18OrmTableCreationApplication.class, args);
	}


	@PostConstruct
	public void dataInit(){

		Car car = new Car("BMW","M5");
		Car car2 = new Car("Hyunday","1.3");
		Car car3 = new Car("Mercedes","5000");

		carRepository.save(car);
		carRepository.save(car2);
		carRepository.save(car3);

	}

}
