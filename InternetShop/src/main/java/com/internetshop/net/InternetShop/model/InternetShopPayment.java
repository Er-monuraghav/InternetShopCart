package com.internetshop.net.InternetShop.model;

import java.util.List;

import com.internetshop.net.InternetShop.util.CardType;

public class InternetShopPayment {

	
	public void makeMyPayment(CardType cardType, List<Product> products) {
		double totalAmt = calculateTotalAmt(products, cardType);
		double netAmount = totalAmt -calculateInterest(totalAmt, cardType);
		System.out.println("Deduction of amount: "+netAmount);
	}
	
	private double calculateTotalAmt(List<Product> products, CardType cardType) {
		return products.stream().mapToDouble(item->item.getPrice()).sum();
	}
	
	private double calculateInterest(double totalAmt, CardType creditCardType) {
		return creditCardType.getDiscount()*totalAmt/100;
	}
	
	
	
}
