package com.moconsulting.enitty;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.moconsulting.framework.IDataEntity;

@Entity
@Table(name = "Users")
public class Users implements IDataEntity, Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userid;

	@Column(name = "first_name")
	private String firstname;

    @Column(name = "last_name")
	private String lastname;
		
    @Column(name = "id_number")
	private String idnumber;

    @Column(name = "cell_number")
	private String cellnumber;

    @Column(name = "email_address")
	private String emailaddress;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Date createdDate;
	
	//private Login login;
	
	@Transient
	private Set<Roles> roles = new HashSet<Roles>(0);
	
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public String getCellnumber() {
		return cellnumber;
	}

	public void setCellnumber(String cellnumber) {
		this.cellnumber = cellnumber;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	//@OneToOne(cascade = CascadeType.ALL)
	//@PrimaryKeyJoinColumn 
	//public Login getLogin() {
		//return login;
	//}

	//public void setLogin(Login login) {
		//this.login = login;
	//}
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Users_In_Roles", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = { @JoinColumn(name = "role_id") })
	public Set<Roles> getRoles() {
		return this.roles;
	}
	
	public void setRoles(Set<Roles> roles) {
		this.roles = roles;
	}
	

	@Override
	public String toString() {
		return "Users [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", idnumber="
				+ idnumber + ", cellnumber=" + cellnumber + ", emailaddress=" + emailaddress + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + "]";
	}

}
