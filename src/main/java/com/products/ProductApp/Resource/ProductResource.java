package com.products.ProductApp.Resource;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.ProductApp.Model.Product;

@RestController
@RequestMapping(path="product/")
public interface ProductResource {

	@GetMapping(value="/product/{searchQuery}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> searchProduct(@PathVariable("searchQuery") String query);
	
	@GetMapping(value="/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> fetchAllProduct();
}
