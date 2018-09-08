package com.msis.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class hellocontroller extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
	ModelAndView mv=new ModelAndView("hello");
	mv.addObject("message", "welcome to spring mvc");
	mv.addObject("hi","Hi user");
	
		return mv;
	}
	
  
	       
}
