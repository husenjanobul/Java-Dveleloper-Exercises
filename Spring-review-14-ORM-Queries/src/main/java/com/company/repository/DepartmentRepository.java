package com.company.repository;

import com.company.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, String> {

    //Display all departments in the furniture department
    List<Department> findByDepartment(String department);

    //Display all departments in the Health division
    List<Department> findByDivision(String division);
//    List<Department> findByDivisionIs(String division);  // same
//    List<Department> findByDivisionEquals(String division); // same


    //Display Top 3 departments with division name includes 'Hea' , without duplicate
    List<Department> findDistinctTop3ByDivisionContaining(String division);


    @Query("select d from Department d where d.division in ?1")
    List<Department> getDepartmentDivision(List<String> division);

}
