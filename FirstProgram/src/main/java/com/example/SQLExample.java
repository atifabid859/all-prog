package com.example;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.maven.Student;

public class SQLExample {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String q = "select * from student";
		NativeQuery createSQLQuery = session.createSQLQuery(q);
		List<Object[]> list = createSQLQuery.list();
		for (Object[] student : list) {
			System.out.println(student[0]+" "+student[4]);
			
		}

	}

}
