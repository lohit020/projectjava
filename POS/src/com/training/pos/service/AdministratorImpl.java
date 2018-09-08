package com.training.pos.service;

import java.util.ArrayList;

import com.training.pos.bean.FoodBean;
import com.training.pos.bean.StoreBean;

public class AdministratorImpl implements Administrator {

	@Override
	public String addStore(StoreBean storebean) {
		return storebean.;
	}

	@Override
	public boolean modifyStore(StoreBean storebean) {
		
		return false;
	}

	@Override
	public int removeStore(ArrayList<String> storeId) {
		
		return 0;
	}

	@Override
	public StoreBean viewStore(String storeId) {
		
		return null;
	}

	@Override
	public ArrayList<StoreBean> viewAllStore() {
		
		return null;
	}

	@Override
	public String addFood(FoodBean foodbean) {
		
		return null;
	}

	@Override
	public boolean modifyFood(FoodBean foodbean) {
		
		return false;
	}

	@Override
	public boolean removeFood(String storeId, String foodId) {
		
		return false;
	}

	@Override
	public FoodBean viewFood(String foodId) {
		
		return null;
	}

	@Override
	public ArrayList<FoodBean> viewAllFood(String storeId) {
		
		return null;
	}

	@Override
	public String changeOrderStatus(String orderId) {
		
		return null;
	}

}
