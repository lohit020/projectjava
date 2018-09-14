package com.training.pos.controller;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.pos.bean.CartBean;
import com.training.pos.bean.CredentialsBean;
import com.training.pos.bean.OrderBean;
import com.training.pos.bean.PosException;
import com.training.pos.bean.ProfileBean;
import com.training.pos.service.ProfileService;


@Controller
@RequestMapping("/profile")
public class ProfileController {
	@Autowired
	ProfileService pfl;
	@RequestMapping("/addProfile")
	public ModelAndView showProfile() {
		try {
			List<ProfileBean> profile=pfl.getAllProfile();
			ModelAndView mv = new ModelAndView("displayProfile","ProfileBean",profile);
			System.out.println("show executing");
			return mv;
			
		}
		catch (PosException e) {
			ModelAndView mv = new ModelAndView("error");
			mv.addObject("error",e);
			return mv;
		}
	}
	
	@RequestMapping(value="")
	public String addProfile() {
		System.out.println("add executing");
		return "addProfile";
	}
	
	@RequestMapping(value="/saveProfile",method=RequestMethod.POST)
	public ModelAndView saveProfile(@ModelAttribute("ProfileBean") ProfileBean profile,@RequestParam("firstName") String UserId) {
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session session =  sf.openSession();
			session.beginTransaction();
			CredentialsBean c = new CredentialsBean();
			Query q = session.createSQLQuery("select user_seq.nextval from dual");
			BigDecimal key = (BigDecimal) q.uniqueResult();
			String s = UserId.substring(0, 2)+String.valueOf(key);
			c.setUserId(s);
			CartBean cart = new CartBean();
			cart.setUserId(s);
			OrderBean order= new OrderBean();
			session.save(order);
			session.save(c);
			session.getTransaction().commit();
			session.beginTransaction();
			profile.setUserId(s);
			List<ProfileBean> profile1 = pfl.addProfile(profile);
			ModelAndView mv = new ModelAndView("updateCredentials","userId",s);
			System.out.println("save executing+s");
			session.getTransaction().commit();
			session.close();
			return mv;
		} catch (PosException e) {
			ModelAndView mv = new ModelAndView("error");
			mv.addObject("error",e);
			return mv;
		}
	}
	
	@RequestMapping(value="/deleteProfile/{userId}",method=RequestMethod.GET)
	public ModelAndView deleteProfile(@PathVariable String  userId){
		System.out.println(userId);
			int profile1 = pfl.delete(userId);
			return new ModelAndView("redirect:/");
		 
	}
	
	@RequestMapping(value="/editProfile",method=RequestMethod.GET)
	public ModelAndView editProfile(@RequestParam String  userId){
		System.out.println(userId);
			ProfileBean profile1 = pfl.getProfileById(userId);
			ModelAndView mv = new ModelAndView("updateprofile","ProfileBean",profile1);
			System.out.println(profile1.getLastName());
			return mv;
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public ModelAndView updateProfile(@ModelAttribute("ProfileBean") ProfileBean profile) {
		System.out.println("HELLO");
			int profile1 = pfl.update(profile);
		//	ModelAndView mv = new ModelAndView("displayProfile","ProfileBean",profile1);
			System.out.println("save executing");
			return new ModelAndView("redirect:/");
		
	}
	
	/*@RequestMapping("/viewProfile")  
    public ModelAndView viewemp() throws PosException{  
        List<ProfileBean> list=pfl.getAllProfile();  
        return new ModelAndView("displayProfile","ProfileBean",list);  
    }  
	
	 @RequestMapping(value="/editProfile/{userId}")  
	    public ModelAndView edit(@PathVariable int id){  
		 ProfileBean edit=pfl.getProfileById(id);  
	        return new ModelAndView("editProfileForm","ProfileBean",edit);  
	    }  
	 
	 @RequestMapping(value="/editsave",method = RequestMethod.POST)  
	    public ModelAndView editsave(@ModelAttribute("pfl") ProfileBean edit){  
	        pfl.update(edit);  
	        return new ModelAndView("redirect:/viewProfile");  
	    }  
	 
	 @RequestMapping(value="/deleteProfile/{userId}",method = RequestMethod.GET)  
	    public ModelAndView delete(@PathVariable int id){  
	        pfl.delete(id);  
	        return new ModelAndView("redirect:/viewProfile");  
	    }  */
}
