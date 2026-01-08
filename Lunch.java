package com.tap;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Lunch {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Customer.class);
		cfg.addAnnotatedClass(Customer_details.class);
		Session session=cfg.buildSessionFactory().openSession();
		Transaction t=session.beginTransaction();
//		    to add the detalis
//		Customer_details cd=new Customer_details(1,"bob@gmail.com",8762567);
//		Customer c=new Customer(91,"bob",cd);
//		session.save(c);
//		t.commit();
		
//		   to get the deails
		Customer_details cd=new Customer_details(2,"bob@gmail.com",8762567);
		Customer c=new Customer(92,"bob",cd);
		System.out.println(cd);
		System.out.println(c);
		session.save(c);
		t.commit();
		
		

	}

}
