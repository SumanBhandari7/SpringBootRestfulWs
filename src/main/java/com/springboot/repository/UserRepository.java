package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
