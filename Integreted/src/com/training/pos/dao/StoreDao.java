package com.training.pos.dao;

import java.util.List;


import com.training.pos.bean.PosException;
import com.training.pos.bean.StoreBean;

public interface StoreDao {
	public List<StoreBean> getAllStores() throws PosException;
	public List<StoreBean> addStore(StoreBean strService) throws PosException;
	public StoreBean getStoreById(String storeId);
	public int update(StoreBean store);
	public int delete(String userId);
}
