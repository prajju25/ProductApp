package com.products.ProductApp.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.products.ProductApp.Model.Product;
import com.products.ProductApp.Service.ProductService;

@Controller
public class ProductResourceImpl implements ProductResource{

	@Autowired
	ProductService service;
	
	public List<Product> searchProduct(String query) {		
		List<Product> product = service.filterProduct(query);
		if(product != null && !product.isEmpty()) {
			return product;
		}
		return null;
	}
	
	public List<Product> fetchAllProduct(){
		List<Product> product = service.fetchProducts();
		if(product != null && !product.isEmpty()) {
			return product;
		}
		return null;
	}
}
