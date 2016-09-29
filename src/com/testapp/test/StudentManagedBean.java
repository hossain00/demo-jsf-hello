package com.testapp.test;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentManagedBean {
	private String firstname;
	private String lastname;
	private String country;
	
	
	
	public StudentManagedBean(){}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	

}
