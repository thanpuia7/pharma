package com.pharma.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharma.demo.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
