package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "customerOrder")
public class CustomerOrder extends BaseEntity {

	@ManyToOne
	private Customer customer;
    
	@OneToOne
	@JoinColumn(name = "shippingAddressId")
	private ShippingAddress shippingAddress;

	@OneToMany(mappedBy = "customerOrder", cascade = CascadeType.PERSIST, orphanRemoval = true)
	private List<CartItem> orderItems = new ArrayList<>();

	

	@Column(name="order_status")
    private String Status;
    
	private double subTotal;

	public Customer getCustomer() {
		return customer;
	}

	public void setCutomer(Customer cutomer) {
		this.customer = cutomer;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public List<CartItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<CartItem> orderItems) {
		this.orderItems = orderItems;
	}

}
