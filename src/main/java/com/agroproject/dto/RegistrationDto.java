package com.agroproject.dto;
import jakarta.validation.constraints.NotBlank;

public class RegistrationDto {

	 @NotBlank
	    private String username;
	    @NotBlank
	    private String password;
	    @NotBlank
	    private String fullname;
	    @NotBlank
	    private String mobilenumber;
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
		public String getMobilenum() {
			return mobilenumber;
		}
		public void setMobilenum(String mobilenumber) {
			this.mobilenumber = mobilenumber;
		}	    
	    
}
