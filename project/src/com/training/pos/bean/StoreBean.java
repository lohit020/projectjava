package com.training.pos.bean;

public class StoreBean {
	private String StoreID;
	private String name;
	private String street;
	private String mobileNo;
	private String city;
	private String state;
	private String pincode;
	public String getStoreID() {
		return StoreID;
	}
	public void setStoreID(String storeID) {
		StoreID = storeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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
	@Override
	public String toString() {
		return "StoreBean [StoreID=" + StoreID + ", name=" + name + ", street=" + street + ", mobileNo=" + mobileNo
				+ ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
}
