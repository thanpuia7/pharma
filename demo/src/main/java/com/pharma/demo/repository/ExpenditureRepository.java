package com.pharma.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharma.demo.entity.Expenditure;

public interface ExpenditureRepository extends JpaRepository<Expenditure, String> {

}
