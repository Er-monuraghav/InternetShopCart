package com.internetshop.net.InternetShop.model;

import com.internetshop.net.InternetShop.util.CardType;

public class CardDetail {

	private long cardNumber;
	private CardType cardType;
	private String cardHolderName;
	
	public CardDetail(long cardNumber, CardType cardType, String cardHolderName) {
		this.cardHolderName = cardHolderName;
		this.cardNumber = cardNumber;
		this.cardType=cardType;
	}
	
	
	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public CardType getCardType() {
		return cardType;
	}

	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}


}
