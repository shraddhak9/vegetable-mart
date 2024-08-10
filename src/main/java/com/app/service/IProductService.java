package com.app.service;

import java.util.List;

import com.app.entities.Product;

public interface IProductService {

	// add products
	void addProduct(Product product);

	// getallProducts
	List<Product> getAllProducts();

	// getProductbyid
	void getProduct(long id);

	

	// delete product
	void deleteProduct(long id);

	//update product by id
     Product updateProduct(long id, double price, String name);

}
