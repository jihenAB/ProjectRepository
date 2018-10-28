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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
/**
*
* @author Jihene.Abbassi
*/
@Entity
@Table(name = "USER")
@Inheritance(strategy = InheritanceType.JOINED)
public class User implements Serializable{
	
	@Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "ID")
	private Integer idUser;
	@Size(max = 40)
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Size(max = 40)
	@Column(name = "LAST_NAME")
	private String lastName;
    @Size(max = 255)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 255)
    @Size(max = 40)
    @Column(name = "login")
    private String login;
    @Size(max = 40)
    @Column(name = "password")
    private String pw;
    
    @Size(max = 20)
    @Column(name = "PHONE")
    private String phone;
   
   
    
    
    @Size(max = 40)
    @Column(name = "TYPe_USER")
    private String type;
   
    @Column(name = "quotaWhite")
   	private Integer quotab;
    @Column(name = "quotaBlack")
   	private Integer quotan;
    @Basic(fetch = FetchType.LAZY)
    @Column(length = 2 << 24, name = "PICTURE_CONTENT")
    @Lob
    private byte[] picture;
    
	
	
    public User() {
		super();
	}
	public Integer getId() {
		return idUser;
	}
	public void setId(Integer id) {
		this.idUser = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getQuotab() {
		return quotab;
	}
	public void setQuotab(Integer quotab) {
		this.quotab = quotab;
	}
	public Integer getQuotan() {
		return quotan;
	}
	public void setQuotan(Integer quotan) {
		this.quotan = quotan;
	}
	public byte[] getPicture() {
		return picture;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	@Override
	    public int hashCode() {
	        int hash = 0;
	        hash += (idUser != null ? idUser.hashCode() : 0);
	        return hash;
	    }

	    @Override
	    public boolean equals(Object object) {

	        if (!(object instanceof User)) {
	            return false;
	        }
	        User other = (User) object;
	        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser))) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        return firstName + " " + lastName;
	    }
	   
	    @ManyToOne
		@JoinColumn (name="idDep")
		private Departement departement;  
	    @OneToMany (mappedBy="user")
		private Collection <Phone> phones;
	    @OneToMany (mappedBy="user")
		private Collection <Ticket> tickets;

}
