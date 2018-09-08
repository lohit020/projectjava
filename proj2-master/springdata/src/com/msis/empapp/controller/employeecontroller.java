package com.msis.empapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.msis.empapp.dto.employee;
import com.msis.empapp.exception.employeeexception;
import com.msis.empapp.service.employeeservice;

@Controller
public class employeecontroller {
	@Autowired
	employeeservice employeeService;
       @RequestMapping("/")
       public ModelAndView showemployees()
       {
    	   try {
			List<employee> employees=employeeService.getallemployees();
			ModelAndView mv=new ModelAndView("index", "employees", employees);
			return mv;
		} catch (employeeexception e) {
			ModelAndView mv=new ModelAndView("error");
			mv.addObject("error", e);
			return mv;
			
		}
       }
	@RequestMapping(value="/addemployee",method=RequestMethod.POST)
	public String addemployee()
	{
		return "add";
	}
	@RequestMapping(value="/saveemployee",method=RequestMethod.POST)
	public ModelAndView saveemployee(@ModelAttribute("employee") employee emp)
	{
		  try {
			List<employee> employees=employeeService.addemployee(emp);
			ModelAndView mv=new ModelAndView("index","employees",employees);
			return mv;
		} catch (employeeexception e) {
			ModelAndView mv=new ModelAndView("error");
			mv.addObject("error", e);
			return mv;
			
		}
		  
	
	
	}
	 
}
