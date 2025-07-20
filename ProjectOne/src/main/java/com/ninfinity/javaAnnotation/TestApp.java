package com.ninfinity.javaAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestApp {
	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Person p1 = new Person(7,"Arjun","Pune");
		
		session.save(p1);
		tx.commit();
		session.close();
		sf.close();
	}

}
