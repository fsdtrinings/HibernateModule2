package com.hql;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.persistence.HibernateUtil;
public class TestData {
	public static void main(String[] args) {
	Session s=HibernateUtil.getSessionFactory().openSession();
		Employee e1=new Employee();
		e1.setName("Mohit");
		e1.setSalary(70000);
		Address a1=new Address();
		a1.setAddressLine1("Ashoak Nagar");
		a1.setCity("DEL");
		e1.setAddress(a1);
		Employee e2=new Employee();
		e2.setName("Amita");
		e2.setSalary(30000);
		Address a2=new Address();
		a2.setAddressLine1("Ashoak  Vihar");
		a2.setCity("GGN");
		e2.setAddress(a2);
		
		Employee e3=new Employee();
		e3.setName("Sumit");
		e3.setSalary(90000);
		Address a3=new Address();
		a3.setAddressLine1("Saket");
		a3.setCity("DEL");
		e3.setAddress(a3);
		
		Transaction tx=s.beginTransaction();
		s.save(e1);
		s.save(e2);
		s.save(e3);
		tx.commit();
		s.close();
		System.out.println("Done..");
		}

}
