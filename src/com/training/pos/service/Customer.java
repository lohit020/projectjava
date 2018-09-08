package com.training.pos.service;

import java.util.ArrayList;

import com.training.pos.bean.CartBean;
import com.training.pos.bean.OrderBean;
import com.training.pos.bean.StoreBean;

public interface Customer {
	public int addToCart(CartBean cartBean);
	public boolean modifyCart(CartBean cartBean);
	public String confirmOrder(OrderBean orderBean, ArrayList<CartBean> cartbean);;
	public String cancelOrder(String orderId);
	public ArrayList<StoreBean> viewStore(String city);
	public ArrayList<CartBean> viewCart(String userid);
	public ArrayList <OrderBean> viewOrder();


}
