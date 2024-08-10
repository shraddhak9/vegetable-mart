package com.app.service;


	import java.util.List;
	import com.app.entities.BillingAddressCustomer;
	import com.app.entities.Customer;
	

	public interface ICustomerService {

		// add customer
		void addCustomer(Customer customer);

		// get all customers
		List<Customer> getAllCustomers();


		// update customer's password
		Customer updateCustomerPassword(long id, String Email, String newPassword);

		// delete customer
		void deleteCustomer(long id);

		// Customer authenticateCustomer
		// Customer authenticateCustomer(long id , String emailId, String password);

		// update BillingCustomerAddress
		Customer updateCustomerAddress(long id, String email, BillingAddressCustomer address);

		//get customer by id
		Customer getCustomerById(long id);
	}


