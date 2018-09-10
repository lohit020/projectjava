package com.training.pos.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.pos.bean.CredentialsBean;
import com.training.pos.bean.ProfileBean;

@Repository
public class AdminDaoImp implements AdminDao {
	@Autowired
	SessionFactory sf;
	
	@Override
	public String createAdmin(ProfileBean profileBean) {
		 //Write the Query to create the adminprofile using crud operation
		return null;
	}

	@Override
	public int deleteAdmin(ArrayList<String> array) {
		 //Write the Query to create the adminprofile using crud operation
		return 0;
	}

	@Override
	public boolean updateAdmin(ProfileBean profileBean) {
		 //Write the Query to create the adminprofile using crud operation
		return false;
	}

	@Override
	public CredentialsBean findByID(String userId) {
		 //Write the Query to create the adminprofile using crud operation
		return null;
	}

	@Override
	public ArrayList<ProfileBean> findAll() {
		 //Write the Query to create the adminprofile using crud operation
		return null;
	}

}
