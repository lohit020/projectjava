package com.msis.empapp.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.msis.empapp.dto.employee;
import com.msis.empapp.exception.employeeexception;
@Repository
public class employeedaoimpl implements employeedao {

	  @Autowired
	   SessionFactory sf;
	@Override
	public List<employee> getallemployees() throws employeeexception {
		try{
			Session session=sf.openSession();
			Query q=session.createQuery("from employee");
			
		
		
			  List<employee> employees=q.list();
			  session.close();
			  return employees;
		}
		catch(Exception ex){
		throw new employeeexception(ex.getMessage());
	}
	}
	@Override
	public List<employee> addemployee(employee emp) throws employeeexception {
		try{
		Session session=sf.openSession();
		session.beginTransaction();
		session.persist(emp);
		//session.save(emp);
		session.getTransaction().commit();
		return getallemployees();
	} 
		catch(Exception ex)
		{
			throw new employeeexception(ex.getMessage());
		}
}
}
