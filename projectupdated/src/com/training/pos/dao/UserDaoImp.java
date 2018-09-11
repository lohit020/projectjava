package com.training.pos.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.pos.bean.CredentialsBean;
import com.training.pos.bean.ProfileBean;

@Repository
public class UserDaoImp implements UserDao{
	
	@Autowired
	SessionFactory sf;

	@Override
	public String createUser(ProfileBean profileBean) {
		
	  Session session=sf.openSession();
	  session.beginTransaction();
	  session.save(profileBean);
	  session.close();
	  return "user created";
	}

	@Override
	public String deleteUser(String userId) {
		   //Write the Query to delete the userprofile using crud operation
		  Session session=sf.openSession();
		  session.beginTransaction();
		  Query query=session.createQuery("delete from profileBean where userId= :userId");
		  query.setParameter("userId", userId);
		  int result=query.executeUpdate();
		  if(result>0)
		  {
			  session.close();
			  return userId+" deleted";
			  
		  }
		  else
		  {
			  session.close();
			  return userId+ " not deleted";
		  }
	}

	@Override
	public boolean updateUser(ProfileBean profileBean) {
		   //Write the Query to update the details in  the user profile using crud operation
		 Session session=sf.openSession();
		  session.beginTransaction();
		  session.update(profileBean);
		  session.close();
		   return true;
	}

	@Override
	public CredentialsBean findByID(String userId) {
		   //Write the Query to locate user in the user profile using crud operation
		 Session session=sf.openSession();
		 session.beginTransaction();
		 CredentialsBean query=(CredentialsBean) session.createQuery("from profileBean where userId= :userId");
		 return query;
	}

	@Override
	public ArrayList<ProfileBean> findAll() {
		   //Write the Query to fetch the user profile using crud operation
		 Session session=sf.openSession();
		 session.beginTransaction();
		 Query query=session.createQuery("from ProfileBean");
		 List<ProfileBean>profiles=query.list();
		 return (ArrayList<ProfileBean>) profiles;
		 
	}
	
}
