package com.ltts.GenesisEMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.GenesisEMS.model.Employees;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees,String> {
	
	//public Employees findById(int id);
	public Employees findByUsername(String username);
	//public <S extends Employees>Employees save(Employees theemp);

}
