package com.onetoonepkfk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.persistence.HibernateUtil;

public class OneToOneMain {

	public static void main(String[] args) {
	SessionFactory sf= HibernateUtil.getSessionFactory();
	Session s= sf.openSession();
	Country ct=new Country();
	HeadOfState hos=new HeadOfState();
	hos.setName("Modi");
	hos.setTitle("Prime Minister");
	ct.setName("India");
   ct.setHos(hos);
Transaction tx= s.beginTransaction();
s.save(ct);
System.out.println("Object Saved...");
tx.commit();
s.close();
   
	}

}
