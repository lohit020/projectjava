package com.msis;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainclass {

	  public static void main(String[] args) {
		      ApplicationContext context=
		    		  new ClassPathXmlApplicationContext("spring_i.xml");
		      SessionFactory fac= (SessionFactory) context.getBean("sessionFactory");
		      
		      Session session=fac.openSession();
		      customer cust=new customer();
		      cust.setCustid(101);
		      cust.setCustname("customer one");
		      cust.setGender("female");
		      
		      session.beginTransaction();
		      session.save(cust);
		      session.getTransaction().commit();
		      System.out.println("DAta SaVed");
		      
		      	      
	}
	  
}
