package com.example.springapi20220828.service;

import com.example.springapi20220828.entity.Employee;
import com.example.springapi20220828.exception.DataNotFoundException;
import com.example.springapi20220828.exception.UnProcessnableException;
import com.example.springapi20220828.model.MassageInfo;
import com.example.springapi20220828.repository.EmployeeDataRepository;
import com.example.springapi20220828.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeDataRepository employeeDataRepository;

    public void save(Employee employee){

        if (employee.getId() != null){
            throw new UnProcessnableException(new MassageInfo("422","don't send Id"));
        }

//        employeeRepository.save(employee);
        employeeDataRepository.save(employee);
    }

    public List<Employee> listAllEmployee(){
//        return employeeRepository.listAllEmployee();
        return employeeDataRepository.findAll();
    }


    public Employee getEmployee(Integer id) {
//        Employee employee = employeeRepository.getEmployee(id);
//        if (employee == null){
//            throw new DataNotFoundException(new MassageInfo("403","Employee Not Found"));
//        }
//
//        return employee;
        return employeeDataRepository.findById(id).orElseThrow(
                ()-> new DataNotFoundException(new MassageInfo("403","Employee Not Found")));
    }

    public void updateEmployee(Integer id, Employee request) {
        Employee employee = getEmployee(id);
        employee.setFirstName(request.getFirstName());
        employee.setLastName(request.getLastName());

//        employeeRepository.save(employee);
        employeeDataRepository.save(employee);
    }

    public List<Employee> searchByFirstName(Employee request) {
//        return employeeRepository.serchByFirstName(request.getFirstName());
        return employeeDataRepository.findByFirstName(request.getFirstName());
    }
}
