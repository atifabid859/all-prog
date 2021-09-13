package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany {

	public static void main(String[] args) {
		System.out.println("get start project");
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory factory=con.buildSessionFactory();
		Emp e1=new Emp();
		Emp e2=new Emp();
		e1.setEid(12);
		e1.setName("Atif");
		e2.setEid(13);
		e2.setName("sakib");
		Project p1=new Project();
		Project p2=new Project();
p1.setPid(99);
p1.setProjectname("Library Management System");
p2.setPid(100);
p2.setProjectname("Room Management System");

List<Emp> list1=new ArrayList<Emp>();
List<Project> list2=new ArrayList<Project>();
list1.add(e1);
list1.add(e2);

list2.add(p1);
list2.add(p2);

e1.setProjects(list2);
p1.setEmps(list1);

Session session = factory.openSession();
Transaction transaction = session.beginTransaction();
session.save(e1);
session.save(p1);
transaction.commit();
session.close();
	}

}
