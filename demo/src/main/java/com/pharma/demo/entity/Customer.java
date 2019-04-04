package com.pharma.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;



@Entity
@Table(name="customer")
public class Customer {
	

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private Integer id;
		
		@NotEmpty(message="Shop field should not be empty")
		@Column(name="shop")
		private String shop;
		
		
		@Column(name="email")
		private String email;
		
		@Column(name="contact_person")
		private String contact_person;
		
		
		@Column(name="phone")
		private String phone;
		
		@Column(name="address")
		private String address;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getShop() {
			return shop;
		}

		public void setShop(String shop) {
			this.shop = shop;
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

		public Customer(@NotEmpty(message = "Shop field should not be empty") String shop, String email,
				String contact_person, String phone, String address) {
			
			this.shop = shop;
			this.email = email;
			this.contact_person = contact_person;
			this.phone = phone;
			this.address = address;
		}

		public Customer(@NotEmpty(message = "Name field should not be empty") Integer id,
				@NotEmpty(message = "Shop field should not be empty") String shop, String email, String contact_person,
				String phone, String address) {
			
			this.id = id;
			this.shop = shop;
			this.email = email;
			this.contact_person = contact_person;
			this.phone = phone;
			this.address = address;
		}

		public Customer() {
		
		}

		@Override
		public String toString() {
			return "Customer [id=" + id + ", shop=" + shop + ", email=" + email + ", contact_person=" + contact_person
					+ ", phone=" + phone + ", address=" + address + "]";
		}


}
