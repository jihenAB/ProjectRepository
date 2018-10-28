package com.leoni.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leoni.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
