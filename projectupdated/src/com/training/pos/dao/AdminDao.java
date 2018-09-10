package com.training.pos.dao;

import java.util.ArrayList;

import com.training.pos.bean.CredentialsBean;
import com.training.pos.bean.ProfileBean;

public interface AdminDao {
	
	public String createAdmin(ProfileBean profileBean);
	public int deleteAdmin(ArrayList<String> array);
	public boolean updateAdmin(ProfileBean profileBean);
	public CredentialsBean findByID(String userId);
	public ArrayList<ProfileBean> findAll();	
	
}
