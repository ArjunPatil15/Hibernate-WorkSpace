package com.ninfinity.ProjectOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestApp {
	public static void main(String[] args) {
		 System.out.println( "Hello World!" );
	        Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory sf = cfg.buildSessionFactory();
	        
	        Session session = sf.openSession();
	        Transaction tx = session.beginTransaction();
	        
	        Student s1 = new Student (5,"Karan","Mumbai");
	        
	        session.save(s1);
	        
	        tx.commit();
	        session.close();
	        sf.close();
	        
	}

}
