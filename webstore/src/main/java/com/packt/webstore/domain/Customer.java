package com.packt.webstore.domain;

import com.packt.webstore.dataobjects.PhoneNumber;
import com.packt.webstore.dataobjects.ZipCode;

public class Customer {

	private int customerId;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private ZipCode zipCode;
	private int numOrdersPlaced;
	private PhoneNumber phoneNumber;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public ZipCode getZipCode() {
		return zipCode;
	}
	public void setZipCode(ZipCode zipCode) {
		this.zipCode = zipCode;
	}
	public int getNumOrdersPlaced() {
		return numOrdersPlaced;
	}
	public void setNumOrdersPlaced(int numOrdersPlaced) {
		this.numOrdersPlaced = numOrdersPlaced;
	}
	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}	
	
}
