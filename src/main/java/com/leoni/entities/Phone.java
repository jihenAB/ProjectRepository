package com.leoni.entities;

import java.io.Serializable;
import javax.persistence.*;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.Size;
/**
*
* @author Jihene.Abbassi
*/
@Entity
@Table(name = "PHONE")
@Inheritance(strategy = InheritanceType.JOINED)
public class Phone implements Serializable{
	@Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "ID_PHONE")
	private Integer idPhone;
	@Column(name = "PHONE_NUMBER")
	private String numero;
	@Size(max = 40)
    @Column(name = "MARQUE")
    private String marque;
	@Size(max = 40)
    @Column(name = "MODEL")
    private String modele;
	@Size(max = 40)
    @Column(name = "MAC_PHONE")
    private String macPhone;
	
    @Column(name = "ACCES_TYPE")
    private String typeAcces;
	public Phone() {
		super();
	}
	public Integer getIdPhone() {
		return idPhone;
	}
	public void setIdPhone(Integer idPhone) {
		this.idPhone = idPhone;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getMacPhone() {
		return macPhone;
	}
	public void setMacPhone(String macPhone) {
		this.macPhone = macPhone;
	}
	public String getTypeAcces() {
		return typeAcces;
	}
	public void setTypeAcces(String typeAcces) {
		this.typeAcces = typeAcces;
	}
	@ManyToOne
	@JoinColumn (name="idUser")
	private User user;
	
}