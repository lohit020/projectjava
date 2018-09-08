package com.training.pos.service;

import java.util.ArrayList;

import com.training.pos.bean.CartBean;
import com.training.pos.bean.OrderBean;
import com.training.pos.bean.StoreBean;

public class CustomerImpl implements Customer {

	@Override
	public int addToCart(CartBean cartBean) {
		
		return 0;
	}

	@Override
	public boolean modifyCart(CartBean cartBean) {
		
		return false;
	}

	@Override
	public String confirmOrder(OrderBean orderBean, ArrayList<CartBean> cartbean) {
		
		return null;
	}

	@Override
	public String cancelOrder(String orderId) {
		
		return null;
	}

	@Override
	public ArrayList<StoreBean> viewStore(String city) {
		
		return null;
	}

	@Override
	public ArrayList<CartBean> viewCart(String userid) {
		
		return null;
	}

	@Override
	public ArrayList<OrderBean> viewOrder() {
		
		return null;
	}

}
