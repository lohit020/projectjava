package com.msis.controller;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@Controller("greet")
public class greetcontroller {
	 @RequestMapping("/welcome")
     public ModelAndView sayHello(){	  
    	 ModelAndView mv=new ModelAndView("hello");
    	 mv.addObject("greeting","welcome to mvc");
    	 return mv;
     }
	 @RequestMapping("/hi")
     public ModelAndView sayHi(){	  
    	 ModelAndView mv=new ModelAndView("hello");
    	 mv.addObject("greeting","heyyyyyyy");
    	 return mv;
     }
	 @RequestMapping("/")
	  public String showHome(Model model)
	  {
		   model.addAttribute("employee",new employee());
		  return "home";
	  }
  
	 @RequestMapping("/process")
	 public String validateData(@Valid @ModelAttribute("employee") employee emp,BindingResult result)
	 {
		 if(result.hasErrors())
		 {
			 return "home";
		 }
		return "success";
		 
	 }
}
