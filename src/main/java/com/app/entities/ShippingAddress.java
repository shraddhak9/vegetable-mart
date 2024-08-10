package com.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


	@Entity
	@Table(name = "shippingAddress")
	public class ShippingAddress extends Address {

		@ManyToOne
		@JoinColumn(name = "shippingAddressCustomerId")
		@JsonIgnore
		private ShippingAddress shippingAddressCustomer;

		private String fullName;

		@Column(name = "ph_no", length = 13)
		private String phone_number;

		public ShippingAddress getShippingAddressCustomer() {
			return shippingAddressCustomer;
		}

		public void setShippingAddressCustomer(ShippingAddress shippingAddressCustomer) {
			this.shippingAddressCustomer = shippingAddressCustomer;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getPhone_number() {
			return phone_number;
		}

		public void setPhone_number(String phone_number) {
			this.phone_number = phone_number;
		}

	}


