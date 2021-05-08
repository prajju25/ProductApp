package com.products.ProductApp;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.products.ProductApp.Service.ProductService;

@SpringBootApplication
public class ProductAppApplication {
	
	@Autowired
	ProductService service;

	public static void main(String[] args) {
		SpringApplication.run(ProductAppApplication.class, args);
	}
	
	@PostConstruct
    private void init() {
		service.initialSave();
    }

}
