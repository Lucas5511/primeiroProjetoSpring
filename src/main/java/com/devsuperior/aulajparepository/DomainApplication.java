package com.devsuperior.aulajparepository;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.aulajparepository.entities.Client;
import com.devsuperior.aulajparepository.entities.Order;
import com.devsuperior.aulajparepository.entities.OrderItem;
import com.devsuperior.aulajparepository.entities.OrderStatus;
import com.devsuperior.aulajparepository.entities.Product;
import com.devsuperior.aulajparepository.repositories.ClientRepository;
import com.devsuperior.aulajparepository.repositories.OrderItemRepository;
import com.devsuperior.aulajparepository.repositories.OrderRepository;
import com.devsuperior.aulajparepository.repositories.ProductRepository;

@SpringBootApplication
public class DomainApplication implements CommandLineRunner {
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;

	public static void main(String[] args) {
		SpringApplication.run(DomainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Client cliente0 = new Client(null, "Alex Green", "alex@gmail.com");
		clientRepository.save(cliente0);
		Product produto0 = new Product(null, "TV", 1000.0);
		Product produto1 = new Product(null, "MOUSE", 40.0);
		Product produto2 = new Product(null, "PC", 1200.0);

		productRepository.saveAll(Arrays.asList(produto0, produto1, produto2));

		Order order0 = new Order(null, Instant.parse("2021-04-18T11:25:09Z"), OrderStatus.PAID, cliente0);
		Order order1 = new Order(null, Instant.parse("2021-04-20T13:30:00Z"), OrderStatus.PAID, cliente0);
		
		orderRepository.saveAll(Arrays.asList(order0, order1));
		
		OrderItem orderItem0 = new OrderItem(null, 1, 1000.0, produto0, order0);
		OrderItem orderItem1 = new OrderItem(null, 2, 40.0, produto1, order0);
		OrderItem orderItem2 = new OrderItem(null, 1, 40.0, produto1, order1);
		OrderItem orderItem3 = new OrderItem(null, 1, 1200.0, produto2, order1);
		
		orderItemRepository.saveAll(Arrays.asList(orderItem0, orderItem1, orderItem2, orderItem3));
		
		
		
		
		
	}

}
