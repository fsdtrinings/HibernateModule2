package com.infogain.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.infogain.model.Customer;
import com.infogain.persistence.HibernateUtil;

public class AnnotaionConfigCrudApp {

	public static void main(String[] args) {
//  Getting Object of SeseeionFactory using AnnotationConfiguration class
	//SessionFactory sf= new AnnotationConfiguration().configure()
		//		.buildSessionFactory();

SessionFactory sf= HibernateUtil.getSessionFactory();
Session session= sf.openSession();
 
 Transaction tx= session.beginTransaction();
 Customer cust= new Customer();
 cust.setCustomerName("Sunita Verma");
 cust.setCustomerAddress("Noida");
 session.save(cust);
  System.out.println("Customer Saved..");
    tx.commit();  // Tranasction commited
		/*
		 * 
		 * System.out.println("Loding an entity using load method"); Customer cust =
		 * (Customer) session.load(Customer.class, 5);
		 * System.out.println("Cust_Id"+cust.getCustomerId()+" Name "+cust.
		 * getCustomerName()+ "Add"+cust.getCustomerAddress());
		 */
 
 /*
 System.out.println("Loding an entity using get method");
 Customer cust = (Customer) session.get(Customer.class, 5);
 
 System.out.println("Cust_Id"+cust.getCustomerId()+" Name "+cust.getCustomerName()+
	 "Add"+cust.getCustomerAddress());
*/ 
 
 //Transaction tx= session.beginTransaction();
  // First way of Updating
 /*
 Customer cust = (Customer) session.get(Customer.class, 5);
 cust.setCustomerName("Shiva");
 cust.setCustomerAddress("BLR");
 tx.commit();
 System.out.println("Record Updated...");
 */
 
 /*Customer cust =new Customer();
 cust.setCustomerId(5);
 cust.setCustomerName("Shri");
 cust.setCustomerAddress("GGN");
 session.update(cust);
  tx.commit();
*/ 
 
// 
// 
//Customer cust = (Customer) session.get(Customer.class, 5);
//session.delete(cust);
//System.out.println("Record Deleted...");
//tx.commit();
// 
 
 
 
 
 
 session.close();  // Close session
 
 
 
 
 
 
 
	
	
	}

}
