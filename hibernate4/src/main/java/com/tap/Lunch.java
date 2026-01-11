package com.tap;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Lunch {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Customer_details.class);
		cfg.addAnnotatedClass(Customer.class);
		cfg.addAnnotatedClass(Orders.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tns=session.beginTransaction();
	
		//to get the details orders
//		Orders o1=session.get(Orders.class, 5);
//		System.out.println(o1);
		
		//to get the customer from orders
//		Customer c=o1.getCust_id();
//		System.out.println(c);
		
		//to get the customer_dtails from customer
//		Customer_details cd=c.getCd_id();
//		System.out.println(cd);
		
        //to see the customer who order the items
//		Customer c1=session.get(Customer.class, 94);
//		System.out.println(c1);
//		
//		List orders=c1.getOrders();
//		
//		for(Object o:orders) {
//			System.out.println(o);
//		}
//	
//		to delete the cutomer-it will delete in all the tables
		
		
//		Customer c=session.get(Customer.class, 93);
//		System.out.println(c);
//		
//		session.delete(c);
//		tns.commit();
	}	

}
