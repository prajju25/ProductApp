package com.products.ProductApp.Model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "userorder")
public class UserOrder{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    
    @Column(name="ordered_date")
    private Date orderedAt;
    
    @Column(name="user_id")
    private Long userID;
    
    @Column(name="product_id")
    private String products;
    
    public UserOrder(){}
    
	public UserOrder(Long orderId, Date orderedAt, Long user, String products) {
		this.id = orderId;
		this.orderedAt = orderedAt;
		this.userID = user;
		this.products = products;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long orderId) {
		this.id = orderId;
	}

	public Date getOrderedAt() {
		return orderedAt;
	}

	public void setOrderedAt(Date orderedAt) {
		this.orderedAt = orderedAt;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long user) {
		this.userID = user;
	}

	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}

 

}

