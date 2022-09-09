package com.RestApi.Controller;


import com.RestApi.Entity.Employee;

import com.RestApi.Servise.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> fetchEmployee() {
        return employeeService.fetchEmployee();
    }

    @GetMapping("/employee/{empId}")
    public Employee fetchEmployeeById(@PathVariable("empId") Long empId) {
        return employeeService.fetchEmployeeById(empId);
    }

    @DeleteMapping("/employee/{empId}")
    public String deleteEmployeeById(@PathVariable("empId") Long empId) {
        return employeeService.deleteEmployeeById(empId);
    }

    @PutMapping("/employee/{empId}")
    public Employee updateEmployee(@PathVariable("empId") Long empId, @RequestBody Employee employee) {
        return employeeService.updateEmployee(empId, employee);
    }


}
