package com.rossiweb.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rossiweb.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
