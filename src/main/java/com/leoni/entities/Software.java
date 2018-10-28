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
@Table(name = "SOFTWARE")
@Inheritance(strategy = InheritanceType.JOINED)
public class Software implements Serializable{
	@Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "ID_SOFTWARE")
	private Integer idSoft;
	@Size(max = 40)
    @Column(name = "SOFT_NAME")
    private String nomSoft;
	@Size(max = 40)
    @Column(name = "VERSION")
    private String version;
	public Software() {
		super();
	}
	public Integer getIdSoft() {
		return idSoft;
	}
	public void setIdSoft(Integer idSoft) {
		this.idSoft = idSoft;
	}
	public String getNomSoft() {
		return nomSoft;
	}
	public void setNomSoft(String nomSoft) {
		this.nomSoft = nomSoft;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@ManyToOne
	@JoinColumn (name="nomOrd")
	private Ordinateur ordinateur;

}
