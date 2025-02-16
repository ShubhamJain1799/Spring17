package com.example.EmployeeMS.Repositories;

import com.example.EmployeeMS.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    @Query("SELECT SUM(p.budget) FROM Project p WHERE p.id IN (SELECT e.projects FROM Employee e WHERE e.department.id = :departmentId)")
    Double calculateTotalBudgetByDepartment(@Param("departmentId") Long departmentId);
}
