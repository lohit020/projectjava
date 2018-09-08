package com.training.pos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.pos.bean.StoreBean;
import com.training.pos.service.Administrator;

public class PosController {
	@Controller
	public class EmployeeController {
		@Autowired
		Administrator AdministratorService;
		/*@RequestMapping("/")
		
		public ModelAndView showEmployees() {
			try {
				List<Employee> employees=employeeService.getAllEmployees();
				ModelAndView mv = new ModelAndView("index","emplo",employees);
				return mv;
			}
			catch (EmployeeException e) {
				ModelAndView mv = new ModelAndView("error");
				mv.addObject("error",e);
				return mv;
			}
		}*/
		@RequestMapping(value="/addStore",method=RequestMethod.POST)
		public String addStore() {
			return "Add";
		}
		
		@RequestMapping(value="/saveStore",method=RequestMethod.POST)
		public ModelAndView saveStore(@ModelAttribute("POS_TBL_PIZZASTORE") StoreBean strbn) {
			try {
				String stores = Administrator.addStore(strbn);
				ModelAndView mv = new ModelAndView("storeDisplay","strbn",stores);
				return mv;
			} catch (Exception e) {
				ModelAndView mv = new ModelAndView("error");
				mv.addObject("error",e);
				return mv;
			}
}
	}
}
