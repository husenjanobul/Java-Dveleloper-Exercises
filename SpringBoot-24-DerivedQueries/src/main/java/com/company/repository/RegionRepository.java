package com.company.repository;

import com.company.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends JpaRepository<Region,Integer> {

    //display all regions in canada
    List<Region> findByCountry(String country);
    List<Region> findAllByCountry(String country);

    //display all regions in canada without duplicate
    List<Region> findDistinctByCountry(String country);

    //display all regions with country name includes 'United'
    List<Region> findByCountryContaining(String country);

    //display all regions with country name includes 'United' in order
    List<Region> findByCountryContainingOrderByRegion(String country);

    //Display top 2 regions in Canada
    List<Region> findTop2ByCountry(String country);


}
