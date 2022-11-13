package com.internetshop.net.InternetShop.util;


public enum CardType {

	GOLD(20),SILVER(10), NORMAL(0);
	
	private final int discount;
	
	CardType(int discount) {
		this.discount =discount;
	}

	public int getDiscount() {
		return discount;
	}
	
}
