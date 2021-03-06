package com.devsuperior.aulajparepository.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.aulajparepository.entities.Order;
import com.devsuperior.aulajparepository.repositories.OrderRepository;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

	@Autowired
	private OrderRepository orderRepository;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order orderObject = orderRepository.findById(id).get();
		return ResponseEntity.ok(orderObject);
	}

}
