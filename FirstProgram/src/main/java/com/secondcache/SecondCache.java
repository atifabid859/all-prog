package com.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.maven.Student;






public class SecondCache {
public static void main(String[] args) {

	

	
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	//first level cache
	Student student = session.get(Student.class,1);
	System.out.println(student);
	session.close();
	Session session2 = factory.openSession();
	//second level cache
	Student student1 = session.get(Student.class,1);
	System.out.println(student1);
	session2.close();
}
}
