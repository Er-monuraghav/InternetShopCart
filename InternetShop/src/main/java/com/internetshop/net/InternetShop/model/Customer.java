package com.internetshop.net.InternetShop.model;


import java.io.Serializable;

public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6047348899917879089L;
	private long customerId;
	private String fullName;
	private long mobile;
	
	public Customer(long customerId, String fullName, long mobile) {
		this.fullName = fullName;
		this.customerId =customerId;
		this.mobile = mobile;
	}
	
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	
}
