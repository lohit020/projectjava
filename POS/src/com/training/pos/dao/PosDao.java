package com.training.pos.dao;

import java.util.ArrayList;

public interface PosDao {

	
	public String create(BeanObject);
	public int deleteXYZ(ArrayList<String> );
	public boolean updateXYZ(BeanObject);
	public BeanObject findByID(String);
	public ArrayList<BeanObject> findAll();
	
	
}
