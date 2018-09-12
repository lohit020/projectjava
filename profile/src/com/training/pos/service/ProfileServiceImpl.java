package com.training.pos.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.pos.bean.PosException;
import com.training.pos.bean.ProfileBean;
import com.training.pos.dao.ProfileDao;
@Service
@Transactional
public class ProfileServiceImpl implements ProfileService{
	@Autowired
	ProfileDao fdo;
	@Override
	public List<ProfileBean> getAllProfile() throws PosException {
		
		return fdo.getAllProfile();
	}

	@Override
	public List<ProfileBean> addProfile(ProfileBean pfl) throws PosException {
		
		return fdo.addProfile(pfl);
	}

	@Override
	public ProfileBean getProfileById(int userId) {
		return fdo.getProfileById(userId);
	}

	@Override
	public int update(ProfileBean edit) {
		return fdo.update(edit);
		
	}

	@Override
	public int delete(String userId) {
		System.out.println(userId);
		return fdo.delete(userId);
		
	}

}
