package com.agroproject.model;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;

@Entity
public class AgriServices {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int SId;
	@NotBlank
	private String Servicename;	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Product> product;
	public int getSId() {
		return SId;
	}
	public void setSId(int sId) {
		SId = sId;
	}
	public String getServicename() {
		return Servicename;
	}
	public void setServicename(String servicename) {
		Servicename = servicename;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
}