package com.hql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.persistence.HibernateUtil;

public class HCQLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf= HibernateUtil.getSessionFactory();
		
		Session session= sf.openSession();
		
		
		Transaction tx= session.beginTransaction();
			
		System.out.println("****Get All Employess ****");
		
		Criteria ct=session.createCriteria(Employee.class);
		List<Employee> emplist= (List<Employee>)ct.list();
		for(Employee e:emplist)
		{
			System.out.println("Id "+e.getId()+" Name "+e.getName()+
					"Sal "+e.getSalary()+" City "+e.getAddress().getCity());
		}
			
		
		System.out.println("****Get Employe  with given id ****");
		
		
		ct=session.createCriteria(Employee.class);
		
	Criterion  c= Restrictions.eq("id",  new Long(16));
	ct.add(c);
	
	Employee emp= (Employee) ct.uniqueResult();
		
	System.out.println("Id "+emp.getId()+" Name "+emp.getName()+
			"Sal "+emp.getSalary()+" City "+emp.getAddress().getCity());
	
	System.out.println("****Projection on Single Properties****");
	
	ct=session.createCriteria(Employee.class);
	Projection  p= Projections.property("name");
	ct.setProjection(p);
	
	List<String>  nameList = ct.list();
	
	
	for(String n:nameList)
	{
		System.out.println(" List Employee Name "+n+" ");
	}
	
	
	System.out.println("****Projection on Multiple Properties****");
	ct= session.createCriteria(Employee.class);
	
	ProjectionList plist= Projections.projectionList();
	
	plist.add(Projections.property("name"));
	plist.add(Projections.property("salary"));
	ct.setProjection(plist);
	List list= ct.list();
	Iterator it= list.iterator();
	while(it.hasNext())
	{
	Object[] o= (Object[]) it.next();
	System.out.println("Emp Name "+o[0]+" Salary "+o[1]);
	}
	
	System.out.println("Using Projection for Sum ");
	
	Double sal= (Double) session.createCriteria(Employee.class)
			.setProjection(Projections.sum("salary")).uniqueResult();
	
	System.out.println("Sum Salary "+sal);
	
	
	System.out.println(" Sort the Employee using orderBy ");
	
	ct=session.createCriteria(Employee.class);
	
	Criterion cn=Restrictions.gt("salary", new Double(30000));
	ct.add(cn);
	ct.addOrder(Order.asc("salary"));
	
	List<Employee>  el=ct.list();
	
	for(Employee e:el)
	{
		System.out.println("Id "+e.getId()+" Name "+e.getName()+
				"Sal "+e.getSalary()+" City "+e.getAddress().getCity());
			
	}
	
	
	System.out.println("Pagaination Example  ");
	
	List<Employee> elsist= session.createCriteria(Employee.class)
			.setFirstResult(1).setMaxResults(3).list();
	for(Employee ex:elsist)
	{
		System.out.println("Id "+ex.getId()+" Name "+ex.getName()+
				"Sal "+ex.getSalary()+" City "+ex.getAddress().getCity());
			
	}
	
		tx.commit();
		session.close();
		
		
		
		

	}

}
