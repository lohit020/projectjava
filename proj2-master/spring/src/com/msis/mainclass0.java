package com.msis;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.FileSystemResource;

public class mainclass0 {
	public static void main(String[] args) {
		
		/*BeanFactory fac=new XmlBeanFactory
				(new FileSystemResource("spring.xml"));*/
		
		// if using applicationcontext move spring.xml to src folder
		
		ApplicationContext fac=new ClassPathXmlApplicationContext("spring.xml");
		/*  old way: 
 		circle c=new circle();
		point p=new point();
		p.setX(1);
		p.setY(2);
		c.setCentre(p);
		c.draw();*/ 
		
		//using spring
		   circle c=(circle) fac.getBean("circle");
	      c.draw();
	      
	}
          
	
	 
	 
	
} 
