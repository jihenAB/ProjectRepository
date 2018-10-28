package com.leoni.entities;
import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
/**
*
* @author Jihene.Abbassi
*/
@Entity
@Table(name = "SOCIETE")
@Inheritance(strategy = InheritanceType.JOINED)
public class Societe  implements Serializable{
	@Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "ID_soc")
	private Integer id;
	@Size(max = 40)
	@Column(name = "SOC_NAME")
	private String socName;
	@Size(max = 40)
	@Column(name = "ADDRESS")
	private String adresse;
	@Size(max = 20)
	@Column(name = "MATRICULE")
	private String matricule;
	@Size(max = 20)
	@Column(name = "PHONE")
	private String tel;
	public Societe() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSocName() {
		return socName;
	}
	public void setSocName(String socName) {
		this.socName = socName;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@OneToMany (mappedBy="societe")
	private Collection <Departement> departements;
}
