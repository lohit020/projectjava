package com.training.pos.dao;

import java.util.List;


import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.training.pos.bean.PosException;
import com.training.pos.bean.StoreBean;

@Repository
@Transactional
public class StoreDaoImpl implements StoreDao{
	@Autowired
	SessionFactory sf;
	
	@Override
	public List<StoreBean> getAllStores() throws PosException {
		try {
			Session session = sf.openSession();
			TypedQuery query = session.createQuery("from StoreBean");
			List<StoreBean> stores = query.getResultList();
			return stores;			
		}
		catch (Exception e) {
			throw new PosException(e.getMessage());
		}
	}

	@Override
	public List<StoreBean> addStore(StoreBean strService) throws PosException {
		try{
			Session session = sf.openSession();
			session.beginTransaction();
			session.save(strService);
			session.getTransaction().commit();
			return getAllStores();
		}catch (Exception e) {
			throw new PosException(e.getMessage());
		}
	}
	
	@Override
	public StoreBean getStoreById(String storeId)  {
		Session session = sf.openSession();
		session.beginTransaction();
		System.out.println(storeId);
		Criteria criteria = session.createCriteria(StoreBean.class).add(Restrictions.eq("storeId", storeId));
		StoreBean p = (StoreBean) criteria.uniqueResult();
		System.out.println(p.getCity());
		session.getTransaction().commit();
		session.close();
		return p;
		}

	@Override
	public int update(StoreBean p) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(p);
		session.getTransaction().commit();
		session.close();
		return 1;
	}

	@Override
	public int delete(String id) {
		Session session = sf.openSession();
		session.beginTransaction();
		Query query=session.createQuery("Delete from StoreBean where storeId = :storeId");
		query.setParameter("storeId", id);
	
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
}
