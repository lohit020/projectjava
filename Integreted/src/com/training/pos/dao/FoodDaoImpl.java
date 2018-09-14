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
import com.training.pos.bean.FoodBean;
import com.training.pos.bean.PosException;


@Repository
public class FoodDaoImpl implements FoodDao {
	@Autowired
	SessionFactory sf;
	@Override
	public List<FoodBean> getAllFoods() throws PosException {
		try {
			Session session = sf.openSession();
			TypedQuery query = session.createQuery("from FoodBean");
			List<FoodBean> food = query.getResultList();
			return food;			
		}
		catch (Exception e) {
			throw new PosException(e.getMessage());
		}
	}
	
	@Override
	public List<FoodBean> addFood(FoodBean fdo) throws PosException {
		try{
			Session session = sf.openSession();
			session.beginTransaction();
			session.save(fdo);
			session.getTransaction().commit();
			return getAllFoods();
		}
		catch (Exception e) {
			throw new PosException(e.getMessage());
		}
	}

	@Override
	public int delete(String id) {
				Session session = sf.openSession();
				session.beginTransaction();
				Query query=session.createQuery("Delete from FoodBean where foodId = :foodId");
				query.setParameter("foodId", id);
			
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
	public FoodBean getFoodById(String foodId) {
		Session session = sf.openSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(FoodBean.class).add(Restrictions.eq("foodId", foodId));
		FoodBean p = (FoodBean) criteria.uniqueResult();
		return p;
	}

	@Override
	public int updateFood(FoodBean f) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(f);
		session.getTransaction().commit();
		session.close();
		return 1;
	}
	
	
	}

