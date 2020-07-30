package com.rossiweb.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rossiweb.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
