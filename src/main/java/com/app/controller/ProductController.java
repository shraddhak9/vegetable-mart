package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Product;
import com.app.service.IProductService;

@RestController
@RequestMapping("/Products")
public class ProductController {

	@Autowired
	IProductService iProductService;
	
	// add products
	@PostMapping("/AddProducts")
	void addProduct(Product product) {
		iProductService.addProduct(product);
	}
  
	// getallProducts
	@GetMapping("/GetAllProducts")
	public List<Product> getAllProducts(){
		return iProductService.getAllProducts();
	}

	
	// getProductbyid
	@GetMapping("/GetProductById/{id}")
    public void getProductById(long id) {
		iProductService.getProduct(id);
	}

	// delete product
	@DeleteMapping("DeleteMapping")
	public void deleteProduct(long id) {
		iProductService.deleteProduct(id);
	}
	

	//update product
	@PutMapping
	public Product updateProduct(long id,double price,String name) {
		return iProductService.updateProduct(id, price,name);
		
	}
	
	

	
	

}
