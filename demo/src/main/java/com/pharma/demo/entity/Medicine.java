package com.pharma.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;



@Entity
@Table(name="medicine")
public class Medicine {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@NotEmpty(message="Name field should not be empty")
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

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
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

	
	
	
	
	
	
	public Medicine(@NotEmpty(message = "Name field should not be empty") String name, String packing, String packagee,
			String company, String manufacturer, String hSNCode, String hSNValue) {
		
		this.name = name;
		this.packing = packing;
		this.packagee = packagee;
		this.company = company;
		this.manufacturer = manufacturer;
		HSNCode = hSNCode;
		HSNValue = hSNValue;
	}

	
	
	
	
	
	
	public Medicine(Integer id, @NotEmpty(message = "Name field should not be empty") String name, String packing,
			String packagee, String company, String manufacturer, String hSNCode, String hSNValue) {
	
		this.id = id;
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
		return "Medicine [id=" + id + ", name=" + name + ", packing=" + packing + ", packagee=" + packagee
				+ ", company=" + company + ", manufacturer=" + manufacturer + ", HSNCode=" + HSNCode + ", HSNValue="
				+ HSNValue + "]";
	}


	
	
	
	
	
}
