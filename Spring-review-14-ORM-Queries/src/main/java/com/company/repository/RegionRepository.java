package com.company.repository;

import com.company.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, String> {

    //display all regions in Canada
    List<Region> findByCountry(String country);


}
