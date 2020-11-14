package com.testjoins.jpajoins.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testjoins.jpajoins.model.Customer;
import com.testjoins.jpajoins.repository.CustomerRepository;
import com.testjoins.jpajoins.repository.ProductRepository;

@RestController
@RequestMapping("/cust") 
public class OrderController {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private ProductRepository productRepo;

	@PostMapping("/placeorder")
	public Customer PlceOrder(@RequestBody Customer Customer) {
		return customerRepo.save(Customer);
	}
	
	@GetMapping("/getallcust")
	public List<Customer> GetAllCustomers(){
		return customerRepo.findAll();
	}
	
}
