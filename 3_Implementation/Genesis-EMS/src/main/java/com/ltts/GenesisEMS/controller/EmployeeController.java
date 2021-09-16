package com.ltts.GenesisEMS.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.ltts.GenesisEMS.model.Employees;
import com.ltts.GenesisEMS.repository.EmployeeRepository;
import com.ltts.GenesisEMS.service.EmployeeService;



@RestController
public class EmployeeController {

	
	
	@RequestMapping("/")
	public ModelAndView m1()
	{
		return new ModelAndView("loginPage");
	}
	@GetMapping("/home")
	public ModelAndView home() {
		return new ModelAndView("Invalid");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Admin";
		
	}
	
	
	
}
