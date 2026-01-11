package com.tap;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Orders")
public class Orders {
    
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="prize")
	private int prize;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id")
	private Customer cust_id; 
	
	

	
	public Orders() {
		// TODO Auto-generated constructor stub
	}

	public Orders(int id, String name, int prize, Customer cust_id) {
	
		this.id = id;
		this.name = name;
		this.prize = prize;
		this.cust_id = cust_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	public Customer getCust_id() {
		return cust_id;
	}

	public void setCust_id(Customer cust_id) {
		this.cust_id = cust_id;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", name=" + name + ", prize=" + prize +  "]";
	}
	
	
	
}
