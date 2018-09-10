package com.training.pos.bean;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class CartBean {
	
	
	@Id
	private int cartID;
	
	@OneToOne
	@JoinColumn(name="userId")
	private CredentialsBean credentialsBean;
	@OneToOne
	@JoinColumn(name="foodId")
	private FoodBean foodBean;
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
	
	public CredentialsBean getCredentialsBean() {
		return credentialsBean;
	}
	public void setCredentialsBean(CredentialsBean credentialsBean) {
		this.credentialsBean = credentialsBean;
	}
	public FoodBean getFoodBean() {
		return foodBean;
	}
	public void setFoodBean(FoodBean foodBean) {
		this.foodBean = foodBean;
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
		return "CartBean [cartID=" + cartID + ", credentialsBean=" + credentialsBean + ", foodBean=" + foodBean
				+ ", type=" + type + ", quantity=" + quantity + ", cost=" + cost + ", orderDate=" + orderDate + "]";
	}
	
	

}
