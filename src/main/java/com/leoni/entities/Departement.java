package com.leoni.entities;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
/**
*
* @author Jihene.Abbassi
*/
@Entity
@Table(name = "DEPARTEMENT")
@Inheritance(strategy = InheritanceType.JOINED)

public class Departement implements Serializable{
	@Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "ID_DEP")
	private Integer idDep;
	@Size(max = 40)
	@Column(name = "DEP_NAME")
	private String depName;
	public Departement() {
		super();
	}
	public Integer getId() {
		return idDep;
	}
	public void setId(Integer id) {
		this.idDep = id;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	@ManyToOne
	@JoinColumn (name="id")
	private Societe societe;
	@OneToMany (mappedBy="departement")
	private Collection <User> users;
}
