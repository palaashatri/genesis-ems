package com.ltts.GenesisEMS.model;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name ="Employees")
public class Employees {
	@Id
	private String username;
    private Date DoJ;
	private String Role;
	
	private String Img;
	private String password;
	private String FirstName;
	private String LastName;
	private String EmployeeNumber;
	private Date  Dob;
	private char Gender;
	
	private int ID;
    public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getDoJ() {
		return DoJ;
	}
	public void setDoJ(Date doJ) {
		DoJ = doJ;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getImg() {
		return Img;
	}
	public void setImg(String img) {
		Img = img;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmployeeNumber() {
		return EmployeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		EmployeeNumber = employeeNumber;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		Gender = gender;
	}
	public Employees() {
		super();
	}





	public Employees(String username, String firstName, String lastName, String employeeNumber, Date dob,
			char gender, Date doJ, String role, String img, String password) {
		super();
		this.username = username;
		FirstName = firstName;
		LastName = lastName;
		EmployeeNumber = employeeNumber;
		Dob = dob;
		Gender = gender;
		DoJ = doJ;
		Role = role;
		Img = img;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Employees [ID=" + ID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", EmployeeNumber=" + EmployeeNumber + ", Dob=" + Dob + ", Gender=" + Gender + ", DoJ=" + DoJ
				+ ", Role=" + Role + ", Img=" + Img + "]";
	}
	

}
