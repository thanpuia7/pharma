package com.pharma.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharma.demo.entity.Sales;

public interface SalesRepository extends JpaRepository<Sales, String> {

}
