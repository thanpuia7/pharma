package com.pharma.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharma.demo.entity.Stock;

public interface StockRepository extends JpaRepository<Stock, String> {

}
