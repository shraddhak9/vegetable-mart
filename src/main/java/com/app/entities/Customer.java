package com.app.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity // Specifies that the class in an entity
@Table(name = "customer")
public class Customer extends User {

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)//fetch = FetchType.EAGER)
	private BillingAddressCustomer billingAddress;

	@OneToOne
	private ShippingAddressCustomer shippingAddressCustomer;

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true) //fetch = FetchType.EAGER)
	@JoinColumn(name = "cartId")
	private Cart cart;

	public BillingAddressCustomer getBillingAddress() {
		return billingAddress;
	}

	public ShippingAddressCustomer getShippingAddressCustomer() {
		return shippingAddressCustomer;
	}

	public void setShippingAddressCustomer(ShippingAddressCustomer address) {
		this.shippingAddressCustomer = address;
	}

	public void setBillingAddress(BillingAddressCustomer billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
