package com.ltts.project.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ltts.project.ems.model.Employees;




@Repository
public interface EmployeeRepository extends JpaRepository<Employees,Integer> {
	
	public Employees findById(int id);

	  /**
	 * @param username
	 * @param password
	 * @return
	 */
	public Employees findByUsernameAndPassword(String username, String password);
	
	  
	  public <S extends Employees>Employees save(Employees theemp);
	  
	  
	  /**
	 * @param id
	 * @return
	 */
	public Employees deleteById(int id);
	  
	
	
}






