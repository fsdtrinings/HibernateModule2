package com.onetomanypkfk;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.persistence.HibernateUtil;

public class OneToMantyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trainer t1=new Trainer();
		t1.setName("Ravic");

		Trainer t2=new Trainer();
		t2.setName("Amita");
		
		Batch b1=new Batch("9 to 12", "w/e");
		Batch b2=new Batch("12 to 3", "w/e");
		Batch b3=new Batch("10 to 12", "w/d");
		Batch b4=new Batch("3 to 6", "w/d");
		
		SessionFactory sf= HibernateUtil.getSessionFactory();
		Session s=sf.openSession();
		
		Transaction tx= s.beginTransaction();
		
		Set<Batch> batch1=new HashSet<>();
		Set<Batch> batch2=new HashSet<>();
		batch1.add(b1);
		batch1.add(b2);
		batch2.add(b3);
		batch2.add(b4);
		
		t1.setBatches(batch1);
		t2.setBatches(batch2);
		
		s.save(t1);
		s.save(t2);
		
		System.out.println("Object saved...");
		
		tx.commit();
		s.close();
		
		
		
		
		
		
	}

}
