package com.training.pos.dao;

import java.util.List;
import com.training.pos.bean.FoodBean;
import com.training.pos.bean.PosException;


public interface FoodDao {
	public List<FoodBean> getAllFoods() throws PosException;
	public List<FoodBean> addFood(FoodBean fds) throws PosException;    //To add and view Food details
	public int delete(String id); 
}
