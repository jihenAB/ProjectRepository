package com.leoni.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.leoni.dao.OrdinateurRepository;
import com.leoni.dao.TicketRepository;
import com.leoni.entities.Ordinateur;
import com.leoni.services.OrdinateurService;
import com.leoni.services.TicketService;

public class OrdinateurServiceImpl  implements OrdinateurService{
	@Autowired
	private OrdinateurRepository ordinateurRepository;

	@Override
	public Ordinateur save(Ordinateur ordinateur) {
		return ordinateurRepository.save(ordinateur);

	}

	@Override
	public List<Ordinateur> listAllOrdinateurs() {
		return ordinateurRepository.findAll();

	}

	@Override
	public Ordinateur update(Ordinateur ordinateur) {
		return ordinateurRepository.save(ordinateur);

	}

	@Override
	public void remove(String nomord) {
		ordinateurRepository.deleteById(nomord);
		
	}

	@Override
	public Ordinateur getOrdinateur(String nomord) {
		// TODO Auto-generated method stub
		return null;
	}

}
