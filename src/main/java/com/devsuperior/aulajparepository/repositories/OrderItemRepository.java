package com.devsuperior.aulajparepository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.aulajparepository.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
