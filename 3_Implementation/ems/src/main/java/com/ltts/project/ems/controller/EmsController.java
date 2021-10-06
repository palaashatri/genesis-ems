package com.ltts.project.ems.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;


import com.ltts.project.ems.model.Employee;
import com.ltts.project.ems.service.EmployeeService;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class EmsController {
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
			Employee theEmployee = emp.findByUsernameAndPassword(username, password);
	if (theEmployee == null) {
				

				return new ModelAndView("Invalid_user");
			} else if(theEmployee.getRole().equals("Associate Engineer")) {

				return new ModelAndView("admin");

			}

			else if(theEmployee.getRole().equals("USER")) {

				return new ModelAndView("Invalid_user");

			}
			else
			{   System.out.println(theEmployee.getRole());
				return new ModelAndView("Invalid_user");
			}

		}

    @RequestMapping("/admin")
	public ModelAndView m1()
	{
		return new ModelAndView("admin");
	}
    
}
