package com.example.reactspringbootcrudbackend.service;

import com.example.reactspringbootcrudbackend.exception.ResourceNotFoundException;
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

    public Employee findById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));
    }
}
