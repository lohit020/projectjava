package com.msis.app;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Criteria;

//import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import javax.persistence.criteria.CriteriaQuery;

public class mainclass0 {
      public static void main(String[] args) {
// userdetails user=new userdetails();
//    	 // User user=new User();
//		  //user.setId(102);
//		  user.setName("prk");
//		  user.setPhone("1234567891");
//		  user.setAge(22);
//		 
//	SessionFactory fac=	new Configuration().configure().buildSessionFactory();
//		Session session=fac.openSession();
//		session.beginTransaction();
//		session.save(user);
//		session.getTransaction().commit();
//		
//		session.close();
//		fac.close();
//		System.out.println("data saved");
	          	
		
    	  SessionFactory fac=
    			  new Configuration().configure().buildSessionFactory();
  		Session session=fac.openSession();
  		
  			/*	Query query=session.createQuery("from userdetails");
  				List<userdetails> employees=query.list();
  				
  				for(userdetails user :employees)
  				{
  					System.out.println(user);
  					System.out.println(user.getId());
  				}
  				*/
  		
  		/*TypedQuery<userdetails> query=(TypedQuery<userdetails>) session.createQuery("from userdetails");
  		
               List<userdetails> employees=query.getResultList();
   				
  				for(userdetails users :employees)
  				{
  					System.out.println(users);
  					//System.out.println(users.getId());
  				}
    	  */
  	//Query q=session.createQuery("select name from user");
  		
  		
			
  			/*	Query q=session.createQuery("from userdetails where age>:a");
  				q.setParameter("a",20);
  			  List<userdetails> users=q.list();
  				
  				for(userdetails user :users)
  				{
  					System.out.println(user);
  					
  				}*/
  		/*Query q=session.getNamedQuery("getAllUsers");
  		List<userdetails> users=q.list();
  		for(userdetails user:users)
  		{
  			System.out.println(users);
  		}
  		*/
  		
  		/*Query q=session.getNamedQuery("getuserbyid");
  		q.setParameter("id", 1001);
  		userdetails u=(userdetails) q.uniqueResult();
  		
  			System.out.println(u);
  		*/
  		
  		/*Query q=session.getNamedQuery("getall");
  		  List<userdetails> users=q.list();
  		  for(userdetails user:users)

  		  {
  			  System.out.println(user);
  		  }*/
  		
  		/* Criteria c=session.createCriteria(employee.class);
  		 
  		// c.add(Restrictions.gt("salary",5000D));
  		//c.add(Restrictions.between("salary", 30000D, 50000D));
  		 c.add(Restrictions.like("name", "r%"));
  		 //c.add(Restrictions.eq("gender", "M"));
  		  */
  		/*
  		List<employee> employees =c.list();
  		  
  		  for(employee employeed: employees)
  		  {
  			  System.out.println(employeed);
  		  }*/
/*  		
  		employee emp=new employee();
  		emp.setName("ranjan");
  		emp.setAge(22);
  		emp.setGender("M");
  		//emp.setId(111);
  		
  		//emp.setSalary(43000);
  		
  		//Example ex=Example.create(emp);
  		Example ex=Example.create(emp).excludeProperty("salary");
  				Criteria c=session.createCriteria(employee.class)
  				.add(ex);
  			.setProjection(Projections.max("salary"));
  			.setProjection(Projections.property("name"));
  		
  		     
  		double sal=(double) c.uniqueResult();
  		System.out.println(sal);
  				
  	  			List<employee> employees =c.list();
  	  	  		  
  	  	  		  for(employee employeed: employees)
  	  	  		  {
  	  	  			  System.out.println(employeed);
  	  	  		  }
  		
  			*/
  		
  		
  		userdetails user=new userdetails();
  		user.setId(2);
  		user.setName("test name");
  		user.setAge(23);
  		user.setPhone("123456789");
  		
  		session.beginTransaction();
  		session.save(user);
  		//session.persist(user);
  		
  		user.setName("new name");
  		session.getTransaction().commit();
  		//
  		session.close();
  		//session.clear();
  		session=fac.openSession();
  		session.beginTransaction();
  		session.update(user);
  		user.setName("new name again");
  		session.getTransaction().commit();
  				
  				
	}
	
}
