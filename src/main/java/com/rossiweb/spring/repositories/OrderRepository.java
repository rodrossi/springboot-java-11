package com.rossiweb.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rossiweb.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
