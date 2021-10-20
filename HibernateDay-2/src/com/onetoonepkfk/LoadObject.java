package com.onetoonepkfk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.persistence.HibernateUtil;

public class LoadObject {
	public static void main(String[] args) {
		SessionFactory sf= HibernateUtil.getSessionFactory();
		Session s= sf.openSession();
       Country ct= (Country) s.load(Country.class, 7);
       HeadOfState hos= ct.getHos();
       System.out.println("Cname "+ct.getName()
       +" Head "+hos.getName()+" Title "+hos.getTitle());

	}

}
