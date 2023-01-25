package com.akshay.kochiProject.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_login")
public class User {
	
	public static final String USERTYPE_ADMIN = "ADMIN";
	public static final String USERTYPE_BACKOFFICE = "BACKOFFICE";
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="u_id")
	 Long id;
	
	@Column(name="u_username")
	 String username;
	
	@Column(name="u_email")
	 String userEmail;
	
	@Column(name="u_password")
	 String password;
	
	@Column(name="u_usertype")
	 String usertype;
	
	
	public User() {
		
	}
	public User(String username,String userEmail,String password, String usertype) {
		super();
		this.username = username;
		this.userEmail=userEmail;
		this.password = password;
		this.usertype = usertype;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return userEmail;
	}
	public void setUseremail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	
}
