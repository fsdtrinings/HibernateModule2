

package com.onetoonepkfkbidrctional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.onetoonepkfkbidrctional.Country;
import com.onetoonepkfkbidrctional.HeadOfState;
import com.persistence.HibernateUtil;
public class OneToneMainApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*create a Main class perssit the object using
		 *  country object and 
		select the object using HeadOfState object
*/

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
