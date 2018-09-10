package com.training.pos.dao;

import java.util.ArrayList;

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
		
	   //Write the Query to create the userprofile using crud operation
		return null;
	}

	@Override
	public int deleteUser(ArrayList<String> array) {
		   //Write the Query to delete the userprofile using crud operation
		return 0;
	}

	@Override
	public boolean updateUser(ProfileBean profileBean) {
		   //Write tthe Query to update th details in  the userprofile using crud operation
		return false;
	}

	@Override
	public CredentialsBean findByID(String userId) {
		   //Write the Query to locate user in the userprofile using crud operation
		return null;
	}

	@Override
	public ArrayList<ProfileBean> findAll() {
		   //Write the Query to fetch the userprofile using crud operation
		return null;
	}
	
}