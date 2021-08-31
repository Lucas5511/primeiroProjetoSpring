package com.devsuperior.aulajparepository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.aulajparepository.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
