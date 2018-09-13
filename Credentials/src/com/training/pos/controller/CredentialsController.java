package com.training.pos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.pos.bean.CredentialsBean;
import com.training.pos.bean.PosException;
import com.training.pos.service.CredentialsService;

@Controller
public class CredentialsController {

	@Autowired
	CredentialsService pfl;
	@RequestMapping("/")
	public ModelAndView showProfile() {
		try {
			List<CredentialsBean> cred=pfl.getAllCredentials();
			ModelAndView mv = new ModelAndView("displayCredentials","CredentialsBean",cred);
			System.out.println("show executing");
			return mv;
			
		}
		catch (PosException e) {
			ModelAndView mv = new ModelAndView("error");
			mv.addObject("error",e);
			return mv;
		}
	}
	
	@RequestMapping(value="/addCredentials",method=RequestMethod.POST)
	public String addCredentials() {
		System.out.println("add executing");
		return "addCredentials";
	}
	
	@RequestMapping(value="/saveCredentials",method=RequestMethod.POST)
	public ModelAndView saveCredentials(@ModelAttribute("CredentialsBean") CredentialsBean cred) {
		try {
			List<CredentialsBean> cred1 = pfl.addCredentials(cred);
			ModelAndView mv = new ModelAndView("displayCredentials","CredentialsBean",cred1);
			System.out.println("save executing");
			return mv;
		} catch (PosException e) {
			ModelAndView mv = new ModelAndView("error");
			mv.addObject("error",e);
			return mv;
		}
	}
	
	@RequestMapping(value="/deleteCredentials/{userId}",method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable String  userId){
		System.out.println(userId);
			int profile1 = pfl.delete(userId);
			return new ModelAndView("redirect:/");
		 
	}
	
	@RequestMapping(value="/editCredentials",method=RequestMethod.GET)
	public ModelAndView edit(@RequestParam String  userId){
		System.out.println(userId);
		CredentialsBean profile1 = pfl.getCredentialsById(userId);
			ModelAndView mv = new ModelAndView("updateCredentials","CredentialsBean",profile1);
			System.out.println("HELLO1");
			return mv;
	}
	
	@RequestMapping(value="/updateCredentials",method=RequestMethod.POST)
	public ModelAndView updateCredentials(@ModelAttribute("CredentialsBean") CredentialsBean crd) {
		System.out.println("HELLO");
			int profile1 = pfl.update(crd);
			System.out.println("save executing");
			return new ModelAndView("redirect:/");
		
	}
}
