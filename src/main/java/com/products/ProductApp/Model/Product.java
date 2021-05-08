package com.products.ProductApp.Model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "Product_name")
    private String productName;
    @Column(name = "Product_type")
    private String productType;
    @Column(name = "Product_cost")
    private int productCost;
    
    protected Product(){}
    
	public Product(Long id, String productName, String productType, int productCost) {
		this.id = id;
		this.productName = productName;
		this.productType = productType;
		this.productCost = productCost;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
}
