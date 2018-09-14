package com.training.pos.dao;

import java.util.List;

import com.training.pos.bean.CartBean;
import com.training.pos.bean.PosException;

public interface CartDao {
	public List<CartBean> getCart() throws PosException;
	public List<CartBean> addCart(CartBean cartbean) throws PosException;
	public int delete(String id); 
	public int updateCart(CartBean edit);
	public CartBean getCartById(String cartID);
}
