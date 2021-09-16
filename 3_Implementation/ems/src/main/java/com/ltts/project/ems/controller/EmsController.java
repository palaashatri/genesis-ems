package com.ltts.project.ems.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EmsController {

    @RequestMapping("/admin")
	public ModelAndView m1()
	{
		return new ModelAndView("admin");
	}
    
}
