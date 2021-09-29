package com.ltts.project.ems.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.project.ems.model.Employees;
import com.ltts.project.ems.service.EmployeeService;



@RestController
@Scope("session")
public class EmployeeController {
	@Autowired
	EmployeeService emp;
	String username;
	String password;

	
	@RequestMapping("/")
	public ModelAndView Login() {
		return new ModelAndView("loginPage");
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView LoginAuth(HttpServletRequest request) {
		username = request.getParameter("usrname");
		password = request.getParameter("psw");
		Employees theEmployee = emp.findByUsernameAndPassword(username, password);
if (theEmployee == null) {
			

			return new ModelAndView("Invalid_user");
		} else if(theEmployee.getRole().equals("ADMIN")) {

			return new ModelAndView("about");

		}

		else if(theEmployee.getRole().equals("USER")) {

			return new ModelAndView("about");

		}
		else
		{   System.out.println(theEmployee.getRole());
			return new ModelAndView("about");
		}

	}
	@RequestMapping(value = "api/navabout")
	public ModelAndView aboutview() {
		return new ModelAndView("about");
	}

}