package com.training.pos.bean;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class OrderBean {
	@Id
	private String orderId;
	private String userId;
	private Date orderDate;
	private String storeId;
	private String cartId;
	private double totalPrice;
	private String orderStatus;
	private String street;
	private String city;
	private String state;
	private String pincode;
	private String mobileNo;
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "OrderBean [orderID=" + orderId + ", userId=" + userId + ", orderDate=" + orderDate + ", storeId="
				+ storeId + ", cartId=" + cartId + ", totalPrice=" + totalPrice + ", orderStatus=" + orderStatus
				+ ", street=" + street + ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", mobileNo="
				+ mobileNo + "]";
	}
	
	
	
		
}
