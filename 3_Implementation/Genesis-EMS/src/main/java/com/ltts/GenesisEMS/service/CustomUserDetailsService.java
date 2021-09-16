package com.ltts.GenesisEMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ltts.GenesisEMS.model.Employees;
import com.ltts.GenesisEMS.repository.EmployeeRepository;
@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	
	
	
	@Autowired
	EmployeeRepository emp;
	
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Employees employeedetails = emp.findByUsername(username);
		if(employeedetails==null)
		{
			throw new UsernameNotFoundException("User Not Found");
		}
			
		return new CustomUserDetails(employeedetails);
	}
	
	

}
