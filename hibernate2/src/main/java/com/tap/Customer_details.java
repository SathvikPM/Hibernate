package com.tap;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer_detals")
public class Customer_details {
     @Id
	 @Column(name="id")
	 private int id;
	 @Column(name="email")
	 private String email;
	 @Column(name="phone")
	 private int phone;
	 
	 public Customer_details() {
		// TODO Auto-generated constructor stub
	}
	 public Customer_details(int id, String email, int phone) {
			super();
			this.id = id;
			this.email = email;
			this.phone = phone;
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer_details [id=" + id + ", name=" + email + ", phone=" + phone + "]";
	}
   
	
	
}
