package com.ltts.GenesisEMS.service;
import java.util.List;
import com.ltts.GenesisEMS.model.Employees;
;

public interface EmployeeService {
	
	public Employees findById(int id);
	public List<Employees> findAll();
	public Employees findByUsernameAndPassword(String username, String password);
	public Employees save(Employees theemp);
}
