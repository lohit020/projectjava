package com.training.pos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.training.pos.bean.FoodBean;
import com.training.pos.bean.PosException;
import com.training.pos.service.FoodService;

//@Controller
public class FoodController {
	@Autowired
	FoodService fds;
	@RequestMapping("/")
	public ModelAndView showFoods() {
		try {
			List<FoodBean> foods=fds.getAllFoods();
			ModelAndView mv = new ModelAndView("displayFood","FoodBean",foods);
			System.out.println("show executing");
			return mv;
			
		}
		catch (PosException e) {
			ModelAndView mv = new ModelAndView("error");
			mv.addObject("error",e);
			return mv;
		}
	}
	@RequestMapping(value="/addFood",method=RequestMethod.POST)
	public String addFood() {
		System.out.println("add executing");
		return "addFood";
	}
	
	@RequestMapping(value="/saveFood",method=RequestMethod.POST)
	public ModelAndView saveFood(@ModelAttribute("FoodBean") FoodBean food) {
		try {
			List<FoodBean> foods = fds.addFood(food);
			ModelAndView mv = new ModelAndView("displayFood","FoodBean",foods);
			System.out.println("save executing");
			return mv;
		} catch (PosException e) {
			ModelAndView mv = new ModelAndView("error");
			mv.addObject("error",e);
			return mv;
		}
}
	@RequestMapping(value="/deleteFood/{foodId}",method=RequestMethod.GET)
	public ModelAndView deleteFood(@PathVariable String  foodId){
		System.out.println(foodId);
			int profile1 = fds.delete(foodId);
			return new ModelAndView("redirect:/");
		 
	}
}
