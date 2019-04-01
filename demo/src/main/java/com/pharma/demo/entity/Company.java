package com.pharma.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;



@Entity
@Table(name="company")
public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotEmpty(message="Name field should not be empty")
	@Column(name="id")
	private String id;
	
	@NotEmpty(message="Title field should not be empty")
	@Column(name="title")
	private String name;
	
	
	@Column(name="email")
	private String email;
	
	@Column(name="contact_person")
	private String contact_person;
	
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="address")
	private String address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact_person() {
		return contact_person;
	}

	public void setContact_person(String contact_person) {
		this.contact_person = contact_person;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Company(@NotEmpty(message = "Name field should not be empty") String id,
			@NotEmpty(message = "Name field should not be empty") String name, String email, String contact_person,
			String phone, String address) {
	
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact_person = contact_person;
		this.phone = phone;
		this.address = address;
	}

	public Company(@NotEmpty(message = "Name field should not be empty") String name, String email,
			String contact_person, String phone, String address) {
		
		this.name = name;
		this.email = email;
		this.contact_person = contact_person;
		this.phone = phone;
		this.address = address;
	}

	public Company() {
		
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", email=" + email + ", contact_person=" + contact_person
				+ ", phone=" + phone + ", address=" + address + "]";
	}
	

	
	
}

	
	
	


