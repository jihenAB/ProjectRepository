package com.leoni.services;

import java.util.List;

import com.leoni.entities.Departement;

public interface DepartementService {
	public Departement save(Departement departement);
    public List<Departement> listAllDepartements();
    public Departement update(Departement departement);
    public void remove(Integer id);
    public Departement getDepartement(Integer id);
}
