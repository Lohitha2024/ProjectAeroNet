package com.customer.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.dao.CustomerDao;
import com.customer.model.Customer;

import jakarta.transaction.Transactional;
@Service//@Component
@Transactional
public class CustomerService {
	@Autowired
	CustomerDao customerDao;
	public String addCustomer(Customer customer) {
		customerDao.save(customer);
		return "Added";
	}
	public   List<Customer> getCustomers() {
		List<Customer>  customerList=customerDao.findAll();
		return customerList;
	}
	public Customer updateCustomer(Integer cid,Customer customer) {
		Customer customer1=customerDao.findById(cid).get();
		customer1.setAddress(customer.getAddress());
		return customerDao.findById(cid).get();
	}
	public Customer deleteCustomer(Integer cid) {
		Customer customer1=customerDao.findById(cid).get();
		if(customer1!=null)
			customerDao.deleteById(cid);
		return customer1;
		}
	public Customer getCustomerById(Integer cid) {
		Customer customer1=customerDao.findById(cid).get();
		return customer1;
	}
	
	}
