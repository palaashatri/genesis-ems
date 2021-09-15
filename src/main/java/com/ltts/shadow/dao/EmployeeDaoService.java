package com.ltts.shadow.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.shadow.model.Employee;

@Service
public class EmployeeDaoService {

	@Autowired
	EmployeeDao ed;
	
	public Employee insertEmployee(Employee e)
	{
		return ed.save(e);
	}
}
