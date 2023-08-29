package com.Homepage;
public class Customer {
   
    private String fullname;
    private String email;
    private long phonenumber; 
    	
	public Customer(String fullname, long phonenumber, String email) {
		
		this.fullname = fullname;
		this.email = email;
		this.phonenumber = phonenumber;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhoneumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	
}