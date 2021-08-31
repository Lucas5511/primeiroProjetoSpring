package com.devsuperior.aulajparepository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.aulajparepository.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
