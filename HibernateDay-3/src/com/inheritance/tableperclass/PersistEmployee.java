package com.inheritance.tableperclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.persistence.HibernateUtil;
public class PersistEmployee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf= HibernateUtil.getSessionFactory();
		Session s= sf.openSession();
		
		Transaction tx=s.beginTransaction();
		Person p=new Person("Megha");
		Employee emp=new Employee("Gaurav", "SE",50000L);
		Student std=new Student("Yashika ", "Java",30000);
		
		s.save(p);
		s.save(emp);
		s.save(std);
		
		System.out.println("Object Savedd..");
		tx.commit();
		s.close();
		
		
		
		

	}

}
