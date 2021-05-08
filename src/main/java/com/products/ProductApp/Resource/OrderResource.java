package com.products.ProductApp.Resource;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.ProductApp.Model.UserOrder;
import com.products.ProductApp.Model.OrderRequest;

@RestController
@RequestMapping(path="order-application/")
public interface OrderResource {

	@PostMapping(value="/orderSave", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserOrder saveOrder(@RequestBody OrderRequest body);
	
	@GetMapping(value="/allOrders/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserOrder> fetchUserOrders(@PathVariable("userId") Long userId);
}
