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
	
	public void initialSave() {
		repo.save(new Product(1000000001L,"iPhone 10","Mobile Phone" , 70000));
		repo.save(new Product(1000000002L,"iPhone 12 Pro Max","Mobile Phone" , 90000));
		repo.save(new Product(1000000003L,"iPhone 7s","Mobile Phone" , 10000));
		repo.save(new Product(1000000004L,"HP Laptop","Laptop" , 50000));
		repo.save(new Product(1000000005L,"Dell Laptop","Laptop" , 60000));
		repo.save(new Product(1000000006L,"Google Nexus","Mobile Phone" , 70000));
		repo.save(new Product(1000000007L,"Lenova Laptop","Laptop" , 70000));
		repo.save(new Product(1000000008L,"AirPods","Accessory" , 1000));
		repo.save(new Product(1000000009L,"Moto G5s","Mobile Phone" , 10000));
		repo.save(new Product(1000000010L,"Redmi Note 8","Mobile Phone" , 15000));
		repo.save(new Product(1000000011L,"iPhone Charger","Accessory" , 200));
		System.out.println("Inital Query ran");
	}

	public List<Product> filterProduct(String query) {
		return repo.findProductByQuery(query);
	}

	public List<Product> fetchProducts() {
		return repo.fetchProducts();
	}

}
