package com.ninfinity.HQLSQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class ReadUsingSQL {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        String sql = "select * from teacher";
        NativeQuery nq = session.createSQLQuery(sql);
        
        List<Object[]> tList = nq.list();
        
        for(Object[] ob : tList) {
        	System.out.println(Arrays.toString(ob));
        }
        
        session.close();
		sf.close();
	}
}
