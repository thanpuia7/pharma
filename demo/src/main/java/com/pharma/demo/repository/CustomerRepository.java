package com.pharma.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharma.demo.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	List<Customer> findByShopLike(String shop);

}
