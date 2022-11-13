package com.internetshop.net.InternetShop;

import org.junit.Assert;
import org.junit.Test;

import com.internetshop.net.InternetShop.model.CardDetail;
import com.internetshop.net.InternetShop.service.CardPaymentService;
import com.internetshop.net.InternetShop.util.CardType;

public class PaymentServiceTest {

	@Test
	public void goldenCardTest() {
		CardDetail cardDetail = new CardDetail(12223625323L, CardType.GOLD, "Monu");
		CardPaymentService cardPaymentService = new CardPaymentService(cardDetail);
		Assert.assertEquals(cardPaymentService.calculateDiscount(100.000),20.000,.001);

	}
	
	
	@Test
	public void silverCardTest() {
		CardDetail cardDetail = new CardDetail(12223625323L, CardType.SILVER, "Monu");
		CardPaymentService cardPaymentService = new CardPaymentService(cardDetail);
		Assert.assertEquals(cardPaymentService.calculateDiscount(100.000),10.000,.001);

	}
	
	
	@Test
	public void normalCardTest() {
		CardDetail cardDetail = new CardDetail(12223625323L, CardType.NORMAL, "Monu");
		CardPaymentService cardPaymentService = new CardPaymentService(cardDetail);
		Assert.assertEquals(cardPaymentService.calculateDiscount(100.000),0.000,.001);

	}
	
	
}
