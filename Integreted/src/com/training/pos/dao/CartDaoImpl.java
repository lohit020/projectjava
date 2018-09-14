package com.training.pos.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.pos.bean.CartBean;
import com.training.pos.bean.PosException;

@Repository
public class CartDaoImpl implements CartDao{
	@Autowired
	SessionFactory sf;

	@Override
	public List<CartBean> getCart() throws PosException {
		try {
			Session session = sf.openSession();
			TypedQuery<CartBean> query = session.createQuery("from CartBean");
			List<CartBean> items = query.getResultList();
			System.out.println(items.size());
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

	@Override
	public int delete(String id) {
		Session session = sf.openSession();
		session.beginTransaction();
		Query query=session.createQuery("Delete from CartBean where cartID = :cartID");
		query.setParameter("cartID", id);
		int result = query.executeUpdate();
		session.getTransaction().commit();
		if(result>0) {
			session.close();
			return result;
		}
		else {
			session.close();
			return 0;
		}
	}

	@Override
	public int updateCart(CartBean edit) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(edit);
		session.getTransaction().commit();
		session.close();
		return 1;
	}

	@Override
	public CartBean getCartById(String cartID) {
		Session session = sf.openSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(CartBean.class).add(Restrictions.eq("cartID", cartID));
		CartBean p =  (CartBean) criteria.uniqueResult();
		return p;
	}

	

	

	
}
