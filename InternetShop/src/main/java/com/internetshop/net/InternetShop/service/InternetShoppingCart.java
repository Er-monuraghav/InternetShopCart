package com.internetshop.net.InternetShop.service;

import java.util.List;

import com.internetshop.net.InternetShop.model.Product;
import com.internetshop.net.InternetShop.util.InternetShopingException;

public class InternetShoppingCart  {

	private List<Product> products;
	private PaymentServices paymentServices;
	

	public InternetShoppingCart(List<Product> products, PaymentServices paymentServices) {
		this.products =products;
		this.paymentServices=paymentServices;
	}
	
	public void addProduct(Product product) {
		this.products.add(product);
	}

	
	public void removeProduct(Product product) throws InternetShopingException  {
		 if(products.isEmpty()) {
			 throw new InternetShopingException("The given operation can't be performed as Cart is empty");
		 }
		 products.remove(product);
	}


	public void checkout() {
		double totalAmount = products.stream().mapToDouble(item->item.getPrice()).sum();
		double netAmount = totalAmount -(paymentServices.calculateDiscount(totalAmount));
		paymentServices.showConfirmMessage(products, netAmount);
		paymentServices.placeOrder(products, netAmount);
	}

	
	public List<Product> getProducts() {
		return products;
	}
}
