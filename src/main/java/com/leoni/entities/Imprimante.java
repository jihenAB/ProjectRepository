package com.leoni.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
*
* @author Jihene.Abbassi
*/
@Entity
@Table(name = "IMPRIMANTE")
@Inheritance(strategy = InheritanceType.JOINED)
public class Imprimante implements Serializable{
	@Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "ID_PRINTER")
	private Integer idImpr;

	@Size(max = 40)
    @Column(name = "MARQUE_IMP")
    private String marqueImp;
	
	
	@Size(max = 40)
    @Column(name = "MODEL_IMP")
    private String modeleImp;
	
	@Size(max = 40)
    @Column(name = "NSERIAL_IMP")
    private String nSerieImp;

	public Imprimante() {
		super();
	}

	public Integer getIdImpr() {
		return idImpr;
	}

	public void setIdImpr(Integer idImpr) {
		this.idImpr = idImpr;
	}

	public String getnSerieImp() {
		return nSerieImp;
	}

	public void setnSerieImp(String nSerieImp) {
		this.nSerieImp = nSerieImp;
	}

	public String getMarqueImp() {
		return marqueImp;
	}

	public void setMarqueImp(String marqueImp) {
		this.marqueImp = marqueImp;
	}

	public String getModeleImp() {
		return modeleImp;
	}

	public void setModeleImp(String modeleImp) {
		this.modeleImp = modeleImp;
	}
	
	
}
