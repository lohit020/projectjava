package com.training.pos.dao;

import java.util.List;

import com.training.pos.bean.CartBean;
import com.training.pos.bean.PosException;

public interface CartDao {
	public List<CartBean> getCart() throws PosException;
	public List<CartBean> addCart(CartBean cartbean) throws PosException;
	
}
