package com.example.product.service;

import com.example.product.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.product.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee findEmployeeById(String userId) {
        return employeeRepository.findEmployeeById(userId);
    }
    public Employee findEmployee(String desig) {
        return employeeRepository.findEmployeeByDesignation(desig);
    }
}