package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Customer;
import com.app.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private ICustomerService customerService;
	
	// add customer
	@PostMapping("/addCustomer")
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
	//get all users
	@GetMapping("/getAllCustomers")
	public List<Customer> getallCustomers() {
		return customerService.getAllCustomers();
	}
	

	// get customer by id
    @GetMapping("/getCustomerById/{id}")
    public Customer getCustomerById(@PathVariable("id") long id) {
    	return customerService.getCustomerById(id);
    }
	
    //update customer
    //todo try to encrypt password
    @PutMapping("/updateCustomer/{id}/{email}/{newPassword}")
    public ResponseEntity<Customer> updateCustomerPassword(
            @PathVariable long id,
            @PathVariable String email,
            @PathVariable String newPassword) {
        try {
            Customer updateCustomer = customerService.updateCustomerPassword(id, email, newPassword);
            return ResponseEntity.ok(updateCustomer);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
   
    

    
    //@PutMapping("/updatecustomer")
    
    //public Customer updateCustomerPassword(@RequestBody ) {
    	
    
    
    //delete customer
}

