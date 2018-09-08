package com.msis.app;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
//@Table(name="user")
@NamedQueries({
@NamedQuery(name="getAllUsers",query="from userdetails"),
@NamedQuery(name="getuserbyid",query="from userdetails where id=:id")
})
@NamedNativeQueries({
	@NamedNativeQuery(name="getall",query="select * from userdetails",
			resultClass=userdetails.class)
})
public class userdetails {
    @Id
    @SequenceGenerator(name="myseq",sequenceName="user_seq",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="myseq")
    @Column(name="USER_ID")
	private int id;
    @Column(name="USER_NAME")
	private String name;
    @ElementCollection
    //@JoinTable(name="U_D",joinColumns={@JoinColumn(name="userid")})
    private List<address> addresses;
   // private List<address>
	private String phone;
//	@Embedded
//	private address address;
	private int age;
	private Date dob;
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	
	
	public List<address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<address> addresses) {
		this.addresses = addresses;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "userdetails [id=" + id + ", name=" + name + ", addresses=" + addresses + ", phone=" + phone + ", age="
				+ age + ", dob=" + dob + "]";
	}
	
	
	
	
}
