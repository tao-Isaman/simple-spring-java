package com.example.springapi20220828.repository;

import com.example.springapi20220828.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeDataRepository extends JpaRepository<Employee, Integer> {

//    @Query("select e from Employee e where e.firstName =?1") //JPSQL
    //@Query("select * from EMPLOYEE where FIRST_NAME = ?1", nativeQuery = true) //SQL
    List<Employee> findByFirstName(String firstName);

    List<Employee> findByFirstNameAndLastName(String firstName, String lastName);
}
