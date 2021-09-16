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

	
	
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)    
    public ModelAndView index() {    
            
        return new ModelAndView("index");    
    }    
	
	@RequestMapping(value="/admin", method=RequestMethod.GET)    
    public ModelAndView admin() {    
            
        return new ModelAndView("Aditya");    
    } 
	
    @RequestMapping(value="/login", method=RequestMethod.GET)    
    public ModelAndView login() {    
        
        return new ModelAndView("login");    
    }   
    @RequestMapping(value="/user", method=RequestMethod.GET)    
    public ModelAndView user() {    
        
        return new ModelAndView("Shiv");    
    }    
}    
	
	
	

