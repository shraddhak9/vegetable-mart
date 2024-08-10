package com.app.entities;

import java.util.ArrayList;
import java.util.List;



import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "shippingAddressCustomer")
public class ShippingAddressCustomer extends BaseEntity {

	@OneToOne
	@JoinColumn(name = "emailId")
	@JsonIgnore
	private Customer customer;
	
	@OneToMany(mappedBy = "shippingAddressCustomer",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<ShippingAddress> shippingAddress = new ArrayList<>();

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<ShippingAddress> getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(List<ShippingAddress> shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

}
