package com.leoni.services;

import java.util.List;

import com.leoni.entities.Imprimante;


public interface ImprimanteService {
	public Imprimante save(Imprimante imprimante);
    public List<Imprimante> listAllImprimantes();
    public Imprimante update(Imprimante imprimante);
    public void remove(Integer id);
    public Imprimante getImprimante(Integer id);
}
