package com.training.pos.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.pos.bean.CartBean;
import com.training.pos.bean.PosException;

@Repository
@Transactional
public class CartDaoImpl implements CartDao{
	@Autowired
	SessionFactory sf;

	@Override
	public List<CartBean> getCart() throws PosException {
		try {
			Session session = sf.openSession();
			TypedQuery query = session.createQuery("from CartBean");
			List<CartBean> items = query.getResultList();
			return items;			
		}
		catch (Exception e) {
			throw new PosException(e.getMessage());
		}
	}

	@Override
	public List<CartBean> addCart(CartBean cartbean) throws PosException {
		try{
			Session session = sf.openSession();
			session.beginTransaction();
			session.save(cartbean);
			session.getTransaction().commit();
			return getCart();
		}catch (Exception e) {
			throw new PosException(e.getMessage());
		}
	}

	

	

	
}
