package com.training.pos.controller;

import java.util.ArrayList;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.jboss.resteasy.spi.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sun.mail.iap.Response;
import com.training.pos.bean.CredentialsBean;
import com.training.pos.bean.FoodBean;
import com.training.pos.bean.PosException;
import com.training.pos.service.CredentialsService;

@Controller
@RequestMapping("/")
public class LoginController {
	@Autowired
	CredentialsService pfl;
	@RequestMapping("/")
	public ModelAndView showLogin() {
			ModelAndView mv = new ModelAndView("frontpage");
			System.out.println("show executing");
			return mv;
	
	}
	@RequestMapping(value="/userlogin")
	public ModelAndView edit(@RequestParam("userId") String  userId,@RequestParam("passWord") String password,HttpServletResponse response){
		System.out.println(userId);
		System.out.println(userId+password);
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Query q = session.createQuery("select passWord from CredentialsBean where userId = :userId");
		q.setParameter("userId", userId);
		String pass = (String) q.uniqueResult();
		System.out.println(pass);
		if(pass.equals(password)) {
			CredentialsBean cr = session.get(CredentialsBean.class, userId); // 3 is ID of user. 
			cr.setLoginStatus(1);
			Cookie foo = new Cookie("foo", userId); //bake cookie
			foo.setMaxAge(2000); 	
			response.addCookie(foo);;
			String user = cr.getUsertype();
			 Query qq = session.createQuery("from FoodBean");
			 List<FoodBean> foodlist = qq.list();
			session.saveOrUpdate(cr);
			session.getTransaction().commit();
			
			if(user.equals("C")) {
				ModelAndView mv = new ModelAndView("displayFood","FoodBean",foodlist);
				System.out.println("HELLO1");
				return mv;
			}
			else {
				ModelAndView mv = new ModelAndView("displayOrder");
				System.out.println("HELLO1");
				return mv;
				
			}
			
			
			
			}
		return new ModelAndView("/login");
	}
	
}
