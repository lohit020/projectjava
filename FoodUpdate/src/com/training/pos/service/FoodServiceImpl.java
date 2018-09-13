package com.training.pos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.pos.bean.FoodBean;
import com.training.pos.bean.PosException;
import com.training.pos.dao.FoodDao;

@Service
@Transactional
public class FoodServiceImpl implements FoodService{
	@Autowired
	FoodDao fdo;
	@Override
	public List<FoodBean> getAllFoods() throws PosException {
		return fdo.getAllFoods();
	}

	@Override
	public List<FoodBean> addFood(FoodBean fds) throws PosException {
		return fdo.addFood(fds);
	}

	@Override
	public int delete(String foodId) {
		System.out.println(foodId);
		return fdo.delete(foodId);
	}

	@Override
	public FoodBean getFoodById(String foodId) {
		
		return fdo.getFoodById(foodId);
	}

	
	@Override
	public int updateFood(FoodBean edit) {
		return fdo.updateFood(edit);
	}

	
}


