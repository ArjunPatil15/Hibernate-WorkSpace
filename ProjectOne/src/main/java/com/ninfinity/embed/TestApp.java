package com.ninfinity.embed;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestApp {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
		
		Course c1 = new Course("Java", "3 Months");
		
		Student s1 = new Student(1, "Arjun", "Pune", c1);
		
		session.save(s1);
		tx.commit();
		session.close();
		sf.close();
	}

}
