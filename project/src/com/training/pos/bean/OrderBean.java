package com.training.pos.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OrderBean {
	@Id
	private String orderID;
	@OneToOne
	@JoinColumn(name = "userId")
	private CredentialsBean credentialsBean;
	private Date orderDate;
	@OneToOne
	@JoinColumn(name="storeId")
	private StoreBean storeBean;
	@OneToOne
	@JoinColumn(name = "cartId")
	private CartBean cartBean;
	private double totalPrice;
	private String orderStatus;
	private String street;
	private String city;
	private String state;
	private String pincode;
	private String mobileNo;
	
	
	public CredentialsBean getCredentialsBean() {
		return credentialsBean;
	}
	public void setCredentialsBean(CredentialsBean credentialsBean) {
		this.credentialsBean = credentialsBean;
	}
	public StoreBean getStoreBean() {
		return storeBean;
	}
	public void setStoreBean(StoreBean storeBean) {
		this.storeBean = storeBean;
	}
	public CartBean getCartBean() {
		return cartBean;
	}
	public void setCartBean(CartBean cartBean) {
		this.cartBean = cartBean;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
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
		return "OrderBean [orderID=" + orderID + ", credentialsBean=" + credentialsBean + ", orderDate=" + orderDate
				+ ", storeBean=" + storeBean + ", cartBean=" + cartBean + ", totalPrice=" + totalPrice
				+ ", orderStatus=" + orderStatus + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + ", mobileNo=" + mobileNo + "]";
	}
		
}
