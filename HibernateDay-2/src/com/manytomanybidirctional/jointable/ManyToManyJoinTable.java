package com.manytomanybidirctional.jointable;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.persistence.HibernateUtil;

public class ManyToManyJoinTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory sf= HibernateUtil.getSessionFactory();
		Session s= sf.openSession();
		Transaction tx= s.beginTransaction();
		
		Previledge p1=new Previledge();
		p1.setName("Car");
		p1.setCost(200000);
		
		
		Previledge p2=new Previledge();
		p2.setName("Trip");
		p2.setCost(100000);
		
		Previledge p3=new Previledge();
		p3.setName("Flat");
		p3.setCost(200000);
		
		Employee emp1=new Employee("Jack", "CEO", 1000000);
		
		Employee emp2=new Employee("Dazy", "Director", 1000000);
				
Set<Previledge> s1=new HashSet<>();
Set<Previledge> s2=new HashSet<>();

s1.add(p1);
s1.add(p2);
s1.add(p3);
s2.add(p1);
s2.add(p2);
emp1.setPreviledge(s1);
emp2.setPreviledge(s2);

s.save(emp1);
s.save(emp2);

System.out.println("Object Saved..");
tx.commit();
s.close();


	}

}
