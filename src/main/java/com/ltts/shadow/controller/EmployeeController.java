package com.ltts.shadow.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpServletRequest;
import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.shadow.dao.EmployeeDao;
import com.ltts.shadow.dao.EmployeeDaoService;
import com.ltts.shadow.model.Employee;

@RestController
public class EmployeeController {
	
	
	@Autowired
	
	EmployeeDaoService service;
	
	@RequestMapping("/")
	public ModelAndView m1()
	{
		return new ModelAndView("index");
	}
	
	@RequestMapping("/addEmployee")
	public ModelAndView m2()
	{
		return new ModelAndView("addEmployee");
	}
	
	@RequestMapping(value="/insertEmployee",method = RequestMethod.POST)
	public ModelAndView m3(HttpServletRequest request)
	{
		ModelAndView mv=null;
		int id=Integer.parseInt(request.getParameter("eid"));
		String e_firstName=request.getParameter("fname");
		String e_lastName=request.getParameter("lname");
		String e_userName=request.getParameter("uname");
		String e_password=request.getParameter("password");
		
	
		
		
		//DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String doj=request.getParameter("doj");
		String dob=request.getParameter("dob");
		
		LocalDate e_doj=LocalDate.parse(doj);
		String e_gender=request.getParameter("gender");
		LocalDate e_dob=LocalDate.parse(dob);
		String e_role=request.getParameter("role");
		String e_imgUrl="blank";
		int e_deptId=Integer.parseInt(request.getParameter("did"));
		boolean stat=false;
	
	
		Employee e=new Employee(id,e_firstName,e_lastName,e_userName,e_password,e_doj,e_gender,e_dob,e_role,e_imgUrl,e_deptId,false);
		
		Employee e1=service.insertEmployee(e);
		System.out.println(e1);
	

		
		 
		 
		 
		
		
		
		
		
	
		mv=new ModelAndView("success");
		return mv;
	}

}
