package com.ltts.project.ems.dao;

import com.ltts.project.ems.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
    
}
