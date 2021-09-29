package com.ltts.project.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.project.ems.model.Employees;
import com.ltts.project.ems.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository emp;
	/**
	 *
	 */
	@Override
	public Employees findByUsernameAndPassword(String username, String password) {
		return emp.findByUsernameAndPassword(username, password);
	}
	/**
	 *
	 */
	@Override
	public Employees save(Employees theemp) {
		return emp.save(theemp);
	}
	/**
	 *
	 */
	@Override
	public Employees deleteById(int id) {
		
		return emp.deleteById(id);
		
	}
	@Override
	public List<Employees> findAll() {
		
		return emp.findAll();
	}
	@Override
	public Employees findById(int id) {
		return emp.findById(id);
	}
	

	
	

}
