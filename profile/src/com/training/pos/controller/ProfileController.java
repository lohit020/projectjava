package com.training.pos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.training.pos.bean.PosException;
import com.training.pos.bean.ProfileBean;
import com.training.pos.service.ProfileService;


@Controller
public class ProfileController {
	@Autowired
	ProfileService pfl;
	@RequestMapping("/")
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
	
	@RequestMapping(value="/addProfile",method=RequestMethod.POST)
	public String addProfile() {
		System.out.println("add executing");
		return "addProfile";
	}
	
	@RequestMapping(value="/saveProfile",method=RequestMethod.POST)
	public ModelAndView saveProfile(@ModelAttribute("ProfileBean") ProfileBean profile) {
		try {
			List<ProfileBean> profile1 = pfl.addProfile(profile);
			ModelAndView mv = new ModelAndView("displayProfile","ProfileBean",profile1);
			System.out.println("save executing");
			return mv;
		} catch (PosException e) {
			ModelAndView mv = new ModelAndView("error");
			mv.addObject("error",e);
			return mv;
		}
	}
	
	@RequestMapping(value="/deleteProfile/{userId}",method=RequestMethod.GET)
	public ModelAndView deletProfile(@PathVariable String  userId){
		System.out.println(userId);
			int profile1 = pfl.delete(userId);
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
