package com.RestApi.Servise;

import com.RestApi.Entity.Employee;
import com.RestApi.Repository.EmployeeRepository;

import java.util.List;

public interface EmployeeService extends EmployeeRepository {
    public Employee saveEmployee(Employee employee);

   public List<Employee> fetchEmployee();
    public Employee fetchEmployeeById(Long empId);


    public String deleteEmployeeById(Long empId);

    public Employee updateEmployee(Long empId, Employee employee);
}
