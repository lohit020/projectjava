package com.training.pos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.training.pos.bean.PosException;
import com.training.pos.bean.StoreBean;


@Service
public class StoreServiceImpl implements StoreService {
	@Autowired
	StoreService strService;
	
	@Override
	public List<StoreBean> getAllStores() throws PosException {
		return strService.getAllStores();
	}
	
	@Override
	public List<StoreBean> addStore(StoreBean str) throws PosException {
		return strService.addStore(str);
	}
	
}
