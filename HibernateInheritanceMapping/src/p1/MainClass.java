package p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainClass {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session hibernate = factory.openSession();
		
		
		
		Account sa = new SavingAccount();
		sa.setAccountHolderName("Ramesh");
		sa.setAccountNumber(123);
		sa.setBalance(8000);
		((SavingAccount)sa).setInterestAmount(500);
		
		
		Account ca = new CurrentAccount();
		ca.setAccountHolderName("Neha");
		ca.setAccountNumber(101);
		ca.setBalance(18000);
		((CurrentAccount)ca).setGstNumber(1536545);
		
		
		Transaction t = hibernate.beginTransaction();
		hibernate.save(sa);
		hibernate.save(ca);
		
		
		t.commit();
		hibernate.close();
		
	}//end main

}// end class
