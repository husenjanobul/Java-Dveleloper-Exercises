package com.company.bootstrap;

import com.company.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;

    public DataGenerator(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("------------------- Region Start -----------------");
        System.out.println("regionRepository.findByCountry(\"Canada\") = " + regionRepository.findByCountry("Canada").toString());

        System.out.println("------------------- Region Start -----------------");



    }
}
