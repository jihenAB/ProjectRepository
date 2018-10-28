package com.leoni.services;

import java.util.List;

import com.leoni.entities.Societe;

public interface SocieteService {
	public Societe save(Societe societe);
    public List<Societe> listAllSocietes();
    public Societe update(Societe societe);
    public void remove(Integer id);
    public Societe getSociete(Integer id);
}
