package com.training.pos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.training.pos.bean.OrderBean;
import com.training.pos.bean.PosException;
import com.training.pos.service.OrderService;

@Controller
public class OrderController {
		@Autowired
		OrderService ord;
		@RequestMapping("/")
		public ModelAndView showProfile() {
			try {
				List<OrderBean> cred=ord.getOrder();
				ModelAndView mv = new ModelAndView("displayOrder","OrderBean",cred);
				System.out.println("show executing");
				return mv;
				
			}
			catch (PosException e) {
				ModelAndView mv = new ModelAndView("error");
				mv.addObject("error",e);
				return mv;
			}
		}
		
		@RequestMapping(value="/addOrder",method=RequestMethod.POST)
		public String addOrder() {
			System.out.println("add executing");
			return "addOrder";
		}
		
		@RequestMapping(value="/saveOrder",method=RequestMethod.POST)
		public ModelAndView saveOrder(@ModelAttribute("OrderBean") OrderBean cred) {
			try {
				List<OrderBean> cred1 = ord.addOrder(cred);
				ModelAndView mv = new ModelAndView("displayOrder","OrderBean",cred1);
				System.out.println("save executing");
				return mv;
			} catch (PosException e) {
				ModelAndView mv = new ModelAndView("error");
				mv.addObject("error",e);
				return mv;
			}
		
	}
		@RequestMapping(value="/deleteOrder/{orderId}",method=RequestMethod.GET)
		public ModelAndView deleteOrder(@PathVariable String  orderId){
			System.out.println(orderId);
				int profile1 = ord.delete(orderId);
				return new ModelAndView("redirect:/");
			 
		}
}
