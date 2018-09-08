package com.training.pos.bean;

public class CredentialsBean {

	private String userId;
	private String passWord;
	private String usertype;
	private int loginStatus;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public int getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(int loginStatus) {
		this.loginStatus = loginStatus;
	}
	@Override
	public String toString() {
		return "CredentialsBean [userId=" + userId + ", passWord=" + passWord + ", usertype=" + usertype
				+ ", loginStatus=" + loginStatus + "]";
	}
	
	
	
}
