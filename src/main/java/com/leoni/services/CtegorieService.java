package com.leoni.services;
import java.util.List;

import com.leoni.entities.Categorie;


public interface CtegorieService {
	public Categorie save(Categorie categorie);
    public List<Categorie> listAllCategories();
    public Categorie update(Categorie categorie);
    public void remove(Integer id);
    public Categorie getCategorie(Integer id);
}