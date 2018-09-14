package com.training.pos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.pos.bean.CartBean;
import com.training.pos.bean.PosException;
import com.training.pos.dao.CartDao;

@Service
@Transactional
public class CartServiceImpl implements CartService{
	@Autowired
	CartDao cdao;
	@Override
	public List<CartBean> getCart() throws PosException {
		return cdao.getCart();
	}

	@Override
	public List<CartBean> addCart(CartBean cartbean) throws PosException {
		return cdao.addCart(cartbean);
	}

	
	
}
