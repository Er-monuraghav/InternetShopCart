package com.internetshop.net.InternetShop.model;


import java.io.Serializable;

public class Product implements Serializable{

	/**
	 * Serial version Id for Product 
	 */
	private static final long serialVersionUID = 6906421173993565812L;
	
	private String productId;
	private String productName;
	private double price;

	public Product(String productId, String productName, double price) {
		this.productId =productId;
		this.productName = productName;
		this.price =price;
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
}
