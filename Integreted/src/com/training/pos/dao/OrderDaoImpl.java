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
import org.springframework.util.SystemPropertyUtils;

import com.training.pos.bean.OrderBean;
import com.training.pos.bean.PosException;



@Repository
public class OrderDaoImpl implements OrderDao{
	@Autowired
	SessionFactory sf;
	@Override
	public List<OrderBean> getOrder() throws PosException {
		try {
			Session session = sf.openSession();
			TypedQuery query = session.createQuery("from OrderBean");
			List<OrderBean> ord = query.getResultList();
			return ord;			
		}
		catch (Exception e) {
			throw new PosException(e.getMessage());
		}
	}

	@Override
	public List<OrderBean> addOrder(OrderBean ord) throws PosException {
		try{
			Session session = sf.openSession();
			session.beginTransaction();
			session.save(ord);
			session.getTransaction().commit();
			return getOrder();
		}
		catch (Exception e) {
			throw new PosException(e.getMessage());
		}
	}

	@Override
	public int delete(String id) {
			Session session = sf.openSession();
			session.beginTransaction();
			Query query=session.createQuery("Delete from OrderBean where orderId = :orderId");
			query.setParameter("orderId", id);
		
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
	public OrderBean getOrderById(String orderId) {
		Session session = sf.openSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(OrderBean.class).add(Restrictions.eq("orderId", orderId));
		OrderBean orderbean = (OrderBean) criteria.uniqueResult();
		System.out.println(orderbean.getStoreId());
		session.close();
		return orderbean;
	}

	@Override
	public int update(OrderBean order) {
			Session session = sf.openSession();
			session.beginTransaction();
			System.out.println(order.getCartId());
			session.update(order);
			session.getTransaction().commit();
			session.close();
			return 1;
		}
	}	
