package com.leoni.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
/**
*
* @author Jihene.Abbassi
*/
@Entity
@Table(name = "CATEGORIE")
public class Categorie implements Serializable{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategorie;
	@Size(max = 20)
    @Column(name = "CAT")
    private String Cat;
public Categorie() {
	super();
}
public Integer getIdCategorie() {
	return idCategorie;
}
public void setIdCategorie(Integer idCategorie) {
	this.idCategorie = idCategorie;
}
public String getCat() {
	return Cat;
}
public void setCat(String cat) {
	Cat = cat;
}


@OneToMany (mappedBy="categorie")
private Collection <Ticket> tickets;
}