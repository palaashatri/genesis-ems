package com.ltts.shadow.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.shadow.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee ,Integer>{
	


}
