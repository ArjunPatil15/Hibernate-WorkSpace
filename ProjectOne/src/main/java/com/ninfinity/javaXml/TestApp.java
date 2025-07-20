package com.ninfinity.javaXml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestApp {
	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session session = sf.openSession();
		
		Employee e1 = new Employee(3, "Rahul", "Google");
		
		Transaction tx = session.beginTransaction();
		
		session.save(e1);
		tx.commit();
		session.close();
		sf.close();
	}

}
