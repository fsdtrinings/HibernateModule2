package com.onetoonepkfkbidrctional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.persistence.HibernateUtil;
public class LoadObject {
	public static void main(String[] args) {
		SessionFactory sf= HibernateUtil.getSessionFactory();
		Session s= sf.openSession();
       HeadOfState hos= (HeadOfState) s.load(HeadOfState.class, 10);
       Country ct= hos.getCountry();
       System.out.println("Cname "+ct.getName()
       +" Head "+hos.getName()+" Title "+hos.getTitle());

	}

}
