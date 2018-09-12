package com.training.pos.dao;

import java.util.List;
import com.training.pos.bean.PosException;
import com.training.pos.bean.ProfileBean;

public interface ProfileDao {
	public List<ProfileBean> getAllProfile() throws PosException;
	public List<ProfileBean> addProfile(ProfileBean pfl) throws PosException;    //To add and view Profile details
	public ProfileBean getProfileById(int userId);
	public int update(ProfileBean edit);
	public int delete(String userId);
}
