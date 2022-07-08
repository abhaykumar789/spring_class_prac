package com.cgi;

public class Address {
	private String street;
	private String city;
	private String state;
	
public Address(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
	}

public void setStreet(String street) {
	this.street = street;
}

public void setCity(String city) {
	this.city = city;
}

public void setState(String state) {
	this.state = state;
}


}
