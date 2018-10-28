package com.leoni.services;

import java.util.List;

import com.leoni.entities.Ticket;


public interface TicketService {
	public Ticket save(Ticket ticket);
    public List<Ticket> listAllTickets();
    public Ticket update(Ticket ticket);
    public void remove(Integer id);
    public Ticket getTicket(Integer id);
}
