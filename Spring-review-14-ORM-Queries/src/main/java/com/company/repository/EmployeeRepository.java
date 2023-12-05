package com.company.repository;

import com.company.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    // Derive Query

    //Display all employees with email address ' '
    List<Employee> findByEmail(String email);

    //Display all employees with firstname ' ' and lastname '  ' , also show all employees with an email address
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstname,String lastname,String email);

    //Display all employees that first name is not ' '
    List<Employee> findByFirstNameIsNot(String firstName);

    //Display all employees where last name is starts with ' '
    List<Employee> findByLastNameStartingWith(String pattern);

    //Display all employees with salaries higher than ' '
    List<Employee> findBySalaryGreaterThan(Integer salary);

    //Display all employees with salaries less than ' ' (equal)
    List<Employee> findBySalaryLessThanEqual(Integer salary);

    //Display all employees that has been hired between ' ' and ' '
    List<Employee> findByHireDateBetween(LocalDate startDate,LocalDate endDate);

    //Display all employees with salaries greater than and equal to  ' ' in order (des)
    List<Employee> findBySalaryGreaterThanEqualOrderBySalaryDesc(Integer salary);

    //Display top 3 employees with salaries less than ' '
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);


    //Display ALL employees that do not have email address
    List<Employee> findByEmailIsNull();



    //JPQL Query
    @Query("SELECT e FROM Employee e WHERE e.email = 'amcnee1@google.es'")
    Employee getEmployeeDetail();

    @Query("select e.salary from Employee e where e.email = 'amcnee1@google.es'")
    Integer getEmployeeSalary();

    @Query("SELECT e FROM Employee e WHERE e.email = ?1")
    Optional<Employee> getEmployeeDetail(String email);

    @Query("SELECT e FROM Employee e WHERE e.email = ?1 and e.salary = ?2")
    Optional<Employee> getEmployeeDetail(String email,int salary);


    //Not equal
    @Query("select e from Employee e where e.salary <> ?1")
    List<Employee> getEmployeeSalaryNotEqual(int salary);

    //like, contains, startswtih, endwith
    @Query("select e from Employee e where e.firstName like ?1")
    List<Employee> getEmployeeFirstNameLike(String pattern);


    //less than
    @Query("select e from Employee e where e.salary < ?1")
    List<Employee> getEmployeeSalaryLessThan(int salary);

    //greater than
    @Query("select e from Employee e where e.salary > ?1")
    List<Employee> getEmployeeSalaryGreaterThan(int salary);

    //before
    @Query("select e from Employee e where e.hireDate > ?1")
    List<Employee> getEmployeeHireDateBefore(LocalDate date);

    //between
    @Query("select e from Employee e where e.salary between ?1 and ?2")
    List<Employee> getEmployeeSalary(int salary1,int salary2);

    //null
    @Query("select e from Employee e where e.email is null ")
    List<Employee> getEmployeeEmailIsNull();


    //not null
    @Query("select e from Employee e where e.email is not null ")
    List<Employee> getEmployeeEmailIsNotNull();

    //sorting in ascending order
    @Query("select e from Employee e order by e.salary")
    List<Employee> getEmployeeSalaryOrderAsc();

    //sorting in descending order
    @Query("select e from Employee e order by e.salary DESC ")
    List<Employee> getEmployeeSalaryOrderDesc();

    //
//    @Query("select e from Employee e where e.salary = ?1") //JPQL
    @Query(value = "select * from Employee where salary ?1",nativeQuery = true) //
    List<Employee> getEmployeeDetailBySalary(int salary);



    @Query("select e from Employee e where e.salary = :salary")
    List<Employee>  getEmployeeSalary(@Param("salary") int salary);


    @Modifying
    @Transactional
    @Query("update Employee e set e.email = 'admin@email.com' where e.id = :id" )
    void updateEmployeeJPQL(@Param("id") Long id);


    @Modifying
    @Transactional
    @Query(value = "update Employee set email = 'admin@email.com' where id = :id",nativeQuery = true )
    void updateEmployeeNativeQuery(@Param("id") Long id);



}
