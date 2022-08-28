package com.example.springapi20220828.controller;

import com.example.springapi20220828.entity.Employee;
import com.example.springapi20220828.service.EmployeeService;
import com.example.springapi20220828.service.MyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private MyProperties myProperties;

    @PostMapping("/employees")
    public void createEmployee(@RequestBody Employee request){

        System.out.println("id : " + request.getId());
        System.out.println("firstname : " + request.getFirstName());
        System.out.println("lastname : " + request.getLastName());

        employeeService.save(request);

    }

    @GetMapping("/employees")
    public List<Employee> listAllEmployee() {
        System.out.println("xxxxxxx List all xxxxxxx");
        List<Employee> data = employeeService.listAllEmployee();

        System.out.println("message : " + myProperties.getMessage());
        System.out.println("address : " + myProperties.getAddress());

        return data;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable Integer id){
        System.out.println("xxxxxxx Get Employees xxxxxxx");
        System.out.println("id : " + id);

        Employee employee = employeeService.getEmployee(id);

        return employee;
    }

    @PutMapping("/employees/{id}")
    public void updateEmployee(@PathVariable Integer id, @RequestBody Employee request){
        System.out.println("xxxxxxx Update Employees xxxxxxx");
        System.out.println("id : " + id);
        System.out.println("firstname : " + request.getFirstName());
        System.out.println("lastname : " + request.getLastName());

        employeeService.updateEmployee(id, request);
    }

    @PostMapping("/employees/search")
    public List<Employee> serchByFirstName(@RequestBody Employee request){
        return employeeService.searchByFirstName(request);
    }

}
