package com.training.pos.service;

import java.util.List;

import com.training.pos.bean.FoodBean;
import com.training.pos.bean.PosException;


public interface FoodService {
	public List<FoodBean> getAllFoods() throws PosException;
	public List<FoodBean> addFood(FoodBean fds) throws PosException;    //To add and view Food details
	public int delete(String id); 
	public FoodBean getFoodById(String foodId);
	public int updateFood(FoodBean edit);
}
