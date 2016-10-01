package com.testapp.test;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student_two_bean {
	private String firstname;
	private String lastname;
	private String favlanguage;
	
	public Student_two_bean(){}

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

	public String getFavlanguage() {
		return favlanguage;
	}

	public void setFavlanguage(String favlanguage) {
		this.favlanguage = favlanguage;
	}
	
	

}
