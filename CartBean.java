package com.training.pos.bean;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class CartBean {
	
	@Id
	private int cartID;
	private int userId;
	private int foodId;
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
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
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
		return "CartBean [cartID=" + cartID + ", userId=" + userId + ", foodId=" + foodId + ", type=" + type
				+ ", quantity=" + quantity + ", cost=" + cost + ", orderDate=" + orderDate + "]";
	}
	

}
