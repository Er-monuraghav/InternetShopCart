package com.internetshop.net.InternetShop.service;

import java.util.List;

import com.internetshop.net.InternetShop.model.CardDetail;
import com.internetshop.net.InternetShop.model.Product;

public class CardPaymentService extends PaymentServices{

	private CardDetail cardDetail;
	
	
	public CardPaymentService(CardDetail cardDetail) {
		this.cardDetail = cardDetail;
	}
	
	@Override
	public double calculateDiscount(double totalAmount) {
		return cardDetail.getCardType().getDiscount()*totalAmount/100;
	}

	@Override
	public void placeOrder(List<Product> products, double netAmount) {
		System.out.println("Thank you for making payment of "+ netAmount +" with your card number "+cardDetail.getCardHolderName());
	}
}
