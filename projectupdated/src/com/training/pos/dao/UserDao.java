package com.training.pos.dao;

import java.util.ArrayList;

import com.training.pos.bean.CredentialsBean;
import com.training.pos.bean.ProfileBean;

public interface UserDao {
	public String createUser(ProfileBean profileBean);
	public String deleteUser(String userId);
	public boolean updateUser(ProfileBean profileBean);
	public CredentialsBean findByID(String userId);
	public ArrayList<ProfileBean> findAll();	
}
