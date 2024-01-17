package com.agroproject.dto;

public class UserLogindto {

	
   	    private String password;
   	    private String mobilenumber;
   	    private int usertype;
   	   public int getUsertype() {
			return usertype;
		}
		public void setUsertype(int usertype) {
			this.usertype = usertype;
		}
	public String getMobilenumber() {
			return mobilenumber;
		}
		public void setMobilenumber(String mobilenumber) {
			this.mobilenumber = mobilenumber;
		}	    
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	
	
	
}
