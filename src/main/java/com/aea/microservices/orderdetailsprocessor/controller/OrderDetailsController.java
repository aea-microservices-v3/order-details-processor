package com.aea.microservices.orderdetailsprocessor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aea.microservices.orderdetailsprocessor.dto.OrderDetailsRepository;
import com.aea.microservices.orderdetailsprocessor.model.OrderDetails;

@RestController
@RequestMapping("/order-details")
public class OrderDetailsController
{
	private static Logger LOG = LoggerFactory.getLogger(OrderDetailsController.class);
	
	@Autowired
	private OrderDetailsRepository orderDetailsRepository;
	
	@GetMapping("/{productId}")
	public OrderDetails getOrderDetails(@PathVariable final String productId)
	{
		LOG.info("Get Order Details: productId -> {}", productId);
		return orderDetailsRepository.findById(productId).get();
	}

}
