package com.ltts.project.ems.service;

import java.util.List;

import com.ltts.project.ems.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	Employee saveEmployee(Employee employee);
	Employee getEmployeeById(int id);

}
