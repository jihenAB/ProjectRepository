package com.leoni.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "ORDINATEUR")
@Inheritance(strategy = InheritanceType.JOINED)
public class Ordinateur implements Serializable{
	@Id
  
	@Size(max = 40)
    @Column(name = "PC_NAME")
    private String nomOrd;
	
	@Size(max = 40)
    @Column(name = "IP")
    private String ip;
	@Size(max = 40)
    @Column(name = "MAC")
    private String mac;
	@Size(max = 40)
    @Column(name = "Processor")
    private String processeur;
	@Size(max = 40)
    @Column(name = "RAM")
    private String ram;
	@Size(max = 40)
    @Column(name = "OS_NAME")
    private String osName;
	@Size(max = 40)
    @Column(name = "OS_VERSION")
    private String osVersion;
	@Size(max = 40)

    @Column(name = "user_firstname")
    private String userfname;
	@Size(max = 40)
    @Column(name = "user_lastname")
    private String userlname;
	@Size(max = 40)
    @Column(name = "TYPE")
    private String type;/*DESKTOP OR LAPTOP*/
	
	@Size(max = 60)
    @Column(name = "MODEL")
    private String model;
	@Size(max = 60)
    @Column(name = "N_SERIAL")
    private String nSerie;
	@Column(name = "DATE_AFFECTATION")
    private String dateAffectation;
	@Column(name = "DATE_LASTINV")
    private String dateinv;
	public Ordinateur() {
		super();
	}
	public String getNomOrd() {
		return nomOrd;
	}
	public void setNomOrd(String nomOrd) {
		this.nomOrd = nomOrd;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getProcesseur() {
		return processeur;
	}
	public void setProcesseur(String processeur) {
		this.processeur = processeur;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getOsName() {
		return osName;
	}
	public void setOsName(String osName) {
		this.osName = osName;
	}
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public String getUserfname() {
		return userfname;
	}
	public void setUserfname(String userfname) {
		this.userfname = userfname;
	}
	public String getUserlname() {
		return userlname;
	}
	public void setUserlname(String userlname) {
		this.userlname = userlname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getnSerie() {
		return nSerie;
	}
	public void setnSerie(String nSerie) {
		this.nSerie = nSerie;
	}
	public String getDateAffectation() {
		return dateAffectation;
	}
	public void setDateAffectation(String dateAffectation) {
		this.dateAffectation = dateAffectation;
	}
	public String getDateinv() {
		return dateinv;
	}
	public void setDateinv(String dateinv) {
		this.dateinv = dateinv;
	}
	
	
	@OneToMany (mappedBy="ordinateur")
	private Collection <Software> softwares;
	
}
