package com.compmay.repository;

import com.compmay.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository   //no need to write this annotation, spring high version knows this interface as a repository ( implements JpaRepository )
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
