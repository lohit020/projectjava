package com.training.pos.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.training.pos.bean.CredentialsBean;
import com.training.pos.bean.PosException;

@Repository
public class CredentialsdaoImpl implements CredentialsDao {
	@Autowired
	SessionFactory sf;
	@Override
	public List<CredentialsBean> getAllCredentials() throws PosException {
		try {
			
			Session session = sf.openSession();
			TypedQuery query = session.createQuery("from CredentialsBean");
			List<CredentialsBean> pfl = query.getResultList();
			return pfl;			
		}
		catch (Exception e) {
			throw new PosException(e.getMessage());
		}
	}

	@Override
	public List<CredentialsBean> addCredentials(CredentialsBean pfl) throws PosException {
		try{
			Session session = sf.openSession();
			session.beginTransaction();
			session.save(pfl);
			session.getTransaction().commit();
			return getAllCredentials();
		}
		catch (Exception e) {
			throw new PosException(e.getMessage());
		}
	}

	@Override
	public CredentialsBean getCredentialsById(String userId) {
		Session session = sf.openSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(CredentialsBean.class).add(Restrictions.eq("userId", userId));
		CredentialsBean p = (CredentialsBean) criteria.uniqueResult();
		session.getTransaction().commit();
		return p;
	}

	@Override
	public int update(CredentialsBean cred) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(cred);
		session.getTransaction().commit();
		session.close();
		return 1;
	}

	@Override
	public int delete(String id) {
		Session session = sf.openSession();
		session.beginTransaction();
		Query query=session.createQuery("Delete from CredentialsBean where userId = :userId");
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
