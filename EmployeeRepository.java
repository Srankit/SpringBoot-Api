package com.RestApi.Repository;

import com.RestApi.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {



}
