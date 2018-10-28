package com.leoni.services.impl;

import com.leoni.dao.TicketRepository;
import com.leoni.entities.Ticket;
import com.leoni.services.TicketService;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TicketServiceImpl implements TicketService{


	@Autowired
	private TicketRepository ticketRepository;

	@Override
	public Ticket save(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	@Override
	public List<Ticket> listAllTickets() {
		return ticketRepository.findAll();
	}

	@Override
	public Ticket update(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	@Override
	public void remove(Integer id) {
		
		ticketRepository.deleteById(id);
	}

	
	

	@Override
	public Ticket getTicket(Integer id) {
		return null;

	}

	
}
