package com.products.ProductApp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.products.ProductApp.Model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

	@Query("select p from Product p where p.productName like ':query%'")
	List<Product> findProductByQuery(String query);
	
	@Query("select p from Product p")
	List<Product> fetchProducts();

}
