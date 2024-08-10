package com.app.entities;



import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cartItem")
public class CartItem extends BaseEntity{
	private int quantity;



	
	@OneToOne(cascade = CascadeType.PERSIST)
	private Product product;
	
	@ManyToOne
	@JoinColumn(name= "cartId")
	@JsonIgnore
	private Cart cart;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "customerOrderId")
	@JsonIgnore
	private CustomerOrder customerOrder;
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public CustomerOrder getCustomerOrder() {
		return customerOrder;
	}
	public void setCustomerOrder(CustomerOrder customerOrder) {
		this.customerOrder = customerOrder;
	}
	
	
	
        
}
