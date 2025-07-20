package com.ninfinity.ProjectOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadObject {
	public static void main(String[] args) {
		System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Student s1 = session.get(Student.class, 7);
        
        System.out.println(s1);
        
        Student s2 = session.load(Student.class, 5);
        
        Student s3 = session.load(Student.class, 3);
        
        Student s4 = session.load(Student.class, 4);
        
        System.out.println(s4.getName());
	}
}
