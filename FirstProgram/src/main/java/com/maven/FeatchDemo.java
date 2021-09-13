package com.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FeatchDemo {
/**
 * @param args
 */
public static void main(String[] args) {
	Configuration conf=new Configuration();
	conf.configure("hibernate.cfg.xml");
	SessionFactory factory=conf.buildSessionFactory();
	Session session = factory.openSession();
//	Student student=(Student)session.get(Student.class,106);
//	System.out.println(student);
//	Student student1=(Student)session.get(Student.class,106);
//	System.out.println(student1);
	
//	Address address=(Address)session.load(Address.class,1);
//	System.out.println(address.getCity()+""+address.getStreet());
//
//	Address address1=(Address)session.load(Address.class,1);
//	System.out.println(address1.getCity()+""+address1.getStreet());
	session.close();
	
}
}
