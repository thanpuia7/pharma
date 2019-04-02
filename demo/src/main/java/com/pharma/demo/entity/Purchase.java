package com.pharma.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;



@Entity
@Table(name="purchase")
public class Purchase {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private String id;
	
	@NotEmpty(message="Date field should not be empty")
	@Column(name="date")
	private String date;
	
	
	@Column(name="invoice")
	private String invoice;
	
	@Column(name="company")
	private String company;
	
	
	@Column(name="city")
	private String city;
	
	@Column(name="amount")
	private String amount;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Purchase(@NotEmpty(message = "Date field should not be empty") String date, String invoice, String company,
			String city, String amount) {
	
		this.date = date;
		this.invoice = invoice;
		this.company = company;
		this.city = city;
		this.amount = amount;
	}

	public Purchase() {
		
	}

	@Override
	public String toString() {
		return "Purchase [id=" + id + ", date=" + date + ", invoice=" + invoice + ", company=" + company + ", city="
				+ city + ", amount=" + amount + "]";
	}

	public Purchase(String id, @NotEmpty(message = "Date field should not be empty") String date, String invoice,
			String company, String city, String amount) {
		
		this.id = id;
		this.date = date;
		this.invoice = invoice;
		this.company = company;
		this.city = city;
		this.amount = amount;
	}

	
}
