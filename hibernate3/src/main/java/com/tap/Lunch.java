package com.tap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Lunch {

	public static void main(String[] args) {
		  
		Configuration conf=new Configuration();
		conf.configure();
		conf.addAnnotatedClass(Customer.class);
		conf.addAnnotatedClass(Customer_details.class);
		conf.addAnnotatedClass(Orders.class);
		
	    SessionFactory sf=conf.buildSessionFactory();
	    Session session=sf.openSession();
	    Transaction tns=session.beginTransaction();	
	    //one customer
	    Customer_details cd=new Customer_details(7,"swamy@gmail.com",87625);
	    Customer c=new Customer(95,"swamy",cd);
	    
	  
	    //many orders
	    Orders o1=new Orders(9,"biriyani",20,c);
	    Orders o2=new Orders(10,"curry",150,c);
	    
	    session.save(o1);
	    session.save(o2);
	    
	    
	    tns.commit();
	    
	    
	    
		

	}

}
