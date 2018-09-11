package com.training.pos.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.pos.bean.CredentialsBean;
import com.training.pos.bean.PosException;
import com.training.pos.bean.ProfileBean;
import com.training.pos.bean.StoreBean;

@Repository
public class AdminDaoImp implements AdminDao {
	@Autowired
	SessionFactory sf;
	
	@Override
	public String createAdmin(ProfileBean profileBean) {
		 //Write the Query to create the adminprofile using crud operation
		return null;
	}

	@Override
	public int deleteAdmin(ArrayList<String> array) {
		 //Write the Query to create the adminprofile using crud operation
		return 0;
	}

	@Override
	public boolean updateAdmin(ProfileBean profileBean) {
		 //Write the Query to create the adminprofile using crud operation
		return false;
	}

	@Override
	public CredentialsBean findByID(String userId) {
		 //Write the Query to create the adminprofile using crud operation
		return null;
	}

	@Override
	public ArrayList<ProfileBean> findAll() {
		 //Write the Query to create the adminprofile using crud operation
		return null;
	}

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
	public List<StoreBean> addStore(StoreBean str) throws PosException {
		try{
			Session session = sf.openSession();
			session.beginTransaction();
			session.save(str);
			session.getTransaction().commit();
			return getAllStores();
		}catch (Exception e) {
			throw new PosException(e.getMessage());
		}
	}
	}


