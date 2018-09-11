package com.training.pos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.pos.bean.PosException;
import com.training.pos.bean.StoreBean;
import com.training.pos.service.AdminService;
@Controller
public class StoreController {

	@Autowired
	AdminService ads;
	@RequestMapping("/")
	public ModelAndView showStores() {
		try {
			List<StoreBean> stores=ads.getAllStores();
			ModelAndView mv = new ModelAndView("index","StoreBean",stores);
			System.out.println("show executing");
			return mv;
			
		}
		catch (PosException e) {
			ModelAndView mv = new ModelAndView("error");
			mv.addObject("error",e);
			
			return mv;
		}
	}
	@RequestMapping(value="/addStore",method=RequestMethod.POST)
	public String addStore() {
		System.out.println("add executing");
		return "addStore";
	}
	
	@RequestMapping(value="/saveStores",method=RequestMethod.POST)
	public ModelAndView saveStores(@ModelAttribute("StoreBean") StoreBean stores) {
		try {
			//StoreBean stores;
			List<StoreBean> store = ads.addStore(stores);
			ModelAndView mv = new ModelAndView("index","StoreBean",store);
			System.out.println("save executing");
			return mv;
		} catch (PosException e) {
			ModelAndView mv = new ModelAndView("error");
			mv.addObject("error",e);
			return mv;
		}
	
	
}
}
