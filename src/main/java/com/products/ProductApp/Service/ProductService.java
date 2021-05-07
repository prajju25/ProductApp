package com.products.ProductApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.ProductApp.Model.Product;
import com.products.ProductApp.Repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repo;

	public List<Product> filterProduct(String query) {
		return repo.findProductByQuery(query);
	}

	public List<Product> fetchProducts() {
		return repo.fetchProducts();
	}

}
