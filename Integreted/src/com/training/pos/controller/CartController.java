package com.training.pos.controller;

import java.util.Date;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.transaction.Transactional;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import com.training.pos.bean.CartBean;
import com.training.pos.bean.FoodBean;
import com.training.pos.bean.PosException;
import com.training.pos.service.CartService;

@Controller
@Transactional
public class CartController {
	@Autowired
	CartService cs;
	@RequestMapping("/cart")
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
	
	@RequestMapping(value="/deleteCart/{cartID}",method=RequestMethod.GET)
	public ModelAndView deleteCart(@PathVariable String  cartID){
		System.out.println(cartID);
			int profile1 = cs.delete(cartID);
			return new ModelAndView("redirect:/");
		 
	}
	
	@RequestMapping(value="/editCart",method=RequestMethod.GET)
	public ModelAndView editCart(@RequestParam String cartID){
		System.out.println(cartID);
		CartBean cart= cs.getCartById(cartID);
			ModelAndView mv = new ModelAndView("updateCart","CartBean",cart);
			System.out.println("HELLO1");
			return mv;
	}
	
	/*@RequestMapping(value="/updateCart",method=RequestMethod.POST)
	public ModelAndView updateCart(@ModelAttribute ("CartBean") CartBean edit,@CookieValue("foo") String userId) {
		System.out.println("HELLO");
		edit.setUserId(userId);
		int profile1 =cs.updateCart(edit);
		System.out.println("save executing");
		return new ModelAndView("redirect:/");
		
	}*/
	@RequestMapping(value="/updateCart",method=RequestMethod.POST)
	public ModelAndView updateCart(@RequestParam("foodId") String foodId,@ModelAttribute("FoodBean") FoodBean food,@CookieValue("foo") String userId) {
		System.out.println("HELLO");
		
		CartBean edit = new CartBean();
		System.out.println(userId+foodId);
		System.out.println(food.getFoodId());
		edit.setCartID("1001");
		edit.setUserId(userId);
		edit.setFoodId(food.getFoodId());
		edit.setType(food.getType());
		edit.setQuantity(food.getQuantity());
		edit.setCost(food.getPrice());
		System.out.println(edit);
		List<CartBean> profile1 =cs.addCart(edit);
		System.out.println("save executing");
		return new ModelAndView("cart");
		
	}
	
	

}
