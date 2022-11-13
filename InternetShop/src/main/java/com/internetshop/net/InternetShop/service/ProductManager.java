package com.internetshop.net.InternetShop.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.internetshop.net.InternetShop.model.Product;

public class ProductManager {

	private ProductService productService;
	
	public ProductManager(ProductService productService) {
		this.productService = productService;
	}

    public List<String> getProductCodeList() {
        return productService.getProductCodeList();
    }

    public Product getProduct(@PathVariable final String code) {
       return productService.getPorductById(code);
    }
    
    public List<Product> getProductList(){
    	return productService.getProductList();
    }

}
