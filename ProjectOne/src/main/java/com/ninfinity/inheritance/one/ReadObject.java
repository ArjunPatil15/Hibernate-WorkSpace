package com.ninfinity.inheritance.one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ReadObject {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Employee e1 = session.get(Employee.class, 1);
        
        System.out.println(e1);
        
        Student s1 = session.get(Student.class, 1);
        
        System.out.println(s1);
        
        
//        tx.commit();
		session.close();
		sf.close();
	}

}
