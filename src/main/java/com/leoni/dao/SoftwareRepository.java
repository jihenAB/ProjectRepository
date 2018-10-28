package com.leoni.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leoni.entities.Software;

public interface SoftwareRepository extends JpaRepository<Software, Integer>{

}
