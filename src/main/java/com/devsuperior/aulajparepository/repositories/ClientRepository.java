package com.devsuperior.aulajparepository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.aulajparepository.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
