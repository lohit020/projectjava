package com.training.pos.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
}
