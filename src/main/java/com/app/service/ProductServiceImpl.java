package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.Product;
import com.app.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements IProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public void addProduct(Product product) {
		productRepository.save(product);

	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();

	}

	@Override
	public void getProduct(long id) {
		productRepository.findById(id);

	}

	@Override
	public void deleteProduct(long id) {
		productRepository.deleteById(id);

	}

	@Override
	public Product updateProduct(long id, double price, String name) {
		Optional<Product> optionalproduct = productRepository.findById(id);
		if (optionalproduct.isPresent()) {
			Product products = optionalproduct.get();
			products.setProductId(id);
			products.setPrice(price);
			products.setProductName(name);

			return productRepository.save(products);
		} else {
			throw new RuntimeException("Cannot id do not exist");
		}

	}

}
