package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.BillingAddressCustomer;
import com.app.entities.Customer;
import com.app.repository.CustomerRepository;

@Service
@Transactional

public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void addCustomer(Customer customer) {

		customerRepository.save(customer);

	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
		
	}

	@Override
    public Customer getCustomerById(long id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if (customerOptional.isPresent()) {
            return customerOptional.get();
        } else {
            throw new RuntimeException("No Customer Found with ID: " + id);
        }
    }


	@Override
	public Customer updateCustomerPassword(long id, String Email, String newPassword) {
		 Optional<Customer> customerOptional = customerRepository.findById(id);
	        if (customerOptional.isPresent()) {
	            Customer customer = customerOptional.get();
	            if (customer.getEmailId().equals(Email)) {
	                customer.setPassword(newPassword);
	                return customerRepository.save(customer);
	            } else {
	                throw new RuntimeException("Email Id does not match with the customer User");
	            }
	        } else {
	            throw new RuntimeException("Customer Id not found");
	        }
	}
    

	@Override
	public Customer updateCustomerAddress(long id, String email, BillingAddressCustomer address) {
		Optional<Customer> customerOptional = customerRepository.findById(id);
		if (customerOptional.isPresent()) {
			Customer customer = customerOptional.get();
			if (customer.getEmailId().equals(email)) {
				customer.setBillingAddress(address);
				customerRepository.save(customer);

			} else {
				throw new RuntimeException("Email does not match");
			}
		} else {
			throw new RuntimeException("Customer not Found");
		}
		return null;

	}

	@Override
	public void deleteCustomer(long id) {
		// customerRepository.deleteUserById(Id) ;
	}

	



	

	/*
	 * @Override public Customer authenticateCustomer(Long id , String emailId,
	 * String password ) { Optional<Customer> optionalcustomer =
	 * customerRepository.findById(id); if(optionalcustomer.isPresent()) { Customer
	 * customer =optionalcustomer.get(); if(customer.getEmailid().equals(emailId)) {
	 * if(passwordMatches(password,customer.getPassword())) {
	 * 
	 * } }
	 * 
	 * } return null; }
	 */

}
