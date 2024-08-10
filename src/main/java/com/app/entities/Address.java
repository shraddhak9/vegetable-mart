package com.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long addressId;
	
	@Column(name="adr_line1",length=100)
	private String add_line1;
	
	@Column(name="adr_line2",length=100)
	private String add_line2;
	
	@Column(length=20)
	private String city;
	
	@Column(length=20)
	private String state;
	
	@Column(length=20)
	private String country;
	
	@Column(length=20,name = "zip_code")
	private String zipcode;

	public Address() {
		super();
	}

	public Address(String add_line1, String add_line2, String city, String state, String country, String zipcode) {
		super();
		this.add_line1 = add_line1;
		this.add_line2 = add_line2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
	}

	public String getAdd_line1() {
		return add_line1;
	}

	public void setAdd_line1(String add_line1) {
		this.add_line1 = add_line1;
	}

	public String getAdd_line2() {
		return add_line2;
	}

	public void setAdd_line2(String add_line2) {
		this.add_line2 = add_line2;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	
	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", add_line1=" + add_line1 + ", add_line2=" + add_line2 + ", city="
				+ city + ", state=" + state + ", country=" + country + ", zipcode=" + zipcode + "]";
	}


	
	

}

	

