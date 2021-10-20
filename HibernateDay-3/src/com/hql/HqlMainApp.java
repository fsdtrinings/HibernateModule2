package com.hql;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.persistence.HibernateUtil;
public class HqlMainApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf= HibernateUtil.getSessionFactory();
		Session s= sf.openSession();
		
		System.out.println("Reading Complete Entity");
		
		Transaction tx= s.beginTransaction();
		
		Query query= s.createQuery("from Employee e");
		@SuppressWarnings("unchecked")
		List<Employee> elist= (List<Employee>) query.list();
		
		for(Employee e:elist){
			
	System.out.println("Eid "+e.getId()+" Name "+e.getName()+
			" City "+e.getAddress().getCity());
			
		}
		
		
		System.out.println("Reading Partial Entity");
		
query=s.createQuery("select e.id,e.name,e.salary ,e.address.city from Employee e");

List emplist1= query.list();

Iterator it= emplist1.iterator();
while (it.hasNext()) {
	Object [] o= (Object[]) it.next();
	System.out.println("Eid "+o[0]+" Name "+o[1] +" Salary "+o[2]+" City "+o[3]);
	
}
		
	System.out.println("Get Employee with id using named Parameter Binding");
	
	query=s.createQuery("from Employee where id= :id");
	query.setLong("id", 18);
	
	Employee emp= (Employee)query.uniqueResult();
	System.out.println("Eid "+emp.getId()+" Name "+emp.getName()+
			" City "+emp.getAddress().getCity());
		
	
	
	
System.out.println("Get Employee with id using Postional Parameter Binding");
	
	query=s.createQuery("from Employee where id= ?");
	query.setLong(0, 18);
	
	Employee emp1= (Employee)query.uniqueResult();
	System.out.println("Eid "+emp1.getId()+" Name "+emp1.getName()+
			" City "+emp1.getAddress().getCity());
	
	
	System.out.println("Update Employee");
	
	query=s.createQuery("update Employee set name=:name where id= :id ");
	query.setString("name","Rita");
	query.setLong("id", 20);
	int res= query.executeUpdate();
	System.out.println("No of rows Updated "+res);
	
	
/*System.out.println("Delet Employee");
	
	query=s.createQuery("delete Employee  where id= :id ");
	query.setLong("id", 20);
	int res1= query.executeUpdate();
	System.out.println("No of row deleted "+res1);
*/
	System.out.println("Sum Salary of Employee");
	
	query=s.createQuery("select sum(e.salary ) from Employee e");
	
	double sumSal= (double) query.uniqueResult();
	
	System.out.println("Total Sal "+sumSal);
	
	
	
	tx.commit();
	s.close();
	

	}

}
