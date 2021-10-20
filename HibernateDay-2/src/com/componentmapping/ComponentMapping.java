package com.componentmapping;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.persistence.HibernateUtil;

public class ComponentMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session s= HibernateUtil.getSessionFactory().openSession();
		Address add=new Address("Noida", "UP");
		Emp e=new Emp("Ravic",add);
		Transaction tx= s.beginTransaction();
		s.save(e);
		System.out.println("Object Saved...");
		tx.commit();
		s.close();
		

	}

}
