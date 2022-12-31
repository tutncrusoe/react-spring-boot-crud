package com.example.reactspringbootcrudbackend.service;

import com.example.reactspringbootcrudbackend.model.Employee;
import com.example.reactspringbootcrudbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    /*----------------------      GET     ----------------------*/
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    /*----------------------      SAVE     ----------------------*/
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
}
