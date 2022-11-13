package com.internetshop.net.InternetShop.service;


import java.util.List;

import com.internetshop.net.InternetShop.model.Product;

public abstract class PaymentServices {
	
	public abstract double calculateDiscount(double totalAmount);

	public void showConfirmMessage(List<Product> products, double netAmount) {
		System.out.println("Please continue the payment for amount: " +netAmount);
	}

	public abstract void placeOrder(List<Product> products, double totalPrice);
}
