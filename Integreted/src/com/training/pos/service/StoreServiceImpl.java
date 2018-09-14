package com.training.pos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.training.pos.bean.PosException;
import com.training.pos.bean.StoreBean;
import com.training.pos.dao.StoreDao;


@Service
public class StoreServiceImpl implements StoreService {
	@Autowired
	StoreDao store;
	
	@Override
	public List<StoreBean> getAllStores() throws PosException {
		return store.getAllStores();
	}
	
	@Override
	public List<StoreBean> addStore(StoreBean str) throws PosException {
		return store.addStore(str);
	}

	@Override
	public StoreBean getStoreById(String id) {
		StoreBean s = store.getStoreById(id);
		return s;
	}

	@Override
	public int update(StoreBean storeBean) {
		int i = store.update(storeBean);
		return i;
	}

	@Override
	public int delete(String storeId) {
		int i = store.delete(storeId);
		return i;
	}
	
}
