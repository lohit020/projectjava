package come.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.training.pos.bean.CartBean;
import com.training.pos.bean.CredentialsBean;
import com.training.pos.bean.FoodBean;
import com.training.pos.bean.OrderBean;
import com.training.pos.bean.ProfileBean;
import com.training.pos.bean.StoreBean;

public class Service {

	public static void main(String[] args) {
		CredentialsBean credentialsBean = new CredentialsBean();
		credentialsBean.setUserId("1212");
		
		ProfileBean profileBean = new ProfileBean();
		profileBean.setCredentialsBean(credentialsBean);
		
		StoreBean storeBean = new StoreBean();
		storeBean.setStoreID("1212");
		
		FoodBean foodBean = new FoodBean();
		foodBean.setFoodId("asdasd");
		
		CartBean cartBean = new CartBean();
		cartBean.setCartID(1231);
		cartBean.setFoodBean(foodBean);
		cartBean.setCredentialsBean(credentialsBean);
		
		OrderBean orderBean = new OrderBean();
		orderBean.setOrderID("adsasda");
		orderBean.setCartBean(cartBean);
		orderBean.setCredentialsBean(credentialsBean);
		orderBean.setStoreBean(storeBean);
		
		
		
		
		
	
		
		SessionFactory fac = new Configuration().configure().buildSessionFactory();
		Session session = fac.openSession();
		session.beginTransaction();
		 
		session.save(credentialsBean);
		session.save(profileBean);
		session.save(storeBean);
		session.save(foodBean);
		session.save(cartBean);
		session.save(orderBean);
		
		session.getTransaction().commit();
		session.close();
		fac.close();
		
		
	}

}
