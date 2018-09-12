package com.training.pos.dao;

import java.util.List;


import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Repository;

import com.training.pos.bean.PosException;
import com.training.pos.bean.ProfileBean;

import oracle.net.aso.q;

@Repository
public class ProfileDaoImpl implements ProfileDao {
	  
	@Autowired
	SessionFactory sf;

	
	@Override
	public List<ProfileBean> getAllProfile() throws PosException {
		try {
			
			Session session = sf.openSession();
			TypedQuery query = session.createQuery("from ProfileBean");
			List<ProfileBean> pfl = query.getResultList();
			return pfl;			
		}
		catch (Exception e) {
			throw new PosException(e.getMessage());
		}
	}

	@Override
	public List<ProfileBean> addProfile(ProfileBean pfl) throws PosException {
		try{
			Session session = sf.openSession();
			session.beginTransaction();
			session.save(pfl);
			session.getTransaction().commit();
			return getAllProfile();
		}
		catch (Exception e) {
			throw new PosException(e.getMessage());
		}
	}

	@Override
	public ProfileBean getProfileById(int userId)  {
		Session session = sf.openSession();
		session.beginTransaction();
		Query query= session.createQuery("from profilebean where userid=:userId");
		query.setParameter("userID",userId);
		ProfileBean p = (ProfileBean)query.list();
		return p;
		}

	@Override
	public int update(ProfileBean p) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(p);
		session.getTransaction().commit();
		return 1;
	}

	@Override
	public int delete(String id) {
		Session session = sf.openSession();
		session.beginTransaction();
		Query query=session.createQuery("Delete from ProfileBean where userId = :userId");
		query.setParameter("userId", id);
	
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

