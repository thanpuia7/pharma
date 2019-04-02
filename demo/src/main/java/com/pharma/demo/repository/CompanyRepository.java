package com.pharma.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharma.demo.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
