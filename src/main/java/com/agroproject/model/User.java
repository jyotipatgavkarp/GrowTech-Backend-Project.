package com.agroproject.model;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Uid;
	@NotBlank
	private String Username;	
	@jakarta.validation.constraints.Email
	private String Email;
	@NotBlank
	private String Mobilenum;
	@NotBlank 
	private String Address;

	@OneToMany(cascade = CascadeType.ALL)
	List<AgriServices> agriservices;

	public List<AgriServices> getList() {
		return agriservices;
	}

	public void setList(List<AgriServices> agriservices) {
		this.agriservices = agriservices;
	}

	public void setUid(int uid) {
		this.Uid = uid;
	}

	public int getUid() {
		return Uid;                                     
	}                            

	public void setEmail(String email) {
		this.Email = email;
	}

	public String getEmail() {
		return Email;
	}

	public void setMobilenum(String mobilenum) {
		this.Mobilenum = mobilenum;
	}

	public String getMobilenum() {
		
		return Mobilenum;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	public String getAddress() {
		return Address;
	}

	public void setUserName(String username) {
		this.Username = username;
	}

	public String getUserName() {
		return Username;
	}

}