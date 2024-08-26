package com.customer.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.Customer;
import com.customer.service.CustomerService;
@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	@GetMapping("/customer")
	public List<Customer> getCustomerDetails() {
		
		return customerService.getCustomers();
	}

	
	  @PostMapping("/customer") 
	  public String  addCustomerDetails(@RequestBody	  Customer customer) {
		    String result= customerService.addCustomer(customer);
		  return  result;
	 
	  }
	
	@PutMapping("/customer1") 
	public Customer updateCustomerDetails(@PathVariable("cid") Integer cid,@RequestBody Customer customer) {
		
		return  customerService.updateCustomer(cid, customer ); 
	}
	
	@DeleteMapping("/customer/{cid}") 
	public Customer deleteCustomerDetails(@PathVariable("cid") Integer cid) {
		
		return  customerService.deleteCustomer(cid);
	}
	@GetMapping("/customer/{cid}")
	public Customer getCustomerById(@PathVariable("cid") Integer cid) {
		return customerService.getCustomerById(cid);
	}
	
}