package com.app.entities;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "farmer")
public class Farmer extends User {

	@OneToMany(mappedBy = "farmer", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Product> productList = new ArrayList<>();

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private BillingAddressFarmer billingAddress;

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public BillingAddressFarmer getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddressFarmer billingAddress) {
		this.billingAddress = billingAddress;
	}

}

