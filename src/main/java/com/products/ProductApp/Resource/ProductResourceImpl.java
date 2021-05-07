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
		return service.filterProduct(query);
	}
	
	public List<Product> fetchAllProduct(){
		return service.fetchProducts();
	}
}
