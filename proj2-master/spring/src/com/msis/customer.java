package com.msis;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class customer {
  @Id
	 private int custid;
	 private String custname;
	 private String gender;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "customer [custid=" + custid + ", custname=" + custname + ", gender=" + gender + "]";
	}
	
	
	 
}
