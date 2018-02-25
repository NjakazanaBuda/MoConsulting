package com.moconsulting.enitty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

@Entity
@Table(name = "Users")
public class Users implements Serializable{
	
	@Id
	@Column(name = "user_id")
	private int userid;

	@Column(name = "first_name")
	private String firstname;

        @Column(name = "last_name")
	private String lastname;
		
        @Column(name = "id_number")
	private int idnumber;

        @Column(name = "cell_number")
	private int cellnumber;

        @Column(name = "email_address")
	private String emailaddress;

	@Column(name = "user_name")
	private String username;

        @Column(name = "password")
	private String password;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Date createdDate;

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
		return firstname;
	}

	public void setLasttname(String lastname) {
		this.lastname = lastname;
	}
	
	public int getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(int idnumber) {
		this.idnumber = idnumber;
	}

	public int getCellnumber() {
		return cellnumber;
	}

	public void setCellnumber(int cellnumber) {
		this.cellnumber = cellnumber;
	}
	
	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

}
