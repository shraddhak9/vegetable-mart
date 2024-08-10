package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.CartItem;
import com.app.repository.CartRepository;

@Service 
public class CartServiceImpl implements ICartService{
             
	@Autowired
	private CartRepository cartRepository;

	@Override
	public void addProduct(CartItem cartItem) {
		cartRepository.save(cartItem);
		
	}
	
	
	
}
