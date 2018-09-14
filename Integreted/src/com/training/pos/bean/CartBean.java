package com.training.pos.bean;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class CartBean {
	
	@Id
	private String cartID;
	private String userId;
	private String foodId;
	private String type;
	private String quantity;
	private double cost;
	private Date orderDate;
	public String getCartID() {
		return cartID;
	}
	public void setCartID(String cartID) {
		this.cartID = cartID;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFoodId() {
		return foodId;
	}
	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String i) {
		this.quantity = i;
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
