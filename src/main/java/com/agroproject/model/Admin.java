package com.agroproject.model;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Admin {

	@Id
	int adminid;
	
    @OneToMany(cascade = CascadeType.ALL)
	List<User> users;
    
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
    
	
}
