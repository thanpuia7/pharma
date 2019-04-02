package com.pharma.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="sales")
public class Sales {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private String id;
	
	@NotEmpty(message="Customer field should not be empty")
	@Column(name="customer")
	private String customer;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Column(name="phone")
	private String phone;
	
	@Column(name="mode")
	private String mode;
	
	
	@Column(name="reference")
	private String reference;
	
	@Column(name="payment")
	private String payment;
	
	@Column(name="date")
	private String date;

	
	
	
	public Sales(@NotEmpty(message = "Customer field should not be empty") String customer, String phone, String mode,
			String reference, String payment, String date) {
		
		this.customer = customer;
		this.phone = phone;
		this.mode = mode;
		this.reference = reference;
		this.payment = payment;
		this.date = date;
	}

	public Sales(String id, @NotEmpty(message = "Customer field should not be empty") String customer, String phone,
			String mode, String reference, String payment, String date) {
	
		this.id = id;
		this.customer = customer;
		this.phone = phone;
		this.mode = mode;
		this.reference = reference;
		this.payment = payment;
		this.date = date;
	}


}
