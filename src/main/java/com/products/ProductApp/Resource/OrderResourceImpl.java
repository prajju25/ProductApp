package com.products.ProductApp.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.products.ProductApp.Model.UserOrder;
import com.products.ProductApp.Model.OrderRequest;
import com.products.ProductApp.Service.OrderService;

@Controller
public class OrderResourceImpl implements OrderResource {
	
	@Autowired
	OrderService service;
	
	public UserOrder saveOrder(OrderRequest orderReq) {
		return service.saveOrder(orderReq);
	}
	
	public List<UserOrder> fetchUserOrders(Long userId) {
		return service.fetchUserOrders(userId);
	}
}
