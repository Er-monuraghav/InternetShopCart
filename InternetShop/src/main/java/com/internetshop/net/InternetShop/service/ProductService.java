package com.internetshop.net.InternetShop.service;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.internetshop.net.InternetShop.model.Product;

public class ProductService {

	private List<Product> products;

	private static final List<Product> ALL_PRODUCTS = Arrays.asList(
			new Product("E-123", "HP-Laptop", 124.45),
			new Product("E-124", "Apple-Laptop", 144.48),
			new Product("E-125", "Lenevo-Laptop", 154.95),
			new Product("E-126", "HCL-Laptop", 167.89),
			new Product("E-127", "Asus-Laptop", 144.94),
			new Product("E-128", "Dell-Laptop", 144.05),
			new Product("E-129", "Micromax-Laptop", 124.45),
			new Product("E-122", "MSI-Laptop", 134.45),
			new Product("E-121", "Acer-Laptop", 114.42),
			new Product("E-131", "Razer-Laptop", 224.95),
			new Product("E-132", "Avita-Laptop", 524.45),
			new Product("E-133", "Toshiba-Laptop", 564.45),
			new Product("E-134", "Sony-Laptop", 174.45)

			);

	public ProductService() {
		this.products = ALL_PRODUCTS;
	}

	public ProductService(List<Product> products){
		this.products =products;
	}

	public List<String> getProductCodeList(){
		return products.stream().map(products->products.getProductId()).collect(Collectors.toList());
	}

	public Product getPorductById(String productId) {
		for (Product product : products) {
			if(product.getProductId().equals(productId)) {
				return product;
			}
		}
		return null;
	}

	public List<Product> getProductList() {
		return this.products;
	}

}
