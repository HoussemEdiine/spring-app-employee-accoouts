package com.testinspring.testspring.service;

import com.testinspring.testspring.domain.Employee;
import com.testinspring.testspring.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class EmployeeService {

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    private  final EmployeeRepository employeeRepository;

    public ArrayList<Employee> getallemployees (){
          return (ArrayList<Employee>)  employeeRepository.findAll();
    }

}
