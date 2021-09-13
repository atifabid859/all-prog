package com.mapdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mapdemo.Person;
@SuppressWarnings("unused")
public class PersonDemo {

	public static void main(String[] args) {
		
System.out.println("get start the program");

Configuration conf=new Configuration();
SessionFactory factory=conf.buildSessionFactory();

Person person=new Person();
person.setId(101);
person.setName("sakib");
person.setAddress("sakinaka");
person.setPhone("9565552012");
Session session = factory.openSession();
Transaction transaction = session.beginTransaction();

transaction.commit();
session.close();

	}

}
