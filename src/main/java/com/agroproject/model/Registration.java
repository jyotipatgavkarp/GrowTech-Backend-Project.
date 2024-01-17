package com.agroproject.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Registration {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;	    
	    private String username;
	    private String password;
	    private String fullname;
	    private String mobilenumber;
	    private int usertype;
	    private int activeuser;
	    
		public int getActiveuser() {
			return activeuser;
		}

		public void setActiveuser(int activeuser) {
			this.activeuser = activeuser;
		}

		public void setMobilenumber(String mobilenumber) {
			this.mobilenumber = mobilenumber;
		}

		public int getUsertype() {
			return usertype;
		}

		public void setUsertype(int usertype) {
			this.usertype = usertype;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
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

		public String getFullname() {
			return fullname;
		}

		public void setFullname(String fullname) {
			this.fullname = fullname;
		}

		public String getMobilenumber() {
			return mobilenumber;
		}

		public Registration() {
			super();
			
		}

		public Registration(int id, String username, String password, String fullname, String mobilenumber,
				int usertype) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
			this.fullname = fullname;
			this.mobilenumber = mobilenumber;
			this.usertype = usertype;
		}

		public void setMobilenum(String mobilenumber) {
			this.mobilenumber = mobilenumber;
		}

		@Override
		public String toString() {
			return "Registration [id=" + id + ", username=" + username + ", password=" + password + ", fullname="
					+ fullname + ", mobilenum=" + mobilenumber + ", usertype=" + usertype + "]";
		}		
}