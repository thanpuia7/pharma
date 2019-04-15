package com.pharma.demo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.pharma.demo.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

	
	
	List<Company> findByTitleLike(String title);
}
