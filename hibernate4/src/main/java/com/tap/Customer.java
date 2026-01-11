package com.tap;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @Column(name="id")
    private int id;
    
    @Column(name="name")
    private String name;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="cid")
    private Customer_details cd_id;
    
    @OneToMany(mappedBy="cust_id",cascade=CascadeType.ALL)
    private List<Orders> orders;//to get the list of orders 
    
    public Customer() {
        // Default constructor
    }

    public Customer(int id, String name, Customer_details cd_id) {
        super();
        this.id = id;
        this.name = name;
        this.cd_id = cd_id;
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

    public Customer_details getCd_id() {
        return cd_id;
    }

    public void setCd_id(Customer_details cd_id) {
        this.cd_id = cd_id;
    }

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	public List<Orders> getOrders() {
		return orders;
	}
    
    
}
