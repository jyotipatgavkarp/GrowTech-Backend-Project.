package com.agroproject.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Pid;
	@NotBlank
	private String ProductName;
	@Min(1)
	private double ProductCost;
	@Size(min=2 , max=2000)
	private String ProdInfo;
	@Min(0)
	private double ProductQuantity;
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public double getProductCost() {              
		return ProductCost;                           
	}                                                 
	public void setProductCost(double productCost) {  
		ProductCost = productCost;                    
	}
	public String getProdInfo() {
		return ProdInfo;
	}
	public void setProdInfo(String prodinfo) {
		ProdInfo = prodinfo;
	}
	public double getProductQuantity() {
		return ProductQuantity;
	}
	public void setProductQuantity(double productQuantity) {
		ProductQuantity = productQuantity;
	}
}

