package com.training.pos.service;

import java.util.ArrayList;

import com.training.pos.bean.FoodBean;
import com.training.pos.bean.StoreBean;

public interface Administrator {
	public  String addStore(StoreBean storebean);/*{
		// TODO Auto-generated method stub
		return null;
	} 
		// TODO Auto-generated method stub
*/		//return null;
	//}      //Return value must be either: "SUCCESS", "FAIL", “ERROR”
	public boolean modifyStore(StoreBean storebean);
	public int removeStore(ArrayList<String> storeId);
	public StoreBean viewStore(String storeId);
	public ArrayList <StoreBean> viewAllStore();
	public String addFood(FoodBean foodbean);         //Return value must be either: "SUCCESS", "FAIL", “ERROR”
	public boolean modifyFood(FoodBean foodbean);
	public boolean removeFood(String storeId, String foodId);
	public FoodBean viewFood(String foodId);
	public ArrayList<FoodBean> viewAllFood(String storeId);
	public String changeOrderStatus(String orderId);   //Return value must be either: "SUCCESS", "FAIL"
}
