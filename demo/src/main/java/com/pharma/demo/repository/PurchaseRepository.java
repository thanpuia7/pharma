package com.pharma.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharma.demo.entity.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, String> {

}
