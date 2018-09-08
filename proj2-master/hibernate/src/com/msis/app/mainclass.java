package com.msis.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class mainclass {
  
	  public static void main(String[] args) {
		
		  SessionFactory fac=
    			  new Configuration().configure().buildSessionFactory();
  		Session session=fac.openSession();
  		 List<address> addresses=new ArrayList<address>();
  		userdetails user=(userdetails) session.get(userdetails.class, 1017);
		  System.out.println(user.getName());
		  System.out.println(user.getPhone());
		  session.close();
		 
		  System.out.println("after closing session");
		  System.out.println(user.getName());
		  System.out.println(user.getPhone());
//		  
//		 List<address>add=user.getAddresses();
//		 for(address addr:add)
//		 {
//			 System.out.println(addr);
//		 }
		 
	}
}