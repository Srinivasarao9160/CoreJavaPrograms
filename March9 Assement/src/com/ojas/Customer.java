package com.ojas;

public class Customer {

	String firstname;
	String lastname;
	
	public Customer() {
		System.out.println("customer Details");
	}
	
	public Customer(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + "]";
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	}

