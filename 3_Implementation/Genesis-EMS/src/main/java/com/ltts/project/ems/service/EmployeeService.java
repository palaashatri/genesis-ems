package com.ltts.project.ems.service;


import java.util.List;

import com.ltts.project.ems.model.Employees;

public interface EmployeeService {
	public Employees findById(int id);
/**
 * @return
 */
public List<Employees> findAll();
/**
 * @param username
 * @param password
 * @return
 */
public Employees findByUsernameAndPassword(String username, String password);

/**
 * @param theemp
 * @return
 */
public Employees save(Employees theemp);

/**
 * @param id
 * @return
 */
public Employees deleteById(int id);
}
