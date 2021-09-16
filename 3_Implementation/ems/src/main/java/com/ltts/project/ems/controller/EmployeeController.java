package com.ltts.project.ems.controller;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.ltts.project.ems.dao.EmployeeDao;
import com.ltts.project.ems.dao.EmployeeDaoService;
import com.ltts.project.ems.model.Employee;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDaoService service;
	

	@Autowired
	private EmployeeDao employeeDao;
	
	@RequestMapping("/")
	public ModelAndView m1() {
		return new ModelAndView("index");
      }

	 @RequestMapping("updateEmployees")
		public ModelAndView m11() {
			
			return new ModelAndView("updateEmployees");
		}
		@RequestMapping(value="updateEmployee",method = RequestMethod.POST)
		public ModelAndView m6(HttpServletRequest request) {
			ModelAndView mv=null;
			int empId=Integer.parseInt(request.getParameter("mnum"));
			String firstName=request.getParameter("mname");
			String lastName=request.getParameter("lname");
			String userName=request.getParameter("uname");
			String password=request.getParameter("pass");
			DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String dateOfJoining=request.getParameter("doj");
			System.out.println(dateOfJoining+"&&&&");
			LocalDate ld=LocalDate.parse(dateOfJoining);
			String g=request.getParameter("gender");
			char gender=g.charAt(0);
			String dateOfBirth=request.getParameter("dob");
			System.out.println(dateOfBirth+"&&&&");
			LocalDate ld1=LocalDate.parse(dateOfBirth);
			String role=request.getParameter("role");
			int deptId=Integer.parseInt(request.getParameter("deptId"));
			Employee m=service.getEmployeeById(empId);
			m.setFirstName(firstName);
			m.setLastName(lastName);
			m.setUserName(userName);
			m.setPassword(password);
			//m.setDateOfJoining(dateOfJoining);
			m.setRole(role);
			m.setGender(gender);
			m.setDepartmentId(deptId);
			m.setDateOfBirth(ld1);
			Employee m1=service.updateEmployee(m);
			mv=new ModelAndView("success");
			return mv;
		}
		
	
}
