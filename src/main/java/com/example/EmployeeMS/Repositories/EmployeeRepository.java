package com.example.EmployeeMS.Repositories;

import com.example.EmployeeMS.Entity.Department;
import com.example.EmployeeMS.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByNameContainingIgnoreCase(String name);
    List<Employee> findByDepartmentId(Department department);
    List<Employee> findByProjectsIsEmpty();
}
