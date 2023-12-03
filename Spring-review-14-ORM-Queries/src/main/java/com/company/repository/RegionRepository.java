package com.company.repository;

import com.company.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, String> {

    //display all regions in Canada
    List<Region> findByCountry(String country);

    //display all regions in Canada, without duplicates
    List<Region> findDistinctByCountry(String country);

    //display all regions with county name includes 'United'
    List<Region> findByCountryContaining(String country);

    //display all regions with county name includes 'Asia' in order
    List<Region> findByCountryContainingOrderByCountry(String country);

    //display top 2 regions in 'Canada'
    List<Region> findTop2ByCountry(String country);


}
