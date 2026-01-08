package com.tap;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Lunch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Configuration conf=new Configuration();
		conf.configure();
		conf.addAnnotatedClass(Employee.class);
		SessionFactory sessionfactory=conf.buildSessionFactory();
		Session session=sessionfactory.openSession();
		
		
//                  to insert 1 data
		
//		Employee emp=new Employee(1,"tim",20_000,"tim@gmail.com");
//		session.save(emp);
//		Transaction t=session.beginTransaction();
//		t.commit();
		
		
//		          to insert more data

//		System.out.println("enter the number of details");
//		int n=scan.nextInt();
//		for(int i=0;i<=n;i++) {
//			int id=scan.nextInt();
//			String name=scan.next();
//			int salary=scan.nextInt();
//			String email=scan.nextLine();
//			Employee emp=new Employee(id,name,salary,email);
//			session.save(emp);
//			Transaction t=session.beginTransaction();
//			t.commit();
//		}
		
		
//                to get the data
//		Employee e=session.get(Employee.class, 2);
//		System.out.println(e);
		
//		          to update salary
//		Employee e=session.get(Employee.class, 2);
//		e.setSalary(50000);
//		session.save(e);
//		Transaction t=session.beginTransaction();
//		t.commit();
		 
//		             to delete any record
//		Employee e=session.get(Employee.class, 2);
//		session.delete(e);
//		Transaction t=session.getTransaction();
//		t.commit();

		
//		          to get the all details from table
//		   Query quary=session.createQuery("from Employee e");
//		   List list=quary.getResultList();
//		   for(Object o:list) {
//			   System.out.println(o);
//		   }
//		   Transaction t=session.beginTransaction();
//           t.commit();
           
//                     to update the salray by incresing 50000 who has more than 5000
//           Query quary=session.createQuery("update Employee e set e.salary=e.salary+50000 where e.salary>5000");
//           Transaction t=session.beginTransaction();
//           quary.executeUpdate();
//         
//           t.commit();
           
	}

}
