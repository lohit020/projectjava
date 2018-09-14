package com.training.pos.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.pos.bean.CartBean;
import com.training.pos.bean.PosException;
import com.training.pos.service.CartService;

@Controller
@Transactional
public class CartController {
	@Autowired
	CartService cs;
	@RequestMapping("/")
	public ModelAndView showCart() {
		try {
			List<CartBean> items=cs.getCart();
			System.out.println(items.size()+"======");
			ModelAndView mv = new ModelAndView("displayCart","CartBean",items);
			System.out.println("show executing");
			System.out.println(mv);
			return mv;
			
		}
		catch (PosException e) {
			ModelAndView mv = new ModelAndView("error");
			mv.addObject("error",e);
			
			return mv;
		}
	}
	
	@RequestMapping(value="/addCart",method=RequestMethod.POST)
	public String addCart() {
		System.out.println("add executing");
		return "addCart";
	}
	
	@RequestMapping(value="/saveCart",method=RequestMethod.POST)
	public ModelAndView saveCart(@ModelAttribute("CartBean") CartBean items) {
		try {
			System.out.println("again save");
			List<CartBean> item = cs.addCart(items);
			ModelAndView mv = new ModelAndView("displayCart","CartBean",item);
			System.out.println("save executing");
			return mv;
		} catch (PosException e) {
			ModelAndView mv = new ModelAndView("error");
			mv.addObject("error",e);
			return mv;
		}
	
	
}

}
