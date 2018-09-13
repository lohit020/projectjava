package com.training.pos.dao;

import java.util.ArrayList;
import java.util.List;

import com.training.pos.bean.CredentialsBean;
import com.training.pos.bean.PosException;
import com.training.pos.bean.ProfileBean;
import com.training.pos.bean.StoreBean;

public interface AdminDao {
	
	public String createAdmin(ProfileBean profileBean);
	public int deleteAdmin(ArrayList<String> array);
	public boolean updateAdmin(ProfileBean profileBean);
	public CredentialsBean findByID(String userId);
	public ArrayList<ProfileBean> findAll();	
	
	public List<StoreBean> getAllStores() throws PosException;
	public List<StoreBean> addStore(StoreBean str) throws PosException;
	
}
