package com.infogain.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.infogain.model.Employee;

public class XmlConfigMainApp {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.seteId(101);
		emp.setName("Ravic");
		emp.setAddress("Noida");
		
		//Employee emp=new Employee("Deepak", "Delhi");

		
Configuration cfg= new Configuration().configure("hibernate.cfg.xml");
// Creating Session Factory Object
SessionFactory sf= cfg.buildSessionFactory();
//Creating Session  Object
Session s= sf.openSession();
//Creating Transaction Object
Transaction tx= s.beginTransaction();
// Save an object of employee
s.save(emp);
System.out.println("Employee Saved..");
tx.commit();
s.close();
	}

}
