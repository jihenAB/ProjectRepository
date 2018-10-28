package com.leoni.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leoni.entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Integer>{

}
