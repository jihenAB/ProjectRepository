package com.leoni.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.Size;
/**
*
* @author Jihene.Abbassi
*/
@Entity
@Table(name = "TICKET")
@Inheritance(strategy = InheritanceType.JOINED)
public class Ticket implements Serializable{
	@Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "ID_TICKET")
	private Integer idTicket;
	@Size(max = 255)
    @Column(name = "TITLE")
    private String title;
	@Size(max = 159999)
    @Column(name = "DESCRIPTION")
    private String description;
	@Size(max = 40)
    @Column(name = "URGENCE")
    private String urgence;
	@Size(max = 40)
    @Column(name = "ETAT")
    private String etat;
    @Column(name = "DATE_D")
	private Date dateDebut;
    @Column(name = "DATE_F")
    private Date dateFin;
	public Ticket() {
		super();
	}
	public Integer getIdTicket() {
		return idTicket;
	}
	public void setIdTicket(Integer idTicket) {
		this.idTicket = idTicket;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrgence() {
		return urgence;
	}
	public void setUrgence(String urgence) {
		this.urgence = urgence;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}   
	@ManyToOne
	@JoinColumn (name="idUser")
	private User user;
	@ManyToOne
	@JoinColumn (name="idCategorie")
	private Categorie categorie;
		
}