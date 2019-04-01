package com.pharma.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;



@Entity
@Table(name="medicine")
public class Medicine {


	
	@NotEmpty(message="Title field should not be empty")
	@Column(name="name")
	private String name;
	
	
	@Column(name="packing")
	private String packing;
	
	@Column(name="packagee")
	private String packagee;
	
	
	@Column(name="company")
	private String company;
	
	@Column(name="manufacturer")
	private String manufacturer;
	
	@Column(name="HSNCode")
	private String HSNCode;
	
	@Column(name="HSNValue")
	private String HSNValue;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPacking() {
		return packing;
	}

	public void setPacking(String packing) {
		this.packing = packing;
	}

	public String getPackagee() {
		return packagee;
	}

	public void setPackagee(String packagee) {
		this.packagee = packagee;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getHSNCode() {
		return HSNCode;
	}

	public void setHSNCode(String hSNCode) {
		HSNCode = hSNCode;
	}

	public String getHSNValue() {
		return HSNValue;
	}

	public void setHSNValue(String hSNValue) {
		HSNValue = hSNValue;
	}

	public Medicine() {
		
	}

	public Medicine(@NotEmpty(message = "Title field should not be empty") String name, String packing, String packagee,
			String company, String manufacturer, String hSNCode, String hSNValue) {
		
		this.name = name;
		this.packing = packing;
		this.packagee = packagee;
		this.company = company;
		this.manufacturer = manufacturer;
		HSNCode = hSNCode;
		HSNValue = hSNValue;
	}

	@Override
	public String toString() {
		return "Medicine [name=" + name + ", packing=" + packing + ", packagee=" + packagee + ", company=" + company
				+ ", manufacturer=" + manufacturer + ", HSNCode=" + HSNCode + ", HSNValue=" + HSNValue + "]";
	}
	
	
	
	
	
	
}
