package com.leoni.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leoni.entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer>{

}
