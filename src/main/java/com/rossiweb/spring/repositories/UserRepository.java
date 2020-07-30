package com.rossiweb.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rossiweb.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
