package com.training.pos.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.training.pos.bean.CredentialsBean;
import com.training.pos.bean.PosException;

public interface CredentialsDao {
	
	public List<CredentialsBean> getAllCredentials() throws PosException;
	public List<CredentialsBean> addCredentials(CredentialsBean pfl) throws PosException; 
	public CredentialsBean getCredentialsById(String userId);
	public int update(CredentialsBean cred);
	public int delete(String userId);
}
