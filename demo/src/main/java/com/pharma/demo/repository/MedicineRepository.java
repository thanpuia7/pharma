package com.pharma.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharma.demo.entity.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, String> {

}
