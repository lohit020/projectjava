package com.training.pos.dao;

import java.util.ArrayList;

import com.training.pos.bean.CredentialsBean;
import com.training.pos.bean.ProfileBean;

public interface UserDao {
	public String createUser(ProfileBean profileBean);
	public int deleteUser(ArrayList<String> array);
	public boolean updateUser(ProfileBean profileBean);
	public CredentialsBean findByID(String userId);
	public ArrayList<ProfileBean> findAll();	
}
