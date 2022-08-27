package com.comany;

import com.comany.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBoot24OrmDrivedQueriesApplication {

	@Autowired
	RegionRepository regionRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot24OrmDrivedQueriesApplication.class, args);
	}

	@PostConstruct
	public void testRegion(){
		System.out.println("-------------- start --------------");
		System.out.println("regionRepository = " + regionRepository.findByCountry("Canada"));
//		System.out.println("regionRepository = " + regionRepository.findDistinctByCountry("Country"));
		System.out.println("-------------- End --------------");
	}

}
