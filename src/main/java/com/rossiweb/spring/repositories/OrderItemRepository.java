package com.rossiweb.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rossiweb.spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
