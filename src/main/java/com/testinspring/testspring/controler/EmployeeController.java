package com.testinspring.testspring.controler;

import com.testinspring.testspring.domain.Employee;
import com.testinspring.testspring.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    private final EmployeeService employeeService;

    @GetMapping("/all")
      public ArrayList<Employee> fetchallemployee(){
        return  employeeService.getallemployees() ;
    }
}
