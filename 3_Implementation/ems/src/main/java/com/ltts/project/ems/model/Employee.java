package com.ltts.project.ems.model;

import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;


@Entity
public class Employee {
   @Id
   private int empId;
   private String firstName;
   private String lastName;
   private String userName;
   private String password;
   private LocalDate dateOfJoining;
   private char gender;
   private LocalDate dateOfBirth;
   private String role;
   private int departmentId;
   @Lob
   private byte[] empPhoto;

   
public Employee() {
}
public Employee(int empId, String firstName, String lastName, String userName, String password, LocalDate dateOfJoining,
        char gender, LocalDate dateOfBirth, String role, int departmentId, byte[] empPhoto) {
    this.empId = empId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.userName = userName;
    this.password = password;
    this.dateOfJoining = dateOfJoining;
    this.gender = gender;
    this.dateOfBirth = dateOfBirth;
    this.role = role;
    this.departmentId = departmentId;
    this.empPhoto = empPhoto;
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
public char getGender() {
    return gender;
}
public void setGender(char gender) {
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
public int getDepartmentId() {
    return departmentId;
}
public void setDepartmentId(int departmentId) {
    this.departmentId = departmentId;
}
public byte[] getEmpPhoto() {
    return empPhoto;
}
public void setEmpPhoto(byte[] empPhoto) {
    this.empPhoto = empPhoto;
}
@Override
public String toString() {
    return "Employee [dateOfBirth=" + dateOfBirth + ", dateOfJoining=" + dateOfJoining + ", departmentId="
            + departmentId + ", empId=" + empId + ", empPhoto=" + Arrays.toString(empPhoto) + ", firstName=" + firstName
            + ", gender=" + gender + ", lastName=" + lastName + ", password=" + password + ", role=" + role
            + ", userName=" + userName + "]";
}

   
}
