package com.training.pos.bean;

import java.util.Date;

public class CartBean {
	
	

	private int cartID;
	private String userID;
	private String foodID;
	private String type;
	private int quantity;
	private double cost;
	private Date orderDate;
	public int getCartID() {
		return cartID;
	}
	public void setCartID(int cartID) {
		this.cartID = cartID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getFoodID() {
		return foodID;
	}
	public void setFoodID(String foodID) {
		this.foodID = foodID;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "CartBean [cartID=" + cartID + ", userID=" + userID + ", foodID=" + foodID + ", type=" + type
				+ ", quantity=" + quantity + ", cost=" + cost + ", orderDate=" + orderDate + "]";
	}
	
	

}
