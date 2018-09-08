package com.training.pos.dao;

public interface PosDao {

	
	public String createXYZ(BeanObject);
	public int deleteXYZ(ArrayList<String> );
	public boolean updateXYZ(BeanObject);
	public BeanObject findByID(String);
	public ArrayList<BeanObject> findAll();
	
	
}
