package com.training.pos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.pos.bean.PosException;
import com.training.pos.bean.StoreBean;
import com.training.pos.dao.AdminDao;


@Service
@Transactional
public class AdminServiceImpl implements AdminService  {
	@Autowired
	AdminDao ado;
	@Override
	public List<StoreBean> getAllStores() throws PosException {
		return ado.getAllStores();
	}

	@Override
	public List<StoreBean> addStore(StoreBean str) throws PosException {
		return ado.addStore(str);
	}
	

}
