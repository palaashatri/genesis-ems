package com.ltts.project.ems.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.project.ems.dao.EmployeeDao;
import com.ltts.project.ems.model.Employee;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		//System.out.print("inside");
		System.out.print(employeeDao.findAll());
		return employeeDao.findAll();
	}
	@Override
	public void saveEmployee(Employee employee)
	{
			this.employeeDao.save(employee);
	}
	@Override
	public Employee getEmployeeById(int id) {
			Optional<Employee> optional =employeeDao.findById(id);
			Employee employee = null;
			if (optional.isPresent()) {
				employee = optional.get();
			} else {
				throw new RuntimeException(" Employee not found for id :: " + id);
			}
			return employee;
		}
	}


