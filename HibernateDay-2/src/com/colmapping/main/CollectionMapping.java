package com.colmapping.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.colmapping.model.Employee;
import com.persistence.HibernateUtil;

public class CollectionMapping {
	public static void main(String[] args) {
/*Employee emp=new Employee();
Set<String> empSkilss = new HashSet<>();
empSkilss.add("Java");
empSkilss.add("Servlet");
empSkilss.add("Hibernate");
emp.setName("Ravic");
emp.setSkills(empSkilss);
*/		

	SessionFactory sf = HibernateUtil.getSessionFactory();
  Session s= sf.openSession();
 Transaction tx= s.beginTransaction();
 
 //s.save(emp);
 //System.out.println("Object Saved..");

System.out.println("Printing  the object");
 Employee emp= (Employee) s.get(Employee.class,6);
Set<String> techlist=emp.getSkills();
Iterator<String> itr =techlist.iterator();
System.out.println("Empi id "+emp.getEmpid()+" name "+emp.getName());
System.out.println("Skills ");
while(itr.hasNext())
{
	System.out.println(itr.next()+" ");
}
  tx.commit();
 s.close();
 
 
 
  
  
  
		
		// TODO Auto-generated method stub

	}

}
