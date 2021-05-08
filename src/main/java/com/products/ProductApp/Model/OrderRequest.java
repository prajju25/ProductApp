package com.products.ProductApp.Model;

import java.util.ArrayList;
import java.util.List;

public class OrderRequest {
	private Long orderId;

    private Long userId;
    
    private List<Product> products = new ArrayList<>();

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
