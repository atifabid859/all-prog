package com.maven;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo {

	public static void main(String[] args) {
		System.out.println("example");

		Configuration con=new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory factory = con.buildSessionFactory();
		//creating a student object
		Student student=new Student();
		student.setId(107);
		student.setName("Akib");
		student.setCityString("luck");
		student.setCerti(new Certifcate("C and C++","10.Month"));
		
		
		Student student1=new Student();
		student1.setId(106);
		student1.setName("Asad");
		student1.setCityString("khalila");
		student1.setCerti(new Certifcate("python and Query","9.Month"));
		
		//student transient
		Session session=factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		session.save(student1);
		//student persistent -session database
		//student.setName("sakib");
	transaction.commit();
		session.close();
		
	}

}
