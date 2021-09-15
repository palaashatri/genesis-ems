package com.ltts.shadow.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Employee {
       @Id
	   private int empId;
	   private String firstName;
	   private String lastName;
	   private String userName;
	   private String password;
	   private LocalDate dateOfJoining;
	   private String gender;
	   private LocalDate dateOfBirth;
	   private String role;
	   private String empPhoto;
	   private int departmentId;
	   
	 
	   private boolean isActive=true;


	public Employee() {
		super();
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}


	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getEmpPhoto() {
		return empPhoto;
	}


	public void setEmpPhoto(String empPhoto) {
		this.empPhoto = empPhoto;
	}


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public Employee(int empId, String firstName, String lastName, String userName, String password,
			LocalDate dateOfJoining, String gender, LocalDate dateOfBirth, String role, String empPhoto, int departmentId,
			boolean isActive) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.dateOfJoining = dateOfJoining;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.role = role;
		this.empPhoto = empPhoto;
		this.departmentId = departmentId;
		this.isActive = isActive;
	}


	


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", password=" + password + ", dateOfJoining=" + dateOfJoining + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", role=" + role + ", empPhoto=" + empPhoto + ", departmentId="
				+ departmentId + ", isActive=" + isActive + "]";
	}
	

}
