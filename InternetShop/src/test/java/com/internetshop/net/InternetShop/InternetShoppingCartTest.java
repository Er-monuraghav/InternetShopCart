package com.internetshop.net.InternetShop;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.internetshop.net.InternetShop.model.CardDetail;
import com.internetshop.net.InternetShop.model.Product;
import com.internetshop.net.InternetShop.service.CardPaymentService;
import com.internetshop.net.InternetShop.service.InternetShoppingCart;
import com.internetshop.net.InternetShop.service.PaymentServices;
import com.internetshop.net.InternetShop.service.ProductManager;
import com.internetshop.net.InternetShop.service.ProductService;
import com.internetshop.net.InternetShop.util.CardType;
import com.internetshop.net.InternetShop.util.InternetShopingException;

public class InternetShoppingCartTest {
	ProductService productService;
	ProductManager productManager;

	@Before
	public void setUp(){
		productService = new ProductService();
		productManager = new ProductManager(productService);
	}
	
	@Test(expected = InternetShopingException.class)
	public void shoppingCartRemoveProductFailureTest()
	{ 
		CardDetail cardDetail = new CardDetail(826162612616261L,CardType.GOLD,"Monu Raghav");
		PaymentServices paymentServices = new CardPaymentService(cardDetail);
		InternetShoppingCart cart = new InternetShoppingCart(new ArrayList<Product>(), paymentServices);
		Product product1 = productManager.getProduct("E-128");
		cart.removeProduct(product1);
		Assert.assertEquals(cart.getProducts().size(), 0);

	}


	@Test
	public void shoppingCartRemoveProductTest()
	{
		Product product = productManager.getProduct("E-124");
		CardDetail cardDetail = new CardDetail(826162612616261L,CardType.GOLD,"Monu Raghav");
		PaymentServices paymentServices = new CardPaymentService(cardDetail);
		InternetShoppingCart cart = new InternetShoppingCart(new ArrayList<>(Arrays.asList(product)), paymentServices);
		Product product1 = productManager.getProduct("E-124");
		cart.removeProduct(product1);
		Assert.assertEquals(cart.getProducts().size(), 0);

	}

	
	@Test  
	public void shopCartTest(){  
		Product product = productManager.getProduct("E-124");
		CardDetail cardDetail = new CardDetail(826162612616261L,CardType.GOLD,"Monu Raghav");
		PaymentServices paymentServices = new CardPaymentService(cardDetail);
		InternetShoppingCart cart = new InternetShoppingCart(new ArrayList<>(Arrays.asList(product)), paymentServices);
		cart.checkout();
	}

	@Test  
	public void shopCartPaymentTest(){  
		Product product = productManager.getProduct("E-124");
		CardDetail cardDetail = new CardDetail(826162612616261L,CardType.GOLD,"Monu Raghav");
		PaymentServices paymentServices = new CardPaymentService(cardDetail);
		InternetShoppingCart cart = new InternetShoppingCart(new ArrayList<>(Arrays.asList(product)), paymentServices);
		cart.checkout();
	}

	

}
