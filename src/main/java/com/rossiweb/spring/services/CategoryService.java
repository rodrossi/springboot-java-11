package com.rossiweb.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rossiweb.spring.entities.Category;
import com.rossiweb.spring.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository repository;

	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category finById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	} 
}
