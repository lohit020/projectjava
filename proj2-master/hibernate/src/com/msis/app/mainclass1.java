package com.msis.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class mainclass1 {
  
	  public static void main(String[] args) {
		
		  SessionFactory fac=
    			  new Configuration().configure().buildSessionFactory();
  		Session session=fac.openSession();
  		 List<address> addresses=new ArrayList<address>();
  		
  		 userdetails user=new userdetails();
  		 user.setName("anil");
  		 user.setPhone("121465");
  		 user.setAge(22);
  		 user.setDob(new Date());
  		 address address=new address();
  		 address.setStreet("whitefield");
  		 address.setCity("blr");
  		 address.setState("KA");
  		 address.setPincode("560054");
  		// user.setAddress(address);
  		 address address1=new address();
  		 address1.setStreet("btm");
  		 address1.setCity("blr");
  		 address1.setState("KARNATAKA");
  		 address1.setPincode("843188");
  		 addresses.add(address);
  		 addresses.add(address1);
  		 user.setAddresses(addresses);
  		 //user.getAddress().add(address1);
  		 //user.getAddress()add(address);
  		 
  		 
  		
  		 session.beginTransaction();
  		 session.save(user);
  		 session.getTransaction().commit();
  		 System.out.println("DATA Saved!!");
  		 
  		 
  		
  		 
	}
}
