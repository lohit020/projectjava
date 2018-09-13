package com.training.pos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.pos.bean.CredentialsBean;
import com.training.pos.bean.PosException;
import com.training.pos.dao.CredentialsDao;

@Service
public class CredentialsServiceImpl implements CredentialsService {
	@Autowired
	CredentialsDao cdao;
	@Override
	public List<CredentialsBean> getAllCredentials() throws PosException {
		return cdao.getAllCredentials();
	}

	@Override
	public List<CredentialsBean> addCredentials(CredentialsBean pfl) throws PosException {
		return cdao.addCredentials(pfl);
	}

	@Override
	public int delete(String userId) {
		System.out.println(userId);
		return cdao.delete(userId);
	}

}
