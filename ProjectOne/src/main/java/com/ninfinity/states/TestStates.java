package com.ninfinity.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ninfinity.states.Student;

public class TestStates {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Kunal");
        s1.setCity("Mumbai");
        
        session.save(s1);
        
        tx.commit();
		session.close();
		sf.close();
	}
}
