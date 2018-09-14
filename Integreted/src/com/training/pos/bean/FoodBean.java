
package com.training.pos.bean;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FoodBean {
	@Id
	private String foodId;
	private String fName;
	private String type;
	private String foodSize;
	private String quantity;
	private double price;
	
	public String getFoodId() {
		return foodId;
	}
	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFoodSize() {
		return foodSize;
	}
	public void setFoodSize(String foodSize) {
		this.foodSize = foodSize;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "FoodBean [foodId=" + foodId + ", Name=" + fName + ", type=" + type + ", foodSize=" + foodSize
				+ ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
	
	
}
