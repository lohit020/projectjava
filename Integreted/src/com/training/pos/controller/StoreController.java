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

import com.training.pos.bean.PosException;
import com.training.pos.bean.StoreBean;
import com.training.pos.service.StoreService;


@Controller
@RequestMapping("/stores")
public class StoreController {
	@Autowired
	StoreService ads;
	@RequestMapping("")
	public ModelAndView showStores() {
		try {
			List<StoreBean> stores=ads.getAllStores();
			ModelAndView mv = new ModelAndView("displayStore","StoreBean",stores);
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
			ModelAndView mv = new ModelAndView("displayStore","StoreBean",store);
			System.out.println("save executing");
			return mv;
		} catch (PosException e) {
			ModelAndView mv = new ModelAndView("error");
			mv.addObject("error",e);
			return mv;
		}
	}
	
	@RequestMapping(value="/deleteStore/{storeId}",method=RequestMethod.GET)
		public ModelAndView deleteStore(@PathVariable String  storeId){
			System.out.println(storeId);
				int profile1 = ads.delete(storeId);
				return new ModelAndView("redirect:/");
			 
		}
		
	@RequestMapping(value="/editStore",method=RequestMethod.GET)
	public ModelAndView editProfile(@RequestParam String  storeId){
		System.out.println("storeId"  + storeId);
			StoreBean storebean = ads.getStoreById(storeId);
			System.out.println(storebean.getStoreId());
			ModelAndView mv = new ModelAndView("update","StoreBean",storebean);
			System.out.println("HELLO1");
			return mv;
	}
		
	@RequestMapping(value="/update",method=RequestMethod.POST)
		public ModelAndView updateStore(@ModelAttribute("ProfileBean") StoreBean store) {
			System.out.println("HELLO");
				int profile1 = ads.update(store);
			//	ModelAndView mv = new ModelAndView("displayProfile","StoreBean",profile1);
				System.out.println("save executing");
				return new ModelAndView("redirect:/");
			
		}
}
