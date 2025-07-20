package com.ninfinity.testCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class WriteObject {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Developer d1 = new Developer(1, "Ram", "Java");
        
        Developer d2 = new Developer(2, "Kunal", "Cpp");
        
        Developer d3 = new Developer(3, "Soham", "Python");
        
        Developer d4 = new Developer(4, "Rohit", "ML");
        
        session.save(d1);
        session.save(d2);
        session.save(d3);
        session.save(d4);
        
        
        tx.commit();
		session.close();
		sf.close();
	}

}
