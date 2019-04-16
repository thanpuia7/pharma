package com.pharma.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharma.demo.entity.Customer;

import com.pharma.demo.repository.CustomerRepository;


@Service
public class CustomerService {

	
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public void addTask(Customer customer) {
		
	}
	
	public List<Customer>  findUserTask(Customer customer){
		
		return customerRepository.findAll();
	}
	
	
	public List<Customer> findByShop(String shop) {
		// TODO Auto-generated method stub
		return  customerRepository.findByShopLike("%"+shop+"%");
	}
}
