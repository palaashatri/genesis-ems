package com.ltts.project.ems.dao;

import com.ltts.project.ems.model.Department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DepartmentDao extends JpaRepository<Department,Integer>{
    
}
