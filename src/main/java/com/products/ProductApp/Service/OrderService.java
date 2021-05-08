package com.products.ProductApp.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.ProductApp.Model.UserOrder;
import com.products.ProductApp.Model.OrderRequest;
import com.products.ProductApp.Repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository repo;

	public List<UserOrder> fetchUserOrders(Long userId) {
		List<UserOrder> orders = repo.findAllByUserId(userId);
		if(orders!=null && !orders.isEmpty()) {
			return orders;
		}
		return null;
	}

	public UserOrder saveOrder(OrderRequest orderReq) {
		StringBuffer productIds = new StringBuffer();
		UserOrder order = new UserOrder();
		order.setId(orderReq.getOrderId());
		order.setUserID(orderReq.getUserId());
		order.setOrderedAt(new Date());
		for(int i=0; i < orderReq.getProducts().size(); i++) {
			productIds.append(orderReq.getProducts().get(i).getId());
			if(i != orderReq.getProducts().size()-1) {
				productIds.append(",");
			}
		}
		order.setProducts(productIds.toString());
		return repo.save(order);
	}

}
