package com.leoni.services;


import java.util.List;

import com.leoni.entities.Ordinateur;


public interface OrdinateurService {
	public Ordinateur save(Ordinateur ordinateur);
    public List<Ordinateur> listAllOrdinateurs();
    public Ordinateur update(Ordinateur ordinateur);
    public void remove(String nomord);
    public Ordinateur getOrdinateur(String nomord);
}

