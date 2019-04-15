package com.pharma.demo.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.pharma.demo.entity.Company;
import com.pharma.demo.repository.CompanyRepository;

public class CompanyServices {

	
	@Autowired
	private CompanyRepository companyRepository;
	
	public void addTask(Company company) {
		
	}
	
	public List<Company>  findUserTask(Company company){
		
		return companyRepository.findAll();
	}
	
	
	public List<Company> findByTitle(String title) {
		// TODO Auto-generated method stub
		return  companyRepository.findByTitleLike("%"+title+"%");
	}
	
}
