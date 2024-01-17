package com.agroproject.model;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class ServiceProvider {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int spId;
	@NotBlank
	private String ProviderName;
    @Email
	private String ProviderEmail;
    @NotBlank
	private String ProviderMobileNo;
    @NotBlank
    private String ProviderAddress;
    
    @OneToMany(cascade = CascadeType.ALL)
    List<AgriServices> agriServices;
    
    @OneToMany
    List<User> user;
    
    public void setUser(List<User> user) {
		this.user = user;
	}
	public List<User> getUser() {
		return user;
	}
	
	public void setspid(int spid) {
		this.spId = spid;
	}
	public int getspid() {
		return spId;
	}

	
	public void setProviderName(String providerName) {
		this.ProviderName = providerName;
	}
	public String getProviderName() {
		return ProviderName;
	}
	
	public String getProviderEmail() {
		return ProviderEmail;
	}
	public List<AgriServices> getAgriServices() {
		return agriServices;
	}
	public void setAgriServices(List<AgriServices> agriServices) {
		this.agriServices = agriServices;
	}
	public void setProviderEmail(String providerEmail) {
		this.ProviderEmail = providerEmail;
	}
	public String getProviderMobileNo() {
		return ProviderMobileNo;
	}
	public void setProviderMobileNo(String providerMobileNo) {
		this.ProviderMobileNo = providerMobileNo;
	}
	public String getProviderAddress() {
		return ProviderAddress;
	}
	public void setProviderAddress(String providerAddress) {
		this.ProviderAddress = providerAddress;
	}
    
}
