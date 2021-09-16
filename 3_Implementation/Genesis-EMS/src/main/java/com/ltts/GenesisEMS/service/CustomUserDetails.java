package com.ltts.GenesisEMS.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.ltts.GenesisEMS.model.Employees;

public class CustomUserDetails implements UserDetails{
	
	
	private Employees employeedetails;
	
	

	public CustomUserDetails(Employees employeedetails) {
		super();
		this.employeedetails = employeedetails;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return Collections.singleton(new SimpleGrantedAuthority(employeedetails.getRole()));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return employeedetails.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return employeedetails.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	

}
