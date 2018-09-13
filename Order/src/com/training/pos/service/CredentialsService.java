package com.training.pos.service;

import java.util.List;

import com.training.pos.bean.CredentialsBean;
import com.training.pos.bean.PosException;

public interface CredentialsService {
	public List<CredentialsBean> getAllCredentials() throws PosException;
	public List<CredentialsBean> addCredentials(CredentialsBean pfl) throws PosException;
	public int delete(String userId); 

}
