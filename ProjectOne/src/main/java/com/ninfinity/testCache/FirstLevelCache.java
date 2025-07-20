package com.ninfinity.testCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FirstLevelCache {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Developer developer = session.get(Developer.class, 3);
        System.out.println(developer);
        
        Developer developer2 = session.get(Developer.class, 3);
        System.out.println(developer2);
        
        
        //tx.commit();
		session.close();
		// detached state
		
		// New Session created
		Session session2 = sf.openSession();
		
		Developer developer3 = session2.get(Developer.class, 3);
		System.out.println(developer3);
        
		
		sf.close();
	}

}
