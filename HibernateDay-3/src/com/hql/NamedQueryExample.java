package com.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.persistence.HibernateUtil;

import oracle.net.aso.q;

public class NamedQueryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	SessionFactory sf= HibernateUtil.getSessionFactory();
		
		Session session= sf.openSession();
		
		
		Transaction tx= session.beginTransaction();
	
		System.out.println("Total Employee Count ");
         Query query= session.getNamedQuery("get_total_emp");
         
         Long empCount =(Long) query.uniqueResult();
         
         System.out.println("Total Emp Count is "+empCount);
         
         System.out.println(" Get Employee By Id  ");
         query= session.getNamedQuery("get_emp_byid");
         query.setInteger("id",16);
         
         Employee emp = (Employee)query.uniqueResult();
         
         System.out.println("Emp Id "+emp.getId()+" Name "+emp.getName()+
        		 emp.getAddress().getCity());
         
         System.out.println(" Get All Employee  ");
         query=session.getNamedQuery("get_all_emp");
         List<Employee> elist = query.list();
         
         for(Employee e: elist)
         {
       System.out.println("Emp Id "+e.getId()+" Name "+e.getName()+
        e.getAddress().getCity());
             	 
         }
         
         
        		 
         
         
		
	}

}
